import View.View;
import controller.Controller;
import service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new View(),new Service(new Scanner(System.in)));
        controller.process();
    }
}
