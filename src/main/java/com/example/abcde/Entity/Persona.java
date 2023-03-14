/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona extends Base{
    
    
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<Libro> libros = new HashSet<>();
    
    
    @ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name="persona_domicilio",
            joinColumns = @JoinColumn(name="persona_id"),
            inverseJoinColumns = @JoinColumn(name="domicilio_id")
    )
   // private List<Domicilio>domicilio = new ArrayList<Domicilio>();
    private Set<Domicilio> domicilio = new HashSet<>();
    
    /*@ManyToMany(mappedBy="persona", cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Domicilio>domicilio;*/
    
   
    
}
