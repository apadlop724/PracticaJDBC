/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicajdbc;

import dao.ExcusaDAO;
import dao.ExcusaDAOImpl;
import modelo.ExcusaEntrega;
import java.util.List;


public class PracticaJDBC {

    public static void main(String[] args) {       
        
        //creamos el objeto 
        ExcusaDAO dao = new ExcusaDAOImpl();        
        List lista;
        
        System.out.println(" TODAS LAS EXCUSAS ORDENADAS POR DRAMA DESCENDENTE ");
        //usamos sus metodos
        lista = dao.obtenerConsulta1_DramaDesc();
         if (lista.isEmpty()) {
            System.out.println("No se encontraron registros.");
        } else {
            lista.forEach(System.out::println);           
        }
         
       System.out.println("\n\n\n EXCUSAS DE PERRO/ GATO CON RETRASO ENTRE 2 y 6 DIAS ");      
       //usamo su metodo
        lista = dao.obtenerConsulta2_MascotasYRetraso();
         if (lista.isEmpty()) {
            System.out.println("No se encontraron registros.");
        } else {
            lista.forEach(System.out::println);           
        }
         
          System.out.println("\n\n\n SIN FECHA DE ENTREGA Y (Credibilidad < 4 O Drama >= 9) ");
          //usamos su metodo
        lista = dao.obtenerConsulta3_SinFechaYCondiciones();
         if (lista.isEmpty()) {
            System.out.println("No se encontraron registros.");
        } else {
            lista.forEach(System.out::println);           
        }
         
        System.out.println("\n\n\n AVANZADA CON GRUPOS OR / AND ");        
        //usamos su metodo
        lista = dao.obtenerConsulta4_Avanzada();
         if (lista.isEmpty()) {
            System.out.println("No se encontraron registros.");
        } else {
            lista.forEach(System.out::println);           
        }
    }
}
