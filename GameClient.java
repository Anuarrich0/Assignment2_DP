package abstractfactory;

/**
 * Client class using composition.
 * It receives a WorldFactory through its constructor and only ever
 * talks to the Enemy / Terrain / Soundtrack interfaces — it never
 * references ForestEnemy, IceTerrain, etc. directly.
 */
public class GameClient {

    private final Enemy enemy;
    private final Terrain terrain;
    private final Soundtrack soundtrack;

    // The family is selected in exactly one place: whoever constructs
    // GameClient decides which WorldFactory to pass in.
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
