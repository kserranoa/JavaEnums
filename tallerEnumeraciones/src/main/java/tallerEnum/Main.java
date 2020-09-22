
package tallerEnum;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       Integer opcionCita = 0, opcionTrata, opcionControl;
       
       Selecciona seleccionar = new Selecciona();
       
       do {
           try{
           System.out.println("Seleccione el tipo de cita \n 1- En Clinica \n 2- A Domicilio");
           opcionCita = entrada.nextInt();
//           System.out.println("Seleccione el tipo de tratamiento \n 1- Inyeccion \n 2- Pastilla \n 3- Crema");
//           opcionTrata = entrada.nextDouble();
//           System.out.println("Seleccione el tipo de control \n 1- No Control \n 2- Animal pequeno \n 3- Animal mediano \n 4- Animal grande");
//           opcionControl = entrada.nextDouble();
           
       } catch(InputMismatchException ex){
           System.out.println("No puede ingresar texto");
           entrada.nextLine();
       } catch(NullPointerException ex){
           System.out.println("No puede estar en blanco");
           entrada.nextLine();
       }
       } while (opcionCita<0);
       
       seleccionar.menu(opcionCita);
    }

}
