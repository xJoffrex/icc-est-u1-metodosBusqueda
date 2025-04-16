
import controllers.MetodosBusqueda;
import controllers.MetodosDeBusquedaBinaria;
import models.Person;
import views.showConsole;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = new Person[7];

        personas[0] = new Person(100, "Juan");
        personas[1] = new Person(101, "Maria");
        personas[2] = new Person(102, "Carlos");
        personas[3] = new Person(103, "Sofia");
        personas[4] = new Person(104, "Luis");
        personas[5] = new Person(105, "Ana");
        personas[6] = new Person(106, "Miguel");


    
        showConsole console = new showConsole(); 
        MetodosBusqueda mB = new MetodosBusqueda(personas, console); 
        MetodosDeBusquedaBinaria mBB = new MetodosDeBusquedaBinaria(personas, console);

    
        int codigoBuscar = 103;
        int resultado = mB.findPersonByCode(codigoBuscar);
        int resultadoB = mBB.findPersonByCode(codigoBuscar);

        System.out.println("Esta en la posicion " + resultadoB);


        console.showMessage("busqueda lineal: " + resultado);
        console.showMessage("busqueda binaria: " + resultadoB);
        String nombreBuscar = "Maria"; 
        mBB.showPersonByName(nombreBuscar);

        if (resultado != -1) {
            System.out.println("Persona encontrada: " + personas[resultado]);
        } else {
            System.out.println("Persona con codigo " + codigoBuscar + " no encontrada.");
        }


        /* Deber de la busqueda lineal */

        int[] numeros = {3, 8, 2, 9, 5, 3, 1, 5, 6, 7, 8}; // agarra la primera instancia del 3 osea 0
        int valor = 3;
        


        int posicion = busquedaLineal.buscar(numeros, valor);
    



        if (posicion != -1) {
            System.out.println("El valor del arreglo numeros se encontro en la posicion  " + posicion);
        } else {
            System.out.println("El valor no se encuentra en el arreglo " + valor);
        }
    }
}
