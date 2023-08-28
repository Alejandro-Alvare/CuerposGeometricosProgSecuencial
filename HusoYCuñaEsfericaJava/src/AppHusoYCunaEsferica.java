import java.util.Scanner;

public class AppHusoYCunaEsferica {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double Radio, NumeroGrados;
        double AreaHuso, VolumenCuna;

        System.out.print("Radio: ");
        Radio = leye.nextDouble();
        System.out.print("Numero de grados: ");
        NumeroGrados = leye.nextDouble();

        AreaHuso = 4 * Math.PI * (Radio * Radio) * NumeroGrados / 360;
        double nu = Math.PI * (Radio * Radio * Radio);
        VolumenCuna = 4 / 3 * ((nu) * NumeroGrados) / 360;

        System.out.println("Area Huso: " + AreaHuso + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen Cuña: " + VolumenCuna + "unidades cubicas.");

        leye.close();        
    }
}
