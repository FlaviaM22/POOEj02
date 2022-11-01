/*
 Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Servicios;

import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class CircunferenciaService {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia valorRadio = new Circunferencia();
        System.out.println("Ingrese el radio");
        valorRadio.setRadio(leer.nextDouble());

        return valorRadio;
    }

    public double area(Circunferencia valorRadio) {
        //double area = PI*(valorRadio.getRadio()*valorRadio.getRadio());            //Dos formas distintas de hacer lo mismo
        double area = Math.PI * Math.pow(valorRadio.getRadio(), 2);

        return area;
    }

    public double perimetro(Circunferencia valorRadio) {
        double perimetro = 2 * PI * valorRadio.getRadio();

        return perimetro;
    }
}
