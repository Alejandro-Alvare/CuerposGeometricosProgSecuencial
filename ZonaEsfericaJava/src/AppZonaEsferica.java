import java.util.Scanner;

public class AppZonaEsferica {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double Altura, Radio, RadioMayor;
        double Area, Volumen;

        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Radio Mayor: ");
        RadioMayor = leye.nextDouble();
        System.out.print("Radio: ");
        Radio = leye.nextDouble();

        double lota = (Altura * Altura);
        double chi = (3 * (Radio * Radio));
        double alpha = (3 * (Radio * Radio));
        Area = (2 * Math.PI * RadioMayor * Altura);
        Volumen = Math.PI * Altura * ((lota) + (chi) + (alpha)) / 6;

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

        leye.close();
        
    }
}
