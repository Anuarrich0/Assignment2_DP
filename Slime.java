package factorymethod;

/** Concrete Product 3 */
public class Slime implements Enemy {

    private final int health = 20;

    @Override
    public String attack() {
        return "Slime splashes acid for 3 damage.";
    }

    @Override
    public int getHealth() {
        return health;
    }
}
