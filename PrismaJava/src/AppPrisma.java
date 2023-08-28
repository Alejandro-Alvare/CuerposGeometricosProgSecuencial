import java.util.Scanner;

public class AppPrisma {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        int CantidadLados;
        double LongitudLados, Altura, AreaTotal, AreaLateral, Volumen;
        double PerimetroBase, AreaBase, Apotema;

        System.out.print("Cantidad de lados: ");
        CantidadLados = leye.nextInt();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Longitud de lados: ");
        LongitudLados = leye.nextDouble();

        PerimetroBase = CantidadLados * LongitudLados;
        AreaLateral = PerimetroBase * Altura;
        double beta = (Math.PI/180) * (360/CantidadLados);
        Apotema = LongitudLados / (2 * Math.tan((beta)/2));
        AreaBase = (PerimetroBase * Apotema) /2;
        AreaTotal = AreaLateral + 2 * AreaBase;
        Volumen = AreaBase * Altura;

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

        leye.close();


     
    }
}
