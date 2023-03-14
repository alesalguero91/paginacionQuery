/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 *
 * @author salguero
 */
@Entity
@Table(name= "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicilio{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domId;
    
    @Column(name= "calle")
    private String calle;
    
    @Column(name="numero")
    private int numero;
    
    @JsonIgnore
    @ManyToMany(mappedBy="domicilio")
    
    //private List<Persona>persona= new ArrayList<Persona>();
    private Set<Persona>persona= new HashSet<>();
    
  
}
