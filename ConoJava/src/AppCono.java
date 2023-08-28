import java.util.Scanner;

public class AppCono {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double Radio, Altura, AreaLateral, AreaTotal, Volumen;
        double AreaBase, Generatriz;

        System.out.print("Radio: ");
        Radio = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();

        Generatriz = (Altura * Altura) + (Radio * Radio);
        AreaLateral = (Math.PI * Radio * Generatriz);
        AreaBase = (Math.PI) * (Radio * Radio);
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
