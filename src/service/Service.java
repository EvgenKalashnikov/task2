package service;

import model.Answers;

import java.util.Random;
import java.util.Scanner;

public class Service implements IService {
    private int minRange;
    private int maxRange = 100;
    private final Scanner scanner;

    public Service(Scanner scanner) {
        this.scanner = scanner;
    }


    public int getInput() {
        int inputValue = -1;
        String next = scanner.next();
        try {
            inputValue = Integer.parseInt(next);
        } catch (NumberFormatException e) {
            return inputValue;
        }
        return inputValue;
    }

    public int getRandom() {
        return new Random().nextInt(101);
    }

    public Answers valid(int input, int secretNumber) {
        if (input < 0) return Answers.INCORRECT_DATA;
        if (input > minRange && input < maxRange) {
            if (input == secretNumber) {
                return Answers.WIN;
            } else if (input > secretNumber) {
                maxRange = input;
                return Answers.LESS;
            } else {
                minRange = input;
                return Answers.MORE;

            }
        }
        return Answers.EXCESS_RANGE;
    }


}


