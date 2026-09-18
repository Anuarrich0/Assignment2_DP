package factorymethod;
public class SkeletonSpawner extends EnemySpawner {
    @Override
    protected Enemy spawnEnemy() {
        return new Skeleton();
    }
}
