package com.ifms.softmed.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.Administrator;
import com.ifms.softmed.domain.model.Pessoa;
import com.ifms.softmed.dto.AdministratorDTO;
import com.ifms.softmed.repositories.AdministratorRepository;
import com.ifms.softmed.repositories.PessoaRepository;
import com.ifms.softmed.services.exceptions.DataIntegrityViolationException;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository repository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public List<Administrator> findAll() {
        return repository.findAll();
    }

    public Administrator create(AdministratorDTO objDTO) {
        objDTO.setId(null);
        objDTO.setSenha(encoder.encode(objDTO.getSenha()));
        ValidaPorEmail(objDTO);
        Administrator newObj = new Administrator(objDTO);
        return repository.save(newObj);
    }

    private void ValidaPorEmail(AdministratorDTO objDto) {

        Optional<Pessoa> obj = pessoaRepository.findByEmail(objDto.getEmail());

        if (obj.isPresent() && obj.get().getId() != objDto.getId()) {
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
        }
    }
}
