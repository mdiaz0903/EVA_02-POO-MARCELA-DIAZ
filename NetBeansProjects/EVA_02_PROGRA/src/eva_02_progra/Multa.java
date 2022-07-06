/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_02_progra;

/**
 *
 * @author marceladiaz
 */
public class Multa {

    public Multa() {
    }

    public Multa(int codigoMulta, String dniSocio, int diasMulta, int diasPagados) {
        this.codigoMulta = codigoMulta;
        this.dniSocio = dniSocio;
        this.diasMulta = diasMulta;
        this.diasPagados = diasPagados;
    }

    public int getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(int codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public int getDiasMulta() {
        return diasMulta;
    }

    public void setDiasMulta(int diasMulta) {
        this.diasMulta = diasMulta;
    }

    public int getDiasPagados() {
        return diasPagados;
    }

    public void setDiasPagados(int diasPagados) {
        this.diasPagados = diasPagados;
    }
    
    private int codigoMulta;
    private String dniSocio;
    private int diasMulta;
    private int diasPagados;
    
    
    
}
