package tallerEnum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       Integer opcionCita, opcionTrata, opcionControl;
       
       //
       Excepciones validarData = new Excepciones();
       validarData.excepcion();
               
       //
      Selecciona seleccionar = new Selecciona();       
      seleccionar.menu(opcionCita, opcionTrata, opcionControl);
    }

}
