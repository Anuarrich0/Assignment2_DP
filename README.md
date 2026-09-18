# Assignment 2 — Factory Method & Abstract Factory

**Theme:** Game World Kit

## Part A — Factory Method (`src/factorymethod`)

Refactors enemy creation so subclasses decide which concrete `Enemy` to build.

- `Enemy` — Product interface (`attack()`, `getHealth()`)
- `Goblin`, `Skeleton`, `Slime` — Concrete Products
- `EnemySpawner` — abstract Creator; declares the factory method `spawnEnemy()`
  and contains the business method `startEncounter()`, which uses the product
  only through the `Enemy` interface
- `GoblinSpawner`, `SkeletonSpawner`, `SlimeSpawner` — Concrete Creators, each
  overriding `spawnEnemy()`
- `FactoryMethodDemo` — client code; never calls `new Goblin()` etc. directly,
  only works with `EnemySpawner`

Run:
```
javac -d out src/factorymethod/*.java
java -cp out factorymethod.FactoryMethodDemo
```

## Part B — Abstract Factory (`src/abstractfactory`)

Builds a **consistent family** of world products (Enemy + Terrain +
Soundtrack) so it's impossible to mix themes (e.g. an Ice enemy on Forest
terrain).

- `Enemy`, `Terrain`, `Soundtrack` — Abstract Products
- `ForestEnemy` / `IceEnemy`, `ForestTerrain` / `IceTerrain`,
  `ForestSoundtrack` / `IceSoundtrack` — Concrete Products
- `WorldFactory` — Abstract Factory interface with one create-method per
  product in the family
- `ForestWorldFactory`, `IceWorldFactory` — Concrete Factories, each
  guaranteeing an internally-consistent family
- `GameClient` — receives a `WorldFactory` by composition (constructor
  injection) and depends only on the abstract product interfaces; the family
  is chosen exactly once, at construction time

Run:
```
javac -d out src/abstractfactory/*.java
java -cp out abstractfactory.GameClient
```

## Factory Method vs. Abstract Factory

| | Factory Method | Abstract Factory |
|---|---|---|
| Creates | **one** product | a **family** of related products |
| Mechanism | inheritance (subclass overrides a method) | composition (client holds a factory object) |
| Client dependency | depends on abstract Creator | depends on abstract Factory interface, injected |
| Guarantees | which concrete product is built | that all products in a family are mutually compatible |

Factory Method solves "let a subclass decide which single object to create."
Abstract Factory solves "let one decision (which factory) determine an entire
compatible set of objects," which is why `GameClient` never needs an `if` or
`switch` to keep terrain, enemy, and soundtrack in sync — picking the factory
does that for free.

## SOLID connection

- **OCP:** adding a new world (e.g. Desert) or enemy (e.g. Dragon) means
  adding new classes, not editing `GameClient` or `EnemySpawner`.
- **SRP:** each Concrete Product only knows its own behaviour; each Creator/
  Factory only knows how to build its assigned objects.

## Drawback / when this is over-engineering

For a game with only one or two enemy types and no plans to add themed
worlds, both patterns add indirection (extra classes, extra interfaces) for
no real benefit — a couple of `if` statements would be simpler and easier to
read. The patterns pay off once you expect **new variants to keep arriving**
and want to add them without touching existing, tested code.
