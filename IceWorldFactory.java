package abstractfactory;

/** Concrete Factory 2 — guarantees a fully Ice-themed family. */
public class IceWorldFactory implements WorldFactory {
    @Override
    public Enemy createEnemy() {
        return new IceEnemy();
    }

    @Override
    public Terrain createTerrain() {
        return new IceTerrain();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new IceSoundtrack();
    }
}
