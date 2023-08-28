import java.util.Scanner;

public class AppDodecaedro {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);
        
        int CantidadLados = 12;
        double Num5 = 5;
        double Aristas = 30;
        double Area, Volumen, APenta, LongitudLados, Apotema;

        System.out.print("Longitud de lados: ");
        LongitudLados = leye.nextDouble();

        double phi = (Math.PI/180) * (360/CantidadLados);
        Apotema = LongitudLados / (2 * Math.tan((phi)/2));
        APenta = 5 / 2 * (Aristas * Apotema);
        double epsilon = (25 + (10 * Math.sqrt(Num1)));
        Area = 3 * (Aristas * Aristas) * (Math.sqrt(epsilon));
        double omicron = (Aristas * Aristas * Aristas);
        Volumen = 1/4 * (15 + 7 * Math.sqrt(Num5)) * (omicron);

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Pentagonal: " + APenta + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

        leye.close();

    }
}
