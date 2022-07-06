/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_02_progra;

import java.util.Date;

/**
 *
 * @author marceladiaz
 */
public class Prestamo {

    public Prestamo() {
    }
    
    private int codigoPrest;
    private Date fechaPrest;
    private Date fechaDevEst;
    private String codigoLib;
    private String dniSocio;
    private Date fechaDevReal;

    public int getCodigoPrest() {
        return codigoPrest;
    }

    public void setCodigoPrest(int codigoPrest) {
        this.codigoPrest = codigoPrest;
    }

    public Date getFechaPrest() {
        return fechaPrest;
    }

    public void setFechaPrest(Date fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public Date getFechaDevEst() {
        return fechaDevEst;
    }

    public void setFechaDevEst(Date fechaDevEst) {
        this.fechaDevEst = fechaDevEst;
    }

    public String getCodigoLib() {
        return codigoLib;
    }

    public void setCodigoLib(String codigoLib) {
        this.codigoLib = codigoLib;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public Date getFechaDevReal() {
        return fechaDevReal;
    }

    public void setFechaDevReal(Date fechaDevReal) {
        this.fechaDevReal = fechaDevReal;
    }

    public Prestamo(int codigoPrest, Date fechaPrest, Date fechaDevEst, String codigoLib, String dniSocio, Date fechaDevReal) {
        this.codigoPrest = codigoPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDevEst = fechaDevEst;
        this.codigoLib = codigoLib;
        this.dniSocio = dniSocio;
        this.fechaDevReal = fechaDevReal;
    }
    
    
}
