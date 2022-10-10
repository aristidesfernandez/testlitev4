# Jpa pages

Let's consider a very common use case to get paginated information from a JPA Spring Repository. In `JpaBeersRepository` we have this method: 

```java
Page<BeerEntity> findAll(Pageable pagination);
```

We can call that this way: 

```java
private final JpaBeersRepository beers;

// ...

public Testlitev4Page<Beer> list(Testlitev4Pageable pagination) {
  return Testlitev4Pages.from(
      beers.findAll(Testlitev4Pages.from(pagination, Sort.by(Sort.Direction.ASC, "name"))),
      BeerEntity::toDomain
    );
}
```

And we'll need a mapping method in `BeerEntity`: 

```java
Beer toDomain() {
  // ...
}
```