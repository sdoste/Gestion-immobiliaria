public class Trastero extends Edificio{
    private final boolean tieneSeguridad;

    
    public Trastero(boolean tieneSeguridad) {
        this.tieneSeguridad = tieneSeguridad;
    }

    public Trastero(double superficie, double precio, String ubicacion, boolean tieneSeguridad) {
        super(superficie, precio, ubicacion);
        this.tieneSeguridad = tieneSeguridad;
    }

    @Override
    public void imprimir() {
    String seguridad = "";
    if (this.tieneSeguridad){
        seguridad = "con seguridad ";
    }
    System.out.println("Este trastero " + seguridad + "tiene una superficie de " + this.superficie + ", un precio de " + this.precio + " EUR y está situada en " + this.ubicacion);
    }
}
