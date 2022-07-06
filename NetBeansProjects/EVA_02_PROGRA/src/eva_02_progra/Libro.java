/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_02_progra;

/**
 *
 * @author marceladiaz
 */
public class Libro {

    public Libro() {
    }

    public Libro(String codigo, String titulo, String autor, String tematica, boolean estado, int stock, int numeroEstante) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
        this.estado = estado;
        this.stock = stock;
        this.numeroEstante = numeroEstante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }
    
    private String codigo;
    private String titulo;
    private String autor;
    private String tematica;
    private boolean estado;
    private int stock;
    private int numeroEstante;
    
    
}
