package tallerEnum;

public class Selecciona {
    
    public void menu(Integer opcionCita, Integer opcionTrata, Integer opcionControl){
    
        switch(opcionCita){
            //Selecionar cita en la clinica local
            case 1: 
                //Selecionar el tipo de tratamiento
                switch (opcionTrata) {
                    //Selecionar tratamiento 1 para inyeccion
                    case 1:
                        //Selecionar control
                        switch (opcionControl) {
                            case 1:
                                    Total total = new Total(Cita.CLINICA, Tratamiento.INYECCION, Control.NOCONTROL);
                                    System.out.println(total.costo());                                
                                break;
                            case 2:
                                    Total total1 = new Total(Cita.CLINICA, Tratamiento.INYECCION, Control.PEQUENO);
                                    System.out.println(total1.costo());                                
                                break;                            
                            case 3:
                                    Total total2 = new Total(Cita.CLINICA, Tratamiento.INYECCION, Control.MEDIANO);
                                    System.out.println(total2.costo());                                
                                break;                            
                            case 4:
                                    Total total3 = new Total(Cita.CLINICA, Tratamiento.INYECCION, Control.GRANDE);
                                    System.out.println(total3.costo());                                
                                break;                            
                            default:
                                throw new AssertionError();
                        }
                        break;
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    //Selecionar tratamiento 2 para pastilla
                    case 2:
                        //Selecionar control
                        switch (opcionControl) {
                            case 1:
                                    Total total = new Total(Cita.CLINICA, Tratamiento.PASTILLA, Control.NOCONTROL);
                                    System.out.println(total.costo());                                
                                break;
                            case 2:
                                    Total total1 = new Total(Cita.CLINICA, Tratamiento.PASTILLA, Control.PEQUENO);
                                    System.out.println(total1.costo());                                
                                break;                            
                            case 3:
                                    Total total2 = new Total(Cita.CLINICA, Tratamiento.PASTILLA, Control.MEDIANO);
                                    System.out.println(total2.costo());                                
                                break;                            
                            case 4:
                                    Total total3 = new Total(Cita.CLINICA, Tratamiento.PASTILLA, Control.GRANDE);
                                    System.out.println(total3.costo());                                
                                break;                            
                            default:
                                throw new AssertionError();
                        }                        
                        break;                    
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -                        
                    //Selecionar tratamiento 3 para crema
                    case 3:
                        //Selecionar control
                        switch (opcionControl) {
                            case 1:
                                    Total total = new Total(Cita.CLINICA, Tratamiento.CREMA, Control.NOCONTROL);
                                    System.out.println(total.costo());                                
                                break;
                            case 2:
                                    Total total1 = new Total(Cita.CLINICA, Tratamiento.CREMA, Control.PEQUENO);
                                    System.out.println(total1.costo());                                
                                break;                            
                            case 3:
                                    Total total2 = new Total(Cita.CLINICA, Tratamiento.CREMA, Control.MEDIANO);
                                    System.out.println(total2.costo());                                
                                break;                            
                            case 4:
                                    Total total3 = new Total(Cita.CLINICA, Tratamiento.CREMA, Control.GRANDE);
                                    System.out.println(total3.costo());                                
                                break;                            
                            default:
                                throw new AssertionError();
                        }                        
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                break;
            
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            //Selecionar cita a domicilio 
            case 2: 
                //Selecionar el tipo de tratamiento
                switch (opcionTrata) {
                    //Selecionar tratamiento 1 para inyeccion
                    case 1:
                        //Selecionar control
                        switch (opcionControl) {
                            case 1:
                                    Total total = new Total(Cita.DOMICILIO, Tratamiento.INYECCION, Control.NOCONTROL);
                                    System.out.println(total.costo());                                
                                break;
                            case 2:
                                    Total total1 = new Total(Cita.DOMICILIO, Tratamiento.INYECCION, Control.PEQUENO);
                                    System.out.println(total1.costo());                                
                                break;                            
                            case 3:
                                    Total total2 = new Total(Cita.DOMICILIO, Tratamiento.INYECCION, Control.MEDIANO);
                                    System.out.println(total2.costo());                                
                                break;                            
                            case 4:
                                    Total total3 = new Total(Cita.DOMICILIO, Tratamiento.INYECCION, Control.GRANDE);
                                    System.out.println(total3.costo());                                
                                break;                            
                            default:
                                throw new AssertionError();
                        }
                        break;
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    //Selecionar tratamiento 2 para pastilla
                    case 2:
                        //Selecionar control
                        switch (opcionControl) {
                            case 1:
                                    Total total = new Total(Cita.DOMICILIO, Tratamiento.PASTILLA, Control.NOCONTROL);
                                    System.out.println(total.costo());                                
                                break;
                            case 2:
                                    Total total1 = new Total(Cita.DOMICILIO, Tratamiento.PASTILLA, Control.PEQUENO);
                                    System.out.println(total1.costo());                                
                                break;                            
                            case 3:
                                    Total total2 = new Total(Cita.DOMICILIO, Tratamiento.PASTILLA, Control.MEDIANO);
                                    System.out.println(total2.costo());                                
                                break;                            
                            case 4:
                                    Total total3 = new Total(Cita.DOMICILIO, Tratamiento.PASTILLA, Control.GRANDE);
                                    System.out.println(total3.costo());                                
                                break;                            
                            default:
                                throw new AssertionError();
                        }                        
                        break;                    
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -                        
                    //Selecionar tratamiento 3 para crema
                    case 3:
                        //Selecionar control
                        switch (opcionControl) {
                            case 1:
                                    Total total = new Total(Cita.DOMICILIO, Tratamiento.CREMA, Control.NOCONTROL);
                                    System.out.println(total.costo());                                
                                break;
                            case 2:
                                    Total total1 = new Total(Cita.DOMICILIO, Tratamiento.CREMA, Control.PEQUENO);
                                    System.out.println(total1.costo());                                
                                break;                            
                            case 3:
                                    Total total2 = new Total(Cita.DOMICILIO, Tratamiento.CREMA, Control.MEDIANO);
                                    System.out.println(total2.costo());                                
                                break;                            
                            case 4:
                                    Total total3 = new Total(Cita.DOMICILIO, Tratamiento.CREMA, Control.GRANDE);
                                    System.out.println(total3.costo());                                
                                break;                            
                            default:
                                throw new AssertionError();
                        }                        
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                break;
                
            //Seleciono una opcion que no existe
            default: 
                throw new AssertionError();
        } 
    }
}
