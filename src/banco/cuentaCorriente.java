package banco;

/**Clase cuentaCorriente
 * @author Anas
 */
public class cuentaCorriente {
    
    private double saldo;
    public String nombre;
    String dni;  
    private double limite;   
    private double interes;
    Banco banco;
    
    //Constructor
    public cuentaCorriente(String nombre, String dni, Banco banco, double interes) {
        
        saldo = 0;
        limite = -50;
        this.nombre = nombre;
        this.dni = dni;
        this.banco = banco;
        this.interes = interes;
        
     }
    
    /**
     * Comprueba si es posible retirar una cantidad del saldo
     * @param cant double la cantidad a retirar
     * @return true en caso de que sea posible retirar, false en caso contrario
     */
    public boolean retirar(double cant) {
        if(this.saldo-cant>=limite){
            this.saldo=-cant;
            return true;
        }else{return false;}
    }
    
    /**
     * Ingresa la cantidad en el saldo
     * @param cant double la cantidad a ingresar
     */
    public void ingreso(double cant){
        this.saldo=+cant;
    }
    
    /**
     * Calcula el interes TAE
     * @return double el interes calculado
     */
    public double interesTAE() {      
       return this.saldo*this.interes/100;
    };
    
    /**
     * Cambia de objecto Banco
     * @param banco objecto de la clase Banco
     */
    public void cambiarBanco(Banco banco){
        this.banco = banco;        
    }
    
    /**
     * Muestra la informacion del objecto cuentaCorriente
     */
    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dni: " + this.dni);
        System.out.println("Interes: " + this.interes);
    }
    
}
