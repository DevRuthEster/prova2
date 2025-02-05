/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GPE;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07014437151
 */
@Service
public class ModalidadeService {

    @Autowired
    private ModalidadeRepository modalidadeRepository;

    @Transactional
    public Modalidade saveModalidade(Modalidade modalidade) {
        return modalidadeRepository.save(modalidade);
    }

    @Transactional
    public List<Modalidade> getAllModalidades() {
        return modalidadeRepository.findAll();
    }

    @Transactional
    public Modalidade getModalidadeById(Long id) {
        return modalidadeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteModalidade(Long id) {
        modalidadeRepository.deleteById(id);
    }
}

