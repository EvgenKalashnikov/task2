package service;

import model.Answers;

public interface IService {
    int getInput();

    int getRandom();

    Answers valid(int input, int secretNumber);

}
