package com.ifms.softmed.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.Aluno;
import com.ifms.softmed.domain.model.Pessoa;
import com.ifms.softmed.dto.AlunoDTO;
import com.ifms.softmed.repositories.AlunoRepository;
import com.ifms.softmed.repositories.PessoaRepository;
import com.ifms.softmed.services.exceptions.DataIntegrityViolationException;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository repository;

     @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;


   public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Aluno create(AlunoDTO objDTO) {
        objDTO.setId(null);
        objDTO.setSenha(encoder.encode(objDTO.getSenha()));
        ValidaPorEmail(objDTO);
        Aluno newObj = new Aluno(objDTO);
        return repository.save(newObj);
    }

    private void ValidaPorEmail(AlunoDTO objDto) {

        Optional<Pessoa> obj = pessoaRepository.findByEmail(objDto.getEmail());

        if (obj.isPresent() && obj.get().getId() != objDto.getId()) {
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
        }
    }

}
