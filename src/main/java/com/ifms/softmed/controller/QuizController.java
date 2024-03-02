package com.ifms.softmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.softmed.domain.model.Pergunta;
import com.ifms.softmed.domain.model.RespostaUsuario;
import com.ifms.softmed.repositories.PerguntaRepository;
import com.ifms.softmed.services.PerguntaService;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private PerguntaService perguntaService;

    @GetMapping("/perguntas")
    public List<Pergunta> obterTodasPerguntas() {
        return perguntaRepository.findAll();
    }

    @PostMapping("/responder")
    public boolean responderPergunta(@RequestBody RespostaUsuario respostaUsuario) {

        Pergunta pergunta = perguntaRepository.findById(respostaUsuario.getPerguntaId()).orElse(null);

        if (pergunta != null) {
            return pergunta.getRespostaCorreta() == respostaUsuario.getRespostaSelecionada();
        }

        return false;
    }

    @PostMapping("/criarPergunta")
    public Pergunta criarPergunta(@RequestBody Pergunta pergunta) {

        return perguntaService.criarPergunta(pergunta);
        
    }

}
