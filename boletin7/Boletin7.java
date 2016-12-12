/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author Adri
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.setAutor("Adrian");
        l1.setTitulo("El libro");
        l1.setnEjPrestados(0);
        l1.setnEjemplares(5);
        /*l1.prestamo();
        l1.mostrar();
        l1.prestamo();
        l1.prestamo();
        l1.prestamo();
        l1.prestamo();
        l1.prestamo();
        l1.mostrar();*/
        l1.devolver();

    }
    
}
