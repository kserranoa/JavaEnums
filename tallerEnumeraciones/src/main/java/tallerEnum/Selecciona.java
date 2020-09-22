
package tallerEnum;


public class Selecciona {
    
    public void menu(Integer opcionCita){
        
        switch(opcionCita){
            case 1: 
                System.out.println("Opcion 1");
                break;
            case 2: 
                System.out.println("Opcion2");
                break;
            default: 
                System.out.println("Default");
        } 
    }
}
