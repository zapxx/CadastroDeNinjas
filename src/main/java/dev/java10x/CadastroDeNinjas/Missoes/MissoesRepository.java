package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.LongBinaryOperator;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
