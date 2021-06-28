package assignmenteight;

public class Main {
    public static void main(String[] args) {
        ExceptionsThrown exceptionsThrown = new ExceptionsThrown();
        try{
            exceptionsThrown.throwAll();
        }catch (Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("This is finally");
        }
    }
}
