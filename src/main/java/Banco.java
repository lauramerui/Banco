/**
 * Esta clase contiene como atributo la estructura que almacena diferentes cuentas 
 * bancarias (100 como máximo). 
 */

/**
 *
 * @author Laura
 */
public class Banco {
    
    final static int TAM_BANCO=100; //constante que define el tamaño del banco
    
    int numCuenta; //constante para contabilizar el número de cuentas creadas
    
    CuentaBancaria banco[]; //declaración del que array de tipo CuentaBancaria que va a almacenar las cuentas
    
    /**
     * Constructor de la clase Banco. Inicializa el array con el tamaño del banco
     * e inicializa el contador a 0.
     */
    public Banco(){
        
        banco=new CuentaBancaria[TAM_BANCO];
        
        numCuenta=0;
    }
    
    /**
     * Recibo por parámetro un objeto CuentaBancaria y lo almacena en la estructura
     * @param cb: objeto CuentaBancaria recibido desde la clase Principal.
     * @return true si se ha creado correctamente.
     */
    public boolean abrirCuenta(CuentaBancaria cb){
        
        banco[numCuenta]=cb;
        
        numCuenta++;
        
        return true;
    }

    /**
     * Devuelve un array con cadenas de texto con la información de cada cuenta(código, titular y DNI)
     */
    void listadoCuentas(){
        
        int i=0;
        
        while (i<numCuenta){
        
            System.out.println("Cuenta número " + (i+1) + "\nCódigo de cuenta: " + banco[i].getIban() + 
                "\nTitular: " + (banco[i].getP()).getNombre() + " " + (banco[i].getP()).getApellidos() 
                + " con DNI: " + (banco[i].getP()).getDni() + "\nSaldo actual: " + banco[i].getSaldo() + "€\n");
            
            i++;
        }
    }
    
    /*recibe un iban por parámetro y devuelve una cadena con la información de la 
    cuenta o null si la cuenta no existe.*/
    /**
     * Recibe un IBAN para devolver la información de dicha cuenta. Para ello compara
     * el IBAN recibido por parámetro con los de todas las cuentas creadas con un bucle
     * de tipo while. Si encuentra la coincidencia devuelve la información a través de
     * la interfaz Imprimible.
     * @param iban: número de cuenta.
     * @return información si se encuentra el IBAN en el banco, null si no se encuentra el IBAN.
     */
    String informacionCuenta(String iban){
        
        for (int i=0; i<numCuenta; i++){
            
            if(banco[i].getIban().equals(iban)){
                
                String informacion= "\nInformación de la cuenta con IBAN " + iban + ":\n" + banco[i].devolverInfoString();
                
                return informacion;
            }
        } 
        
        return null; //si no se encuentra el IBAN devuelve null.
    }
    
    /**
     * Recibe un IBAN y una cantidad, si encuentra una cuenta con dicho IBAN, suma
     * la cantidad al saldo de la cuenta.
     * @param iban: número de cuenta.
     * @param cantidad: cantidad de dinero que se desea ingresar en la cuenta.
     * @return true si el ingreso se ha realizado correctamente, false en caso contrario.
     */
    boolean ingresoCuenta(String iban, double cantidad){
        
        for (int i=0; i<numCuenta; i++){
             
            if(banco[i].getIban().equals(iban)){
                
                banco[i].setSaldo(banco[i].getSaldo() + cantidad); 
                
                return true;
            }
        }
        
        return false; //si no se encuentra una cuenta con el IBAN recibido devuelve false
    }
    
    /**
     * Recibe un IBAN y una cantidad, si encuentra dicho IBAN resta la cantidad al saldo de la cuenta.
     * @param iban: número de cuenta.
     * @param cantidad: cantidad de dinero que se quiere retirar de la cuenta.
     * @return true si se retira el dinero correctamente, false en caso contrario.
     */
    boolean retiradaCuenta(String iban, double cantidad){
    
        for (int i=0; i<numCuenta; i++){
            
            if(banco[i].getIban().equals(iban)){
                
                banco[i].setSaldo(banco[i].getSaldo() - cantidad);
                
                return true;
            }
        }
        
        return false;   
    }
    
    /**
     * Recibe un IBAN y si encuentra una cuenta con dicho IBAN devuelve su saldo.
     * @param iban
     * @return el saldo de la cuenta si es encontrada, -1 si la cuenta no existe.
     */
    double obtenerSaldo(String iban){
        
        for(int i=0; i<numCuenta; i++){
            
            if(banco[i].getIban().equals(iban)){
                
            return  banco[i].getSaldo(); 
            
            }
        }
        
        return -1;
    }
}
