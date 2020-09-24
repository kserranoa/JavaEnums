package tallerEnum;

import opcionEnum.Tratamiento;
import opcionEnum.Control;
import opcionEnum.Cita;

public class Total {    
     //Variables de tipo enumeraciones     
    private Cita cita;
    private Tratamiento tratamiento;
    private Control control;

    // La variable taxTratamiento es el impuesto del 13% de la clase enum Tratamiento
    double taxTratamiento = 1.13;
    
    //En caso de un servicio a domicilio calcular costo por distancia 
    Excepciones calculoDistancia = new Excepciones();
    double costoDistancia = calculoDistancia.costoDistancia;
    
    public Total(final Cita cita, final Tratamiento tratamiento, final Control control){
        this.cita = cita;
        this.tratamiento = tratamiento;
        this.control = control;
    }
    
    public double costo(){
        return (cita.getCitaC() + costoDistancia+ (tratamiento.getTrataC()*taxTratamiento) + control.getControlC());
    }
 
}