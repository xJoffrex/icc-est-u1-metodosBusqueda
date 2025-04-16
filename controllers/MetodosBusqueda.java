package controllers;

import models.Person;
import views.showConsole;

public class MetodosBusqueda {
    private Person[] people;
    private showConsole console;

    public MetodosBusqueda(Person[] people, showConsole console) {
        this.people = people;
        this.console = console;
    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPerson() {
        int codeToFind = console.inputCode();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson >= 0) {
            console.showMessage("Persona con codigo " + codeToFind);
            console.showMessage(people[indexPerson].toString());
        } else {
            console.showMessage("Persona no encontrada.");
        }
    }
}
