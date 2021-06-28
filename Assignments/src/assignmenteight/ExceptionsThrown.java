package assignmenteight;

public class ExceptionsThrown {
    public void throwOne() throws ExceptionOne {
        throw new ExceptionOne("Caught First Exception");
    }
    public void throwTwo() throws ExceptionTwo {
        throw new ExceptionTwo("Caught Second Exception");
    }
    public void throwThree() throws ExceptionThree {
        throw new ExceptionThree("Caught Third Exception");
    }
    public void throwAll() throws ExceptionOne, ExceptionTwo, ExceptionThree {
        throwOne();
        throwTwo();
        throwThree();
    }
}
