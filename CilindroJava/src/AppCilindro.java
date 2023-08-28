import java.util.Scanner;

public class AppCilindro {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double Radio, Altura, AreaLateral, AreaTotal, Volumen;
        double PerimetroBase, AreaBase;

        System.out.print("Radio: ");
        Radio = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();

        PerimetroBase = (2 * Math.PI * Radio);
        AreaLateral = PerimetroBase * Altura;
        AreaBase = (Math.PI * Radio * Radio);
        AreaTotal = (AreaLateral) + (2 * AreaBase);
        Volumen = (AreaBase * Altura);

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

        leye.close();

    }
}
