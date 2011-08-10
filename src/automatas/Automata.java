/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.io.*;
import java.util.*;

/**
 *
 * @author Elcida
 */
public class Automata {
    
    public static void cargardatos(String archivo) throws FileNotFoundException{
        
        Scanner leer = new Scanner(new File(archivo));
        
        String estado_ini = leer.nextLine();
        System.out.println(estado_ini);
        
        String aux_edo = leer.nextLine();
        String[] estado_aceptador = aux_edo.split(" ");
        
        String aux_alf = leer.nextLine();
        String[] alfabeto = aux_alf.split(" ");
        
        
        
        System.out.println(estado_aceptador[0]+" "+ estado_aceptador[1]);
        System.out.println(alfabeto[0]+" "+ alfabeto[1]);
        
        
        
        /*String alfabeto = leer.nextLine();
        System.out.println(estado_aceptador);*/
    }
}
