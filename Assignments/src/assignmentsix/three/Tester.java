package assignmentsix.three;

public class Tester {
    public static void main(String[] args) {
        Mobile[] array=new Mobile[10];
        //Result: Initialization messages arent printed as objects havent been created.

        Mobile[] newArray=new Mobile[]{new Mobile("Apple"),new Mobile("Redmi"),};
        //Initialization messages are printed here as objects are created
    }
}