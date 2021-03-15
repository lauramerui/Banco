/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Banco {
    
    final static int TAM_BANCO=100;
    int numCuenta;
    
    CuentaBancaria banco[];
    
    public Banco(){//constructor
        
        banco=new CuentaBancaria[100];
        numCuenta=0;
        
    }
    
    /*recibe por parámetro un objeto CuentaBancaria y lo almacena en la estructura. 
    Devuelve true o false indicando si la operación se realizó con éxito.*/
    boolean abrirCuenta(CuentaBancaria cb){
        
        
        
        return false;
    }
    
    /*no recibe parámetro y devuelve un array donde cada elemento es una cadena 
    que representa la información de una cuenta.*/
    void listadoCuentas(){
        
    }
    
    /*recibe un iban por parámetro y devuelve una cadena con la información de la 
    cuenta o null si la cuenta no existe.*/
    String informacionCuenta(){
        
        return null;
    }
    
    /*recibe un iban por parámetro y una cantidad e ingresa la cantidad en la cuenta. 
    Devuelve true o false indicando si la operación se realizó con éxito.*/
    boolean ingresoCuenta(){
        
        return false;
    }
    
    /*recibe un iban por parámetro y una cantidad y trata de retirar la cantidad 
    de la cuenta. Devuelve true o false indicando si la operación se realizó con éxito.*/
    boolean retiradaCuenta(){
        
        return false;
    }
    
    /*Recibe un iban por parámetro y devuelve el saldo de la cuenta si existe. 
    En caso contrario devuelve -1.*/
    double obtenerSaldo(){
        
        return -1;
    }
}
