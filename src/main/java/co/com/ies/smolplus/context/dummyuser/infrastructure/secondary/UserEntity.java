package co.com.ies.smolplus.context.dummyuser.infrastructure.secondary;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.com.ies.smolplus.context.dummyuser.domain.UserId;
import co.com.ies.smolplus.context.dummyuser.domain.user.User;
import co.com.ies.smolplus.error.domain.Assert;

@Entity
@Table(name = "users")
class UserEntity {

  @Id
  @Column(name = "id")
  private UUID id;

  @Column(name = "name")
  private String name;

  public static UserEntity from(User beer) {
    Assert.notNull("beer", beer);

    return new UserEntity().id(beer.id().get()).name(beer.name().get());
  }

  private UserEntity id(UUID id) {
    this.id = id;

    return this;
  }

  private UserEntity name(String name) {
    this.name = name;

    return this;
  }

  public User toDomain() {
    return User.builder().id(new UserId(id)).build();
  }

}
