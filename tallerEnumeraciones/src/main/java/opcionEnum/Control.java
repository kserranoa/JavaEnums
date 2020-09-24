package opcionEnum;

public enum Control {
    //Enumeracion para las alternativas de control
    NOCONTROL(0),
    PEQUENO(150),
    MEDIANO(200), 
    GRANDE(300);
    
    private final double controlC; 
    
    private Control(final double controlC){
        this.controlC = controlC;
    }
    
    public double getControlC(){
        return controlC;
    }
}
