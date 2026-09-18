package abstractfactory;

/** Concrete Product C2 */
public class IceSoundtrack implements Soundtrack {
    @Override
    public String describe() {
        return "A sparse, echoing choir underscores the biting wind.";
    }
}
