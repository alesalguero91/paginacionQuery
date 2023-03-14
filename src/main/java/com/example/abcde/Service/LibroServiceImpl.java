/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Service;

import com.example.abcde.Entity.Libro;
import com.example.abcde.Repository.BaseRepository;
import com.example.abcde.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    
    @Autowired
    LibroRepository libroRepository;
    
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
    
    
}
