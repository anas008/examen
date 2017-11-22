
package banco;

/**Clase Banco
 * @author Anas
 */
public class Banco {
    
    final private String nombre;
    private double capital = 5.2;
    private String direccion ="Sin direccion";
    
    //Constructor
    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    public Banco (String nombre, double capital, String direccion){
        
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }
    
    /**
     * Muestra la informacion del objecto cuentaCorriente
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capital: " + capital);
        System.out.println("Direccion: " + direccion);
        System.out.println("");        
    }
  
}  

   
    
    
    
    