package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.LongBinaryOperator;
//Cria uma interface nomeRepository que extends JpaRepository<Classe que quero que escaneie, tipo de dado do ID *Long*>
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
