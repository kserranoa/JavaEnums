package tallerEnum;
import java.util.Scanner;

public class Excepciones {
       //Variables a utilizar para calcular costos
       static Integer opcionCita=null, opcionTrata=0, opcionControl=0;
       static double km=0, costoDistancia;
       static Scanner entrada = new Scanner(System.in);
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        //Ingreso de opcion Cita       
    public static void addOpcionCita (){        
        
        try{
           System.out.println("Seleccione el tipo de cita \n 1- En Clinica \n 2- A Domicilio");
           opcionCita = entrada.nextInt();
           if ((1 > opcionCita) || (opcionCita > 2)) {
               addOpcionCita ();
           } 
        } catch (Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           addOpcionCita ();
         }         
    }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
        //Ingreso de kilometros en caso de existir
    public static void addKm (){        
        if (opcionCita == 2){            
               try{
           
               System.out.println("Ingrese la cantidad de kilometros");
               km = entrada.nextDouble();
                   if (1 > km) {
                       addKm ();
                   }
                   if (10 < km) {
                       System.out.println("ADVERTENCIA: Ingreso una cantidad mayor a 10 km");
                   }
               costoDistancia = km * 2;
            } catch (Exception ex){
               System.out.println("No puede ingresar texto");
               entrada.nextLine();
               addKm ();
               }             
        }
    }    
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
    //Ingreso de la opcion tratamiento    
    public static void addOpcionTrata (){
           try {
           System.out.println("Seleccione el tipo de tratamiento \n 1- Inyeccion \n 2- Pastilla \n 3- Crema");
           opcionTrata = entrada.nextInt();
               if ((opcionTrata < 1) || (opcionTrata > 3)) {
                   addOpcionTrata ();
               }
       } catch (Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           addOpcionTrata ();
           }        
    }

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
//Ingreso de la opcion Control
    public static void addOpcionControl (){
           try{
           System.out.println("Seleccione el tipo de control \n 1- No Control \n 2- Animal pequeno "
                   + "\n 3- Animal mediano \n 4- Animal grande");
           opcionControl = entrada.nextInt();
               if ((opcionControl < 1) || (opcionControl > 4)) {
                  addOpcionControl ();
               }
       } catch(Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           addOpcionControl ();
           } 
    }    
}
