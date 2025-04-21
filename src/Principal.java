import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la cantidad de personas:");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el numero de persona:");
            System.out.print(" Nombre:");
            String nombre = scanner.nextLine();

            System.out.print(" Edad:");
            int edad = scanner.nextInt();
            scanner.nextLine();

            if (edad < 0) {
                System.out.println("la edad no puede ser negativa, intente de nuevo");
                i--;
                continue;
            }

            personas.add(new Persona(nombre, edad));
        }

        personas.sort(Comparator.comparingInt(p -> p.edad));

        System.out.print("valor la persona de la edad:");
        int edadBuscada = scanner.nextInt();

        Busqueda.buscarPorEdad(personas, edadBuscada);
    }
}
