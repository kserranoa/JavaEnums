package tallerEnum;
import java.util.Scanner;

public class Excepciones {
       //Variables a utilizar para calcular costos
       static Integer opcionCita=0, opcionTrata=0, opcionControl=0;
       static double km=0, costoDistancia;
       static Scanner entrada = new Scanner(System.in);
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        //Ingreso de opcion Cita       
    public static void addOpcionCita (){        
        do {
           try{

           System.out.println("Seleccione el tipo de cita \n 1- En Clinica \n 2- A Domicilio");
           opcionCita = entrada.nextInt();
           
        } catch (Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           addOpcionCita ();
           } 
        } while ((1 > opcionCita) && (opcionCita > 2));
    }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
        //Ingreso de kilometros en caso de existir
    public static void addKm (){        
        if (opcionCita == 2){
            do {
               try{
           
               System.out.println("Ingrese la cantidad de kilometros");
               km = entrada.nextInt();
               costoDistancia = km * 2;
            } catch (Exception ex){
               System.out.println("No puede ingresar texto");
               entrada.nextLine();
               addKm ();
               } 
            } while (km < 0);
        }
    }    
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
    //Ingreso de la opcion tratamiento    
    public static void addOpcionTrata (){
       do {
           try {
           System.out.println("Seleccione el tipo de tratamiento \n 1- Inyeccion \n 2- Pastilla \n 3- Crema");
           opcionTrata = entrada.nextInt();
           
       } catch (Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           addOpcionTrata ();
           } 
       } while ((opcionTrata < 0) && (opcionTrata > 4));
    }

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
//Ingreso de la opcion Control
    public static void addOpcionControl (){
       do {
           try{
           System.out.println("Seleccione el tipo de control \n 1- No Control \n 2- Animal pequeno "
                   + "\n 3- Animal mediano \n 4- Animal grande");
           opcionControl = entrada.nextInt();
           
       } catch(Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           addOpcionControl ();
           } 
       } while ((opcionControl < 0) && (opcionControl > 5));

    }    
}
