import Models.BmiModel;
import Models.Person;
import dev.View.BmiView;
import dev.kari.idmc.dev.kari.Controller.BmiController;

public class App {
    public static void main(String[] args) {
        BmiView view = new BmiView();
        BmiModel model = new BmiModel(new Person(0, 0));
        BmiController controller = new BmiController(view, model);
        controller.run();
    }
}
