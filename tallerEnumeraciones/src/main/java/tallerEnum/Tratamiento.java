
package tallerEnum;


public enum Tratamiento {
    INYECCION(25), 
    PASTILLA(15), 
    CREMA(20);
    
    private final double trataC;
    
    private Tratamiento(final double trataC){
        this.trataC = trataC;
    }
    
    public double getTrataC(){
        return trataC;
    }
}
