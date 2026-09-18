package factorymethod;

/**
 * Abstract Creator.
 * Declares the factory method (spawnEnemy) and a business method
 * (startEncounter) that uses the product only through the Enemy interface.
 * Subclasses decide which concrete Enemy gets created.
 */
public abstract class EnemySpawner {

    // The factory method — overridden by each concrete creator.
    protected abstract Enemy spawnEnemy();

    // Business logic that depends only on the Product interface,
    // never on a concrete class. This is what "the creator does work" means.
    public String startEncounter() {
        Enemy enemy = spawnEnemy();
        return "A wild " + enemy.getClass().getSimpleName()
                + " appears with " + enemy.getHealth() + " HP! "
                + enemy.attack();
    }
}
