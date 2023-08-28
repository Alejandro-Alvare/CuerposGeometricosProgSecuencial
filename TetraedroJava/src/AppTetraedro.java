public class AppTetraedro {
    public static void main(String[] args) throws Exception {
        
        double Num1 = 3;
        double Num2 = 2;
        double Num3 = 6;
        double Aristas = 6;
        double Area, Volumen, Altura;

        Area = (Aristas * Aristas) * Math.sqrt(Num1);
        double psi = (Aristas * Aristas * Aristas);
        Volumen = Math.sqrt(Num2) / 12 * ((psi));
        Altura = Aristas * (Math.sqrt(Num3) / 3); 
        
        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Altura: " + Altura );
        
    }
}
