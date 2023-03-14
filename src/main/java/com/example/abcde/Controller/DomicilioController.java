/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Controller;

import com.example.abcde.Entity.Domicilio;
import com.example.abcde.Service.DomicilioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salguero
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")
public class DomicilioController{
    @Autowired DomicilioService domServ;
    
    @GetMapping("")
    @ResponseBody
    public List <Domicilio> guardarDom(){
        return domServ.verDomicilio();
    }
    
    
    @PostMapping("")
    public void crearDom(@RequestBody Domicilio dom){
        domServ.crearDomicilio(dom);
    }
    
    @GetMapping("/{domId}")
    public Domicilio buscarDom(@PathVariable Long domId){
        Domicilio dom = domServ.buscarDomicilio(domId);
        return dom;
    }
    
    @DeleteMapping("/{domId}")
    public void elimininarDom(@PathVariable Long domId){
        domServ.borrarDomicilio(domId);
    }
    
    @PutMapping("/{domId}")
    public Domicilio editarDom(@PathVariable Long domId, @RequestBody Domicilio domicilio){
        Domicilio dom = domServ.buscarDomicilio(domId);
        
        dom.setCalle(domicilio.getCalle());
        dom.setNumero(domicilio.getNumero());
        dom.setPersona(dom.getPersona());
        
        domServ.crearDomicilio(dom);
        return dom;
    }
    
}
