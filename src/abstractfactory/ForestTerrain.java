package abstractfactory;

/** Concrete Product B1 */
public class ForestTerrain implements Terrain {
    @Override
    public String describe() {
        return "Dense pine forest with a soft carpet of moss and fallen leaves.";
    }
}
