/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class CuentaAhorro extends CuentaBancaria {
    
    String interesRem;
    
    //constructor
    public CuentaAhorro(Persona p, double saldo, String iban, String interesRem){
        
        super(p, saldo, iban);
        this.interesRem=interesRem;
    }

    public String getInteresRem() {
        return interesRem;
    }

    public void setInteresRem(String interesRem) {
        this.interesRem = interesRem;
    }
    
}
