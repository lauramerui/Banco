/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    
    protected double descubierto;//máximo descubierto permitido
    
    protected String interesDesc; //tipo de interés por descubierto
    
    protected double comisionDesc;//comisión fija por cada descubierto que se tenga

    public CuentaCorrienteEmpresa(double descubierto, String interesDesc, double comisionDesc, Persona p, double saldo, String iban, String entidadesAutorizadas) {
        super(p, saldo, iban, entidadesAutorizadas);
        this.descubierto = descubierto;
        this.interesDesc = interesDesc;
        this.comisionDesc = comisionDesc;
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    public String getInteresDesc() {
        return interesDesc;
    }

    public void setInteresDesc(String interesDesc) {
        this.interesDesc = interesDesc;
    }

    public double getComisionDesc() {
        return comisionDesc;
    }

    public void setComisionDesc(double comisionDesc) {
        this.comisionDesc = comisionDesc;
    }

    @Override
    public String devolverInfoString() {
         String contenido = "Nombre: " + p.getNombre() + 
                " Apellidos: " + p.getApellidos() + " DNI: " + p.getDni() + "\nSaldo: " 
                 + this.saldo + "\nIBAN: " + this.iban + "\nMáximo descubierto permitido " + this.descubierto + "\nTipo de interés por descubierto: " 
                 + this.interesDesc + "\nComisión fija por descubierto: " + this.comisionDesc;
                 
         return contenido;
    }
    
    
    
}
