package abstractfactory;

/** Concrete Product A2 */
public class IceEnemy implements Enemy {
    @Override
    public String describe() {
        return "A Frost Wraith drifts across the ice, trailing frozen mist.";
    }
}
