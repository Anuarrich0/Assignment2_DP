package abstractfactory;

/** Concrete Product A1 */
public class ForestEnemy implements Enemy {
    @Override
    public String describe() {
        return "A camouflaged Dryad Wolf slips between the trees.";
    }
}
