/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;

/**
 *
 * @author Johann Lopez
 */
public class Calculadora {
    
    // Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        double deltaX = p2.getX() - p1.getX();
        double deltaY = p2.getY() - p1.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Función para calcular la pendiente de la recta que une dos puntos
    public static double calcularPendiente(Punto p1, Punto p2) {
        double deltaX = p2.getX() - p1.getX();
        double deltaY = p2.getY() - p1.getY();
        return deltaY / deltaX;
    }    
}
