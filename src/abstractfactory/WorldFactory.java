package abstractfactory;

/**
 * Abstract Factory interface.
 * One create-method per product in the family, so every concrete factory
 * is forced to produce a complete, internally-consistent set.
 */
public interface WorldFactory {
    Enemy createEnemy();
    Terrain createTerrain();
    Soundtrack createSoundtrack();
}
