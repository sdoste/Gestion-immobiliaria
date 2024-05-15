abstract class Edificio {
    protected double superficie;
    protected double precio;
    protected String ubicacion;

    protected Edificio(){

    }

    protected Edificio(double superficie, double precio, String ubicacion) {
        this.superficie = superficie;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    protected void imprimir(){}

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    };
}
