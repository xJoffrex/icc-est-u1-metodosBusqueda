package controllers;

import models.Person;
import views.showConsole;

public class MetodosDeBusquedaBinaria {
    private showConsole Mostrar;
    private Person[] Persona;

    public MetodosDeBusquedaBinaria(Person[] Persona, showConsole console) {
        this.Persona = Persona;
        this.Mostrar = console;
        Mostrar.showMessage("Metodo de Búsqueda Binaria");
    }

 
    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = Persona.length - 1;

        while (alto >= bajo) {
            int central = bajo + (alto - bajo) / 2;
            if (Persona[central].getCode() == code) {
                return central;
            } else if (Persona[central].getCode() > code) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }

    public int findPersonByName(String name) {
        int bajo = 0;
        int alto = Persona.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            int comparacion = Persona[central].getName().compareToIgnoreCase(name);

            if (comparacion == 0) {
                return central;
            } else if (comparacion > 0) {
                alto = central - 1; 
            } else {
                bajo = central + 1; 
            }
        }
        return -1;
    }

    public void showPersonByName(String nameToFind) {
        int indexPerson = findPersonByName(nameToFind);
    
        if (indexPerson >= 0) {
            Mostrar.showMessage("Persona con nombre \"" + nameToFind + "\" encontrada en la posición " + indexPerson);
            Mostrar.showMessage(Persona[indexPerson].toString());
        } else {
            Mostrar.showMessage("Persona con nombre \"" + nameToFind + "\" no encontrada");
        }
    }
    
}
