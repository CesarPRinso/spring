/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.spring;

import com.tecsup.spring.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author alumno
 */
public class Aplicacion {
    
    
    
    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
        //Persona persona = (Persona) context.getBean("persona");
        Aplicacion.ejemplo1(cntx);
        
    }
    
    
    
//    public static void mensaje ()
//    {
//        System.out.println("este es un cambio");
//    }
    
    public static void ejemplo1(ApplicationContext cntx) {
        
        //para acceder a los beans definidos en cualquier metodo se instancia la clase ClassPathXmlApplicationContext.
        Musico musico = (Musico)cntx.getBean("musico");
        musico.who();
        
    }
    
}
