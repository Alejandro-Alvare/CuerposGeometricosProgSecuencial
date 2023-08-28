import java.util.Scanner;

public class AppEsfera {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double Radio, Volumen;
        double Area;

        System.out.print("Radio: ");
        Radio = leye.nextDouble();

        Area = 4 * Math.PI * (Radio * Radio);
        Volumen = (4 / 3) * Math.PI * (Radio * Radio * Radio);

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas."); 

        leye.close();
        
    }
}
