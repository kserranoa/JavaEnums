package tallerEnum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variables a utilizar para calcular costos
       Integer opcionCita=0, opcionTrata=0, opcionControl=0, km=0;
       Scanner entrada = new Scanner(System.in);
       
       //Ingresar y validar los datos 
       Excepciones validarData = new Excepciones();
       validarData.excepcion(opcionCita, opcionTrata, opcionControl, km, entrada);
               
       //Dependiendo de los datos ingresos se utilizan las enumeraciones
      Selecciona seleccionar = new Selecciona();       
      seleccionar.menu(opcionCita, opcionTrata, opcionControl);
    }

}
