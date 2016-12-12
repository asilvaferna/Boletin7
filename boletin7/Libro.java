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
public class Libro {
    private String titulo, autor;
    private int nEjemplares, nEjPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nEjemplares, int nEjPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nEjPrestados = nEjPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public int getnEjPrestados() {
        return nEjPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public void setnEjPrestados(int nEjPrestados) {
        this.nEjPrestados = nEjPrestados;
    }
    public boolean prestamo(){
       if (nEjemplares <= 0) {
           System.out.println("No se puede prestar");
           return false;
       }
       else {
           nEjemplares -= 1;
           nEjPrestados += 1;
           return true;
       }
    }
    public void mostrar() {
        System.out.println("Libro " + "titulo=" + titulo + ", autor=" + autor + ", nEjemplares=" + nEjemplares + ", nEjPrestados=" + nEjPrestados);
    }
    public boolean devolver(){
        if (nEjemplares != nEjemplares) {
            nEjemplares += 1;
            nEjPrestados -=1;
            return true;
        }
        else {
            System.out.println("No se ha prestado");
            return false;
        }
    }
}
