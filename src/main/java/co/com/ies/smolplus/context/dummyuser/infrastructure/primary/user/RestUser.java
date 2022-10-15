package co.com.ies.smolplus.context.dummyuser.infrastructure.primary.user;

import java.util.UUID;

import co.com.ies.smolplus.context.dummyuser.domain.user.User;
import co.com.ies.smolplus.error.domain.Assert;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "user", description = "A user")
class RestUser {

  private final UUID id;
  private final String name;

  private RestUser(RestUserBuilder builder) {
    id = builder.id;
    name = builder.name;
  }

  public static RestUser from(User user) {
    Assert.notNull("user", user);

    return new RestUserBuilder().id(user.id().get()).name(user.name().get()).build();
  }

  @Schema(description = "ID of this beer", required = true)
  public UUID getId() {
    return id;
  }

  @Schema(description = "Name of this beer", required = true)
  public String getName() {
    return name;
  }

 
  private static class RestUserBuilder {

    private UUID id;
    private String name;

    public RestUserBuilder id(UUID id) {
      this.id = id;

      return this;
    }

    public RestUserBuilder name(String name) {
      this.name = name;

      return this;
    }

    public RestUser build() {
      return new RestUser(this);
    }
  }
}
