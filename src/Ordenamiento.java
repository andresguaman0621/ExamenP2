import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {
/*    public int busquedaBinariaPrecio(ArrayList<Plato> lista, Plato objetivo) {
        int izquierda = 0;
        int derecha = lista.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            Plato platoMedio = lista.get(medio);

            int comparacion = platoMedio.getPrecio().compareTo(objetivo.getPrecio());

            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }*/

    public int busquedaBinariaNombre(ArrayList<Plato> lista, Plato objetivo) {
        int izquierda = 0;
        int derecha = lista.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            Plato platoMedio = lista.get(medio);

            int comparacion = platoMedio.getNombre().compareToIgnoreCase(objetivo.getNombre());

            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }


}
