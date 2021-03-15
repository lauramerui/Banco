/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class CuentaCorrientePersonal extends CuentaCorriente {
    
    protected double comisionMant; //cantidad fija anual

    public CuentaCorrientePersonal(double comisionMant, Persona p, double saldo, String iban, String entidadesAutorizadas) {
        super(p, saldo, iban, entidadesAutorizadas);
        this.comisionMant = comisionMant;
    }

    public double getComisionMant() {
        return comisionMant;
    }

    public void setComisionMant(double comisionMant) {
        this.comisionMant = comisionMant;
    }
    
    
    
    
}
