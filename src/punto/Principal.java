/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto;

/**
 *
 * @Johann Lopez
 */

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Leer las coordenadas del primer punto
        System.out.print("Ingrese la coordenada x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y1: ");
        double y1 = scanner.nextDouble();

        // Leer las coordenadas del segundo punto
        System.out.print("Ingrese la coordenada x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y2: ");
        double y2 = scanner.nextDouble();

        // Crear los puntos
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);

        // Calcular y mostrar la distancia y la pendiente
        double distancia = Calculadora.calcularDistancia(p1, p2);
        double pendiente = Calculadora.calcularPendiente(p1, p2);

        System.out.println("La distancia entre los puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los puntos es: " + pendiente);
    }

    }
    

