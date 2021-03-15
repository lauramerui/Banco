
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Principal {
    
    static Scanner entrada= new Scanner(System.in);
    
    public static int mostrarMenu(){
        
       System.out.println("GESTIÓN DE CUENTAS BANCARIAS"); 
       
        System.out.println("1.Abrir una nueva cuenta.");
        System.out.println("2.Ver un listado de las cuentas disponibles");
        System.out.println("3.Obtener los datos de una cuenta concreta.");
        System.out.println("4.Realizar un ingreso en una cuenta.");
        System.out.println("5.Retirar efectivo de una cuenta.");
        System.out.println("6.Consultar el saldo actual de una cuenta.");
        System.out.println("7.Salir de la aplicación.");
       
       int menu=entrada.nextInt();
       
       entrada.nextLine();
       
       return menu;
    }
    
    public static void main(String[] args) {
        
        int menu;
        int tipo;
        String nombre, apellidos, dni, iban, interesRem, interesDesc, entidadesAutorizadas;
        double saldo, comisionMant, descubierto, comisionDesc;
        do{
            menu=mostrarMenu();
            
            switch (menu){
                
                case 1:
                    
                    System.out.println("DATOS PERSONALES:");
                    System.out.println("Nombre");
                    nombre=entrada.nextLine();
                    
                    System.out.println("Apellidos:");
                    apellidos=entrada.nextLine();
                    
                    System.out.println("DNI:");
                    dni=entrada.nextLine();
                    
                    Persona p=new Persona(nombre, apellidos, dni);
                     
                    System.out.println("Saldo de la cuenta:");
                    saldo=entrada.nextDouble();
                    
                    System.out.println("Número de cuenta(IBAN):");//SE validará con una expresión regular y deberá tener formato ESNNNNNNNNNNNNNNNNNNNN, donde N es un dígito del 0 al 9.
                    iban=entrada.nextLine();
                    
                    System.out.println("¿Que tipo de cuenta que desea abrir?: cuenta de ahorro(1), cuenta corriente personal(2) o cuenta corriente de empresa(3).");
                    tipo=entrada.nextInt();
                    
                    switch(tipo){
                        case 1://cuenta de ahorro
                            System.out.println("Tipo de interes de remuneración:");
                            interesRem=entrada.nextLine();
                            
                            CuentaBancaria cuenta=new CuentaAhorro(p, saldo, iban, interesRem);
                            
                        case 2://cuenta corriente personal
                            System.out.println("lista de entidades autorizadas para cobrar recibos domiciliados en la cuenta:");
                            entidadesAutorizadas=entrada.nextLine();
                            
                            System.out.println("Comisión de mantenimiento:");
                            comisionMant=entrada.nextDouble();
                            
                        case 3://cuenta corriente de empresa
                            System.out.println("lista de entidades autorizadas para cobrar recibos domiciliados en la cuenta:");
                            entidadesAutorizadas=entrada.nextLine();
                            
                            System.out.println("Máximo descubierto permitido:");
                            descubierto=entrada.nextDouble();
                            
                            System.out.println("Tipo de interés por descubierto:");
                            interesDesc=entrada.nextLine();
                            
                            System.out.println("Comisión fija por cada descubierto:");
                            comisionDesc=entrada.nextDouble();
                            
                    }
                    
                    
                case 2:
                    
                case 3:
                    
                case 4:
                    
                case 5:
                    
                case 6:
                    
                case 7:
                    
                    System.out.println("Aplicación finalizada.");
            }
            
        }while (menu!=7);
    }
}
