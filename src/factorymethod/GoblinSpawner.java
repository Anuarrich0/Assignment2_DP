package factorymethod;
public class GoblinSpawner extends EnemySpawner {
    @Override
    protected Enemy spawnEnemy() {
        return new Goblin();
    }
}
