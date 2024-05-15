public class Piso extends Edificio {
    private int planta;
    private boolean tieneAscensor;
    public Piso(int planta, boolean tieneAscensor) {
        this.planta = planta;
        this.tieneAscensor = tieneAscensor;
    }

    public Piso(double superficie, double precio, String ubicacion, int planta, boolean tieneAscensor) {
        super(superficie, precio, ubicacion);
        this.planta = planta;
        this.tieneAscensor = tieneAscensor;
    }

    @Override
    public void imprimir() {
    String ascensor = "";
    if (this.tieneAscensor){
        ascensor = " con ascensor ";
    }
    System.out.println("Este piso en la planta nº " + this.planta + ascensor + "tiene una superficie de " + this.superficie + ", un precio de " + this.precio + " EUR y está situada en " + this.ubicacion);
    }
}
