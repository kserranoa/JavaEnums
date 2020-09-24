package tallerEnum;
import java.util.Scanner;

public class Excepciones {
       //Variables a utilizar para calcular costos
       static Integer opcionCita=0, opcionTrata=0, opcionControl=0;
       static double km=0, costoDistancia;
       static Scanner entrada = new Scanner(System.in);
       
    public static void excepcion (){
        
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        //Ingreso de opcion Cita
        do {
           try{

           System.out.println("Seleccione el tipo de cita \n 1- En Clinica \n 2- A Domicilio");
           opcionCita = entrada.nextInt();
           
        } catch (Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           } 
        } while ((0 > opcionCita) && (opcionCita > 3));

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
        //Ingreso de kilometros en caso de existir
        if (opcionCita == 2){
            do {
               try{
           
               System.out.println("Ingrese la cantidad de kilometros");
               km = entrada.nextInt();
               costoDistancia = km * 2;
            } catch (Exception ex){
               System.out.println("No puede ingresar texto");
               entrada.nextLine();
               } 
            } while (km < 0);
        }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
    //Ingreso de la opcion tratamiento
       do {
           try {
           System.out.println("Seleccione el tipo de tratamiento \n 1- Inyeccion \n 2- Pastilla \n 3- Crema");
           opcionTrata = entrada.nextInt();
           
       } catch (Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           } 
       } while ((opcionTrata < 0) && (opcionTrata > 4));

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -       
//Ingreso de la opcion Control
       do {
           try{
           System.out.println("Seleccione el tipo de control \n 1- No Control \n 2- Animal pequeno "
                   + "\n 3- Animal mediano \n 4- Animal grande");
           opcionControl = entrada.nextInt();
           
       } catch(Exception ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
           } 
       } while ((opcionControl < 0) && (opcionControl > 5));

    }
        
}