package rohit.assignment.main;

import rohit.assignment.data.ClassOne;
import rohit.assignment.singleton.ClassTwo;

public class Main {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        classOne.printMemberVariables();
        classOne.printLocalVariables();

        ClassTwo classTwo = new ClassTwo();
        classTwo.printString();
    }
}
