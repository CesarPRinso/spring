/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.spring;

import com.tecsup.spring.model.Instrumento;
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
        Aplicacion.ejemplo2(cntx);
        Aplicacion.ejemplo3(cntx);

    }

//    public static void mensaje ()
//    {
//        System.out.println("este es un cambio");
//    }
    public static void ejemplo1(ApplicationContext cntx) {

        //para acceder a los beans definidos en cualquier metodo se instancia la clase ClassPathXmlApplicationContext.
        Musico musico = (Musico) cntx.getBean("musico");
        musico.who();

    }

    public static void ejemplo2(ApplicationContext cntx) {

        //para acceder a los beans definidos en cualquier metodo se instancia la clase ClassPathXmlApplicationContext.
        Musico musico = (Musico) cntx.getBean("bob");
        musico.who();
        System.out.println(musico.getCanciones());

    }

    public static void ejemplo3(ApplicationContext cntx) {

        //para acceder a los beans definidos en cualquier metodo se instancia la clase ClassPathXmlApplicationContext.
        Musico musico = (Musico) cntx.getBean("pancho");
        Instrumento instrumento = (Instrumento) cntx.getBean("instrumento");

        musico.who();
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();   
       

    }

}
