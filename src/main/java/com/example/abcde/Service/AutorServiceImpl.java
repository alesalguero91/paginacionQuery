/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Service;

import com.example.abcde.Entity.Autor;
import com.example.abcde.Repository.AutorRepository;
import com.example.abcde.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired 
    private AutorRepository autorRepository;
    
    public AutorServiceImpl(BaseRepository <Autor, Long>baseRepository){
        super(baseRepository);
    }

    @Override
    public Page<Autor> findAll(Pageable page) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
