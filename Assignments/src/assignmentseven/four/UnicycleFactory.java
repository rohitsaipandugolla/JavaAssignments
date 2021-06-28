package assignmentseven.four;

public class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}