import org.junit.jupiter.api.Test;

import Models.BmiModel;
import Models.Person;
import dev.View.BmiView;
import dev.kari.idmc.dev.kari.Controller.BmiController;

public class BmiControllerTest {
    
       @Test
    public void testRun() {
        BmiView fakeView = new BmiView() {
            @Override
            public double askWeight() {
                return 70;
            }

            @Override
            public double askHeight() {
                return 1.75;
            }

            @Override
            public void showResults(double bmi, String classification) {
            }
        };

        Person person = new Person(70, 1.75);
        BmiModel fakeModel = new BmiModel(person);

        BmiController controller = new BmiController(fakeView, fakeModel);

        controller.run();
    }
}
}
