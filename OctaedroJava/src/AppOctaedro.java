public class AppOctaedro {
    public static void main(String[] args) throws Exception {

        double Num1 = 3;
        double Num2 = 2;
        double Aristas = 12;
        double Area, Volumen;

        Area = 2 * (Aristas * Aristas) * Math.sqrt(Num1);
        double rho = (Aristas * Aristas * Aristas);
        Volumen = Math.sqrt(Num2) / 3 * ((rho));

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");
        
        
    }
}
