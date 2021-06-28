package rohit.assignment.data;

public class ClassOne {
    private int memberInt;    //Members variables are initialized by default in java
    private char memberChar;

    public void printMemberVariables() {
        System.out.println("int variable value: " + memberInt);
        System.out.println("char variable value: " + memberChar);
    }

    public void printLocalVariables() {
        int localInt;
        char localChar;
        /* Local Variables should be initialised.
        If we try to print without initialising, it throws errors
         */
        //System.out.println("int variable value: " + localInt);
        //System.out.println("char variable value: " + localChar);
    }
}
