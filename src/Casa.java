public class Casa extends Edificio{
    private boolean esAdosada;

    public Casa(boolean esAdosada) {
        this.esAdosada = esAdosada;
    }

    public Casa(double superficie, double precio, String ubicacion, boolean esAdosada) {
        super(superficie, precio, ubicacion);
        this.esAdosada = esAdosada;
    }

    @Override
    public void imprimir() {
    String adosada = "";
    if (this.esAdosada){
        adosada = "adosada ";
    }
    System.out.println("Esta casa " + adosada + "tiene una superficie de " + this.superficie + ", un precio de " + this.precio + " EUR y está situada en " + this.ubicacion);
    }

      


}
