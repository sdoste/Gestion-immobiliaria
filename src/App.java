import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Casa casa1 = new Casa(120, 300000, "Sta. Coloma", true);
        Casa casa2 = new Casa(140, 350000, "Badalona", false);

        Piso piso1 = new Piso(90, 250000, "Barcelona", 3, true);
        Piso piso2 = new Piso(80, 220000, "L'Hospitalet", 2, false);

        Trastero trastero1 = new Trastero(10, 5000, "Madrid", true);
        Trastero trastero2 = new Trastero(8, 4000, "Valencia", false);
    
       ArrayList<Edificio> edificios = new ArrayList<>(); 
       Collections.addAll(edificios, casa1, casa2, piso1, piso2, trastero1, trastero2);
        
       for (int i = 0; i<edificios.size(); i++){
        System.out.println("Tipo: " + edificios.get(i).getClass().getSimpleName() + ", ubicación: " + edificios.get(i).getUbicacion());
       }

       for (int i = 0; i<edificios.size(); i++){
        edificios.get(i).imprimir();
       }
    }
}
