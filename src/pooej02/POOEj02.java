/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

import Entidades.Circunferencia;
import Servicios.CircunferenciaService;

/**
 *
 * @author Byte Shop
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaService datosCompletos = new CircunferenciaService(); 
        Circunferencia valor = datosCompletos.crearCircunferencia();
       
        
        System.out.println("Área = " + datosCompletos.area(valor));
        System.out.println("Perímetro = " + datosCompletos.perimetro(valor));
        
        
    }

}
