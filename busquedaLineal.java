public class busquedaLineal {


    public static int buscar(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == valorBuscado) {
                return i; 
            }

        }
        return -1; 
    }
    
}
