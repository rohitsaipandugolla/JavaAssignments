package assignmenteight;

public class Main {
    public static void main(String[] args) {
        ExceptionsThrown exceptionsThrown = new ExceptionsThrown();
        try{
            exceptionsThrown.throwAll();
        }catch (ExceptionOne | ExceptionTwo | ExceptionThree exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("This is finally");
        }
    }
}
