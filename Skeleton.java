package factorymethod;

/** Concrete Product 2 */
public class Skeleton implements Enemy {

    private final int health = 45;

    @Override
    public String attack() {
        return "Skeleton fires a bone arrow for 8 damage.";
    }

    @Override
    public int getHealth() {
        return health;
    }
}
