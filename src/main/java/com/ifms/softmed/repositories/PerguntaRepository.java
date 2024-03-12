package com.ifms.softmed.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifms.softmed.domain.enums.Especialidade;
import com.ifms.softmed.domain.model.Pergunta;


@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {


    List<Pergunta> findByEspecialidade(Especialidade especialidade);

}

