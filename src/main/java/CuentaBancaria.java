/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public abstract class CuentaBancaria implements Imprimible {
    
    protected Persona p;
    
    protected double saldo;
    
    protected String iban;
    
    //constructor
    public CuentaBancaria (Persona p, double saldo, String iban){
        
        this.p=p;
        this.saldo=saldo;
        this.iban=iban;
                
    }

    public Persona getP() {
        return p;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
    
}
