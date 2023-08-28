import java.util.Scanner;

public class AppOrtoedro {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

        double MedidaA, MedidaB, MedidaC;
        double Area, Volumen, Diagonal;

        System.out.print("Medida de A: ");
        MedidaA = leye.nextDouble();
        System.out.print("Medida de B: ");
        MedidaB = leye.nextDouble();
        System.out.print("Medida de C: ");
        MedidaC = leye.nextDouble();

        double zeta = (MedidaA * MedidaB);
        double eta = (MedidaA * MedidaC);
        double tau = (MedidaB * MedidaC);
        Area = 2 * ((zeta) * (eta) * (tau));
        Volumen = (MedidaA * MedidaB * MedidaC);
        double Kappa = (MedidaA * MedidaA);
        double theta = (MedidaB * MedidaB);
        double sigma = (MedidaC * MedidaC);
        double omega = ((Kappa) + (theta) + (sigma));
        Diagonal = Math.sqrt((omega));

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Diagonal: " + Diagonal );

        leye.close();
           
    }
}
