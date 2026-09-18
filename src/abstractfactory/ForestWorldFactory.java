package abstractfactory;

/** Concrete Factory 1 — guarantees a fully Forest-themed family. */
public class ForestWorldFactory implements WorldFactory {
    @Override
    public Enemy createEnemy() {
        return new ForestEnemy();
    }

    @Override
    public Terrain createTerrain() {
        return new ForestTerrain();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new ForestSoundtrack();
    }
}
