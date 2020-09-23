package tallerEnum;

public class Main {

    public static void main(String[] args) {
        
        for (; ;) {

        //Ingresar y validar los datos 
       Excepciones validarData = new Excepciones();
       validarData.excepcion();
       Integer opcionCita = validarData.opcionCita;
       Integer opcionTrata = validarData.opcionTrata;
       Integer opcionControl = validarData.opcionControl;
       
       //Dependiendo de los datos ingresados se utilizan las enumeraciones
      Selecciona seleccionar = new Selecciona();       
      seleccionar.menu(opcionCita, opcionTrata, opcionControl);
    }     
        }
}
