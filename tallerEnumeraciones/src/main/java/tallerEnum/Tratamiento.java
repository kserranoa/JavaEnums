
package tallerEnum;


public enum Tratamiento {
    //Enumeracion para las alternativas de los tratamientos
    //Estos tratamientos tienen un Tax que se agrega a todos
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
