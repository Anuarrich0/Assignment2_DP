package abstractfactory;

public class GameClient {

    private final Enemy enemy;
    private final Terrain terrain;
    private final Soundtrack soundtrack;

    public GameClient(WorldFactory factory) {
        this.enemy = factory.createEnemy();
        this.terrain = factory.createTerrain();
        this.soundtrack = factory.createSoundtrack();
    }

    public void loadWorld() {
        System.out.println("Terrain:    " + terrain.describe());
        System.out.println("Soundtrack: " + soundtrack.describe());
        System.out.println("Enemy:      " + enemy.describe());
    }

    public static void main(String[] args) {
        System.out.println("== Loading Forest World ==");
        new GameClient(new ForestWorldFactory()).loadWorld();

        System.out.println();

        System.out.println("== Loading Ice World ==");
        new GameClient(new IceWorldFactory()).loadWorld();
    }
}
