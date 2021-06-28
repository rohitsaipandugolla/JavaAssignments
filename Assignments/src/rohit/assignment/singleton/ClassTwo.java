package rohit.assignment.singleton;

public class ClassTwo {
    private String member;

    public static ClassTwo initialize(String str) {
       // member = str; //Static method can only access static variable, if we try to access it throws error.
        return new ClassTwo();
    }

    public void printString() {
        System.out.println(member);
    }
}
