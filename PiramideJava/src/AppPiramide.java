import java.util.Scanner;

public class AppPiramide {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        int CantidadLados;
        double LongitudLados, Altura, AreaLateral, AreaTotal, Volumen;
        double PerimetroBase, AreaBase, Apotema, ApotemaPiramide;

        System.out.print("Cantidad de lados: ");
        CantidadLados = leye.nextInt();
        System.out.print("Perimetro de la base: ");
        PerimetroBase = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Longitud de lados: ");
        LongitudLados = leye.nextDouble();

        double delta = (Math.PI/180) * (360/CantidadLados);
        Apotema = LongitudLados / (2 * Math.tan((delta)/2));
        ApotemaPiramide = (Altura * Altura) + (Apotema * Apotema);
        AreaLateral = (PerimetroBase * ApotemaPiramide) / 2;
        AreaBase = PerimetroBase * Altura;
        AreaTotal = AreaLateral + AreaBase;
        Volumen = (AreaBase * Altura) / 3;

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

        leye.close();
    }
}
