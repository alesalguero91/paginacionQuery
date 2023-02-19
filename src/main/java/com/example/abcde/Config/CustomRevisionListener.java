/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.abcde.Config;

import com.example.abcde.Entity.audit.Revision;
import org.hibernate.envers.RevisionListener;

/**
 *
 * @author salguero
 */
public class CustomRevisionListener implements RevisionListener {
     public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
}
