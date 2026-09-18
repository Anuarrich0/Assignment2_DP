package factorymethod;

/** Concrete Creator 1 */
public class GoblinSpawner extends EnemySpawner {
    @Override
    protected Enemy spawnEnemy() {
        return new Goblin();
    }
}
