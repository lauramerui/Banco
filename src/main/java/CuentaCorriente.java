/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public abstract class CuentaCorriente extends CuentaBancaria {
    
    protected String entidadesAutorizadas;
    
    public CuentaCorriente(Persona p, double saldo, String iban, String entidadesAutorizadas){
        
        super(p, saldo, iban);
        this.entidadesAutorizadas=entidadesAutorizadas;
    }

    public String getEntidadesAutorizadas() {
        return entidadesAutorizadas;
    }

    public void setEntidadesAutorizadas(String entidadesAutorizadas) {
        this.entidadesAutorizadas = entidadesAutorizadas;
    }
    
    
}
