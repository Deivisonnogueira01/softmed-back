package com.ifms.softmed.services.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ifms.softmed.domain.model.Pessoa;
import com.ifms.softmed.repositories.PessoaRepository;
import com.ifms.softmed.security.UserSS;
import com.ifms.softmed.services.exceptions.SenhaInvalidaException;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    
    @Autowired
    private PessoaRepository repository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<Pessoa> user = repository.findByEmail(email);
        if (user.isPresent()) {
            return new UserSS(user.get().getId(), user.get().getEmail(), user.get().getSenha(), user.get().getPerfis());
        }
        throw new UsernameNotFoundException(email);
    }

}
