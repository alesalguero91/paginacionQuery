/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Service;

import com.example.abcde.Entity.Domicilio;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface DomicilioService {
    
    public List<Domicilio>verDomicilio();
    public void crearDomicilio(Domicilio dom);
    public void borrarDomicilio(Long domId);
    public Domicilio buscarDomicilio(Long domId);
    
}
