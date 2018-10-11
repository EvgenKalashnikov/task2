package controller;

import View.View;
import model.Answers;
import service.IService;

public class Controller {
    private final View view;
    private final IService service;

    public Controller(View view, IService service) {
        this.view = view;
        this.service = service;
    }

    public void process(){
        view.showRules();
        int secretNumber = service.getRandom();
        Answers result = null;
        while(!Answers.WIN.equals(result)) {
            int input = service.getInput();
            result = service.valid(input, secretNumber);
            view.print(result);
        }
    }
}
