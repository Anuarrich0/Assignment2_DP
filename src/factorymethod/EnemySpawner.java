package factorymethod;

public abstract class EnemySpawner {    
    protected abstract Enemy spawnEnemy();
    public String startEncounter() {
        Enemy enemy = spawnEnemy();
        return "A wild " + enemy.getClass().getSimpleName()
                + " appears with " + enemy.getHealth() + " HP! "
                + enemy.attack();
    }
}
