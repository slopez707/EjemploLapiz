/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package slopez707.ejemplolapiz;

/**
 *
 * @author soryl
 */

//clase padre o super clase EjemploLapiz
public class EjemploLapiz {
    //declaración de los atributos del objeto 
    //se declaran global para asi acceder a ellos desde nuestros metodos que pertenecen a la clase.
    float tamano;
    String color;
    String forma;
    String tipo_punta;
   
    
    //Constructor toma el mismo nombre a la clase padre.
    //En el constructor inicializamos los atributos/caracteristicas de la clase
    /*
      no tiene tipo de retorno ni lleva void
      pueden tener parámetros 
    */
    public EjemploLapiz(float tamano, String color, String forma, String tipo){
        //this se utiliza para acceder a los atributos.
        this.tamano = tamano;
        this.forma = forma;
        this.tipo_punta = tipo;
        this.color = color;       
    }
    //END constructor
    
    //getter y setter, nos van a permitir leer y escribir los valores de los atrisbutos
    //fuera de la clase Getter obetenemos los datos de los atributos
    //Setter  asignamos o cambiamos los valores de los atributos 
    public float getTamano(){
        return this.tamano;
    }
    
    public void setTamano(float tamano){
        this.tamano = tamano;
    }
    //END Getter y Setter
    
    //declaraciones de los metodos de la clase
    //Los métodos son las acciones u operaciones que tiene el objeto.
    public void escribir(){
        System.out.println("Escribiendo datos...");
    }
    
    public String borrar(){
        return "Borrando datos...";
    }
    //END métodos  
  
    public static void main(String[] args) {
        //se instancia el objeto de la siguiente manera, para asi poder accedes a los atributos y metodos.
        EjemploLapiz lapiz = new EjemploLapiz(14.54f, "Azul", "Redondo", "Punto fino");
        
        lapiz.escribir(); // llamada al método escribir 
        System.out.println("Color del lapiz: "+lapiz.color);//imprimer el atributo color
        
        //metodo para cambiar el tamaño del lapiz 
        lapiz.setTamano(44.55f);
        System.out.println("Nuevo tamaño: "+lapiz.tamano);//
        
    }
}
