/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Service;

import com.example.abcde.Entity.Domicilio;
import com.example.abcde.Entity.Persona;
import com.example.abcde.Repository.BaseRepository;
import com.example.abcde.Repository.DomicilioRepository;
import com.example.abcde.Repository.PersonaRepository;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
   private DomicilioRepository domicilioRepository;
    
    public PersonaServiceImpl(BaseRepository <Persona, Long>baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //List<Persona>personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Persona>personas= personaRepository.search(filtro);
            List<Persona>personas= personaRepository.search(filtro);
            
            return personas;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona>personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Persona>personas= personaRepository.search(filtro, pageable);
            Page<Persona>personas= personaRepository.search(filtro, pageable);
            
            return personas;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Persona personaADomicilio(Long id, Long domId) {
//        List<Domicilio>domicilioSet = null;
        Set<Domicilio>domicilioSet= null;
        
        
        Persona persona = personaRepository.findById(id).get();
        Domicilio domicilio = domicilioRepository.findById(domId).get();
        domicilioSet = persona.getDomicilio();
        domicilioSet.add(domicilio);
        persona.setDomicilio(domicilioSet);
        return personaRepository.save(persona);
    }

   
    
   
    
}
