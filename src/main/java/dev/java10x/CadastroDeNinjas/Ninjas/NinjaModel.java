package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe comum em uma entitade no banco de dados
//JPA = Java Persistency API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

@Column(unique = true)
    private String email;

    private int idade;

    //@ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "Missoes_id") // Foreign Key
    private MissoesModel missoes;

}