package factorymethod;

/**
 * Product interface (Part A).
 * Every concrete enemy must be able to describe itself and attack.
 */
public interface Enemy {
    String attack();
    int getHealth();
}
