package tallerEnum;
import java.util.Scanner;

public class Total {    
     //Variables de tipo enumeraciones 
    // La variable taxTratamiento es el impuesto del 13% de la clase Tratamiento
    private Cita cita;
    private Tratamiento tratamiento;
    private Control control;
    Integer km, costoDistancia;
    double taxTratamiento = 1.13;

    
    public Total(final Cita cita, final Tratamiento tratamiento, final Control control){
        this.cita = cita;
        this.tratamiento = tratamiento;
        this.control = control;
    }

    //En caso de un servicio a domicilio calcular costo por distancia 
    public void calculoDistance(Integer km){
        costoDistancia = (km * 2);
    }
    
    public double costo(){
        return ((cita.getCitaC()+costoDistancia)+ (tratamiento.getTrataC()*taxTratamiento) + control.getControlC());
    }

    
}
