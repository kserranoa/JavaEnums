package tallerEnum;

public enum Cita {
    //Enumeracion para las alternativas de citas
    CLINICA(20), 
    DOMICILIO(40);
    
    private final double citaC;
        
    private Cita(final double citaC){
        this.citaC = citaC;
    } 
        
    public double getCitaC(){
        return citaC;
    }
}
