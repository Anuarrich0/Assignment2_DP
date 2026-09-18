package abstractfactory;

public class IceTerrain implements Terrain {
    @Override
    public String describe() {
        return "A frozen tundra of cracked glaciers and howling wind.";
    }
}
