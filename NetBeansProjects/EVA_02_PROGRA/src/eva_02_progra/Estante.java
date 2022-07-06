/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_02_progra;

/**
 *
 * @author marceladiaz
 */
public class Estante {

    public Estante() {
    }

    public Estante(int numeroEstante, int capacidad) {
        this.numeroEstante = numeroEstante;
        this.capacidad = capacidad;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    private int numeroEstante;
    private int capacidad;
    
    
    
}
