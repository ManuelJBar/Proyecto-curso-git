public class Ejercicio4 {
    public static void main(String[] args) {
        int edad = 25;
        double peso = 70.5;
        char letra = 'A';
        boolean esEstudiante = true;
        String nombre = "Juan";

        // Nuevas variables
        long poblacion = 7800000000L; // Tipo long
        float altura = 1.75f;         // Tipo float
        byte temperatura = 30;         // Tipo byte
        short año = 2023;              // Tipo short
        String ciudad = "Madrid";      // Tipo String adicional

        // Nuevas variables adicionales
        double saldoBanco = 1500.75;         // Tipo double
        String[] paises = {"España", "Francia", "Italia"}; // Array de String
        boolean[] diasDeTrabajo = {true, true, true, true, true, false, false}; // Array de boolean

        // Salida de las variables
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Inicial: " + letra);
        System.out.println("Estudiante: " + esEstudiante);
        System.out.println("Población mundial: " + poblacion);
        System.out.println("Altura: " + altura);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Año: " + año);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Saldo en el banco: " + saldoBanco);

        // Mostrando los elementos del array de paises
        System.out.print("Paises: ");
        for (String pais : paises) {
            System.out.print(pais + " ");
        }
        System.out.println();

        // Mostrando los días de trabajo
        System.out.print("Días de trabajo (lunes a domingo): ");
        for (boolean dia : diasDeTrabajo) {
            System.out.print(dia + " ");
        }
        System.out.println();
    }
}