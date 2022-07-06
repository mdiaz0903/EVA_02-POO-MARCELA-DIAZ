/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_02_progra;

/**
 *
 * @author marceladiaz
 */
public class Socio {
    
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private int cantLibPrest;
    private boolean estadoSocio;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantLibPrest() {
        return cantLibPrest;
    }

    public void setCantLibPrest(int cantLibPrest) {
        this.cantLibPrest = cantLibPrest;
    }

    public boolean isEstadoSocio() {
        return estadoSocio;
    }

    public void setEstadoSocio(boolean estadoSocio) {
        this.estadoSocio = estadoSocio;
    }

    public Socio(String dni, String nombre, String apellido1, String apellido2, String direccion, int cantLibPrest, boolean estadoSocio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.cantLibPrest = cantLibPrest;
        this.estadoSocio = estadoSocio;
    }

    public Socio() {
    }
    
}
