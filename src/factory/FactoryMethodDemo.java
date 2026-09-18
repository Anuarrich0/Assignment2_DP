package factorymethod;

import java.util.List;

/**
 * Client code for Part A.
 * Notice the client never calls "new Goblin()", "new Skeleton()", etc.
 * It only depends on EnemySpawner (abstract creator) and Enemy (interface).
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<EnemySpawner> spawners = List.of(
                new GoblinSpawner(),
                new SkeletonSpawner(),
                new SlimeSpawner()
        );

        for (EnemySpawner spawner : spawners) {
            System.out.println(spawner.startEncounter());
        }
    }
}
