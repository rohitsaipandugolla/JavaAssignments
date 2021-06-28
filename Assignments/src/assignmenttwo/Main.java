package assignmenttwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        CheckString checkString = new CheckString();
        boolean check = checkString.checkString(inputString);
        if(check)
            System.out.println("valid string");
        else
            System.out.println("not valid string");
    }
}
