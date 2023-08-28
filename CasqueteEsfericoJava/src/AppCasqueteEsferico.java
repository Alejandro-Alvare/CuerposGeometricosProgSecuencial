import java.util.Scanner;

public class AppCasqueteEsferico {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double RadioMayor, Altura;
        double Area, Volumen;

        System.out.print("Radio mayor: ");
        RadioMayor = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();

        Area = (2 * Math.PI * RadioMayor * Altura);
        double xi = (3 * RadioMayor);
        Volumen = Math.PI * (Altura * Altura) * ((xi) - Altura) / 3;

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

        leye.close();
        
    }
}
