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
                                
                                break;
                            case 2:
                                
                                break;                            
                            case 3:
                                
                                break;                            
                            case 4:
                                
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
                                
                                break;
                            case 2:
                                
                                break;                            
                            case 3:
                                
                                break;                            
                            case 4:
                                
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
                                
                                break;
                            case 2:
                                
                                break;                            
                            case 3:
                                
                                break;                            
                            case 4:
                                
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
                                
                                break;
                            case 2:
                                
                                break;                            
                            case 3:
                                
                                break;                            
                            case 4:
                                
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
                                
                                break;
                            case 2:
                                
                                break;                            
                            case 3:
                                
                                break;                            
                            case 4:
                                
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
                                
                                break;
                            case 2:
                                
                                break;                            
                            case 3:
                                
                                break;                            
                            case 4:
                                
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
                System.out.println("Opcion no existe, fin del programa");
        } 
    }
}
