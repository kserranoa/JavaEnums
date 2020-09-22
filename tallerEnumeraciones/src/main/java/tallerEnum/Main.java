package tallerEnum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       Integer opcionCita=0, opcionTrata=0, opcionControl=0, km=0;
       Scanner entrada = new Scanner(System.in);
       
       //
       Excepciones validarData = new Excepciones();
       validarData.excepcion(opcionCita, opcionTrata, opcionControl, km, entrada);
               
       //
      Selecciona seleccionar = new Selecciona();       
      seleccionar.menu(opcionCita, opcionTrata, opcionControl);
    }

}
