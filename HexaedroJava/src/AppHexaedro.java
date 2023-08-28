public class AppHexaedro {
    public static void main(String[] args) throws Exception {
        
        double Aristas = 12;
        double Num1 = 3;
        double Area, Volumen, Diagonal;

        Area = 6 * (Aristas * Aristas);
        double mu = (Aristas * Aristas * Aristas);
        Volumen = ((mu));
        Diagonal = Aristas * Math.sqrt(Num1);

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Diagonal: " + Diagonal );
    }
}
