package dev.kari.idmc.dev.kari.Controller;

import Models.BmiModel;

public interface BmiController {

    void run() {
        double weight = view.askWeight();
        double height = view.askHeight();

        Person person = new Person(weight, height);
        model = new BmiModel(person);

        double bmi = model.calculateBMI();

        String classification = model.giveResultsBMI(bmi);

        view.showResults(bmi, classification);
    }
}