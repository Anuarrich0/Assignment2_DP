package factorymethod;
public class SlimeSpawner extends EnemySpawner {
    @Override
    protected Enemy spawnEnemy() {
        return new Slime();
    }
}
