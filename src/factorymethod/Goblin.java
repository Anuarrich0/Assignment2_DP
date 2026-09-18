package factorymethod;
public class Goblin implements Enemy {

    private final int health = 30;

    @Override
    public String attack() {
        return "Goblin slashes with a rusty dagger for 5 damage.";
    }

    @Override
    public int getHealth() {
        return health;
    }
}
