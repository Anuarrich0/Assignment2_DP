package factorymethod;

/** Concrete Creator 3 */
public class SlimeSpawner extends EnemySpawner {
    @Override
    protected Enemy spawnEnemy() {
        return new Slime();
    }
}
