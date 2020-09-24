package tallerEnum;

public class Main {

    public static void main(String[] args) {
        //Este for es un bucle infinito, para realizar varias pruebas de funcionamiento
        for (; ;) {

        //Ingresar y validar los datos 
       Excepciones validarData = new Excepciones();
       validarData.addOpcionCita();
       validarData.addKm();
       validarData.addOpcionTrata();
       validarData.addOpcionControl();
       
       //Datos a utilizar para seleccionar total a mostrar
       Integer opcionCita = validarData.opcionCita;
       Integer opcionTrata = validarData.opcionTrata;
       Integer opcionControl = validarData.opcionControl;
       
       //Dependiendo de los datos ingresados se utilizan las enumeraciones
      System.out.println("El total es: ");
      Selecciona seleccionar = new Selecciona();       
      seleccionar.menu(opcionCita, opcionTrata, opcionControl);
    }     
        }
}
