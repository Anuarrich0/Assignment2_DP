package abstractfactory;

/** Concrete Product C1 */
public class ForestSoundtrack implements Soundtrack {
    @Override
    public String describe() {
        return "Gentle strings and birdsong loop softly in the background.";
    }
}
