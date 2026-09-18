package factorymethod;

/** Concrete Creator 2 */
public class SkeletonSpawner extends EnemySpawner {
    @Override
    protected Enemy spawnEnemy() {
        return new Skeleton();
    }
}
