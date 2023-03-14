/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Service;

import com.example.abcde.Entity.Domicilio;
import com.example.abcde.Repository.BaseRepository;
import com.example.abcde.Repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class DomicilioServiceImpl implements DomicilioService {

    @Autowired DomicilioRepository domicilioRepo;
    
    @Override
    public List<Domicilio> verDomicilio() {
        List<Domicilio>domicilio = domicilioRepo.findAll();
        return domicilio;
    }

    @Override
    public void crearDomicilio(Domicilio dom) {
        domicilioRepo.save(dom);
    }

    @Override
    public void borrarDomicilio(Long domId) {
        domicilioRepo.deleteById(domId);
    }

    @Override
    public Domicilio buscarDomicilio(Long domId) {
        Domicilio dom = domicilioRepo.findById(domId).orElse(null);
        return dom;
    }
    
    
    
}
