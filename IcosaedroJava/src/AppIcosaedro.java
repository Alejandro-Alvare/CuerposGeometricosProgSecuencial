public class AppIcosaedro {
    public static void main(String[] args) throws Exception {
        
        double Num4 = 3;
        double Aristas = 30;
        double Num5 = 5;
        double Area, Volumen;

        Area = 5 * (Aristas * Aristas) * (Math.sqrt(Num4));
        double Gamma = Aristas * Aristas * Aristas;
        Volumen = 5 / 12 * (3 + Math.sqrt(Num5)) * (Gamma);

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");
    }
}
