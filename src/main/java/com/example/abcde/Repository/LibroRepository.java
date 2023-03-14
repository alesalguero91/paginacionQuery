/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Repository;

import com.example.abcde.Entity.Libro;
import org.springframework.stereotype.Repository;

/**
 *
 * @author salguero
 */
@Repository
public interface LibroRepository extends BaseRepository <Libro, Long>{
    
}
