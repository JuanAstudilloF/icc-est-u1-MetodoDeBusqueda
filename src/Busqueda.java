import java.util.List;

public class Busqueda {

    public static void buscarPorEdad(List<Persona> personas, int edadBuscada) {
        int bajo = 0;
        int alto = personas.size() - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas.get(centro).edad;

            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas.get(i).edad);
                if (i != alto) System.out.print(" | ");
            }
            System.out.println();
            System.out.printf("bajo=%d      alto=%d      centro=%d      valorCentro=%d        ",
                   bajo, alto, centro, valorCentro);

            if (valorCentro == edadBuscada) {
                System.out.println("encontado");
                System.out.println("la persona con la edad" + edadBuscada + "es" + personas.get(centro).nombre);
                return;
            } else if (valorCentro < edadBuscada) {
                System.out.println("derecha");
                bajo = centro + 1;
            } else {
                System.out.println("izquierda");
                alto = centro - 1;
            }
        }

        System.out.println("no se encontro una persona con la edad" + edadBuscada);
    }
}
