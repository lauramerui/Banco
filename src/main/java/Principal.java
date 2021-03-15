
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
        
        do{
            menu=mostrarMenu();
            
            switch (menu){
                
                case 1:
                    
                    System.out.println("Datos personales:");
                    System.out.println("Tipo de cuenta");
                    System.out.println("Saldo inicial");
                    
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
