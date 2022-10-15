package co.com.ies.smolplus.context.dummyuser.infrastructure.primary.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.ies.smolplus.context.dummyuser.domain.user.UserName;
import co.com.ies.smolplus.context.dummyuser.domain.user.UserToCreate;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotNull;

@Schema(name = "userToCreate", description = "A user to create")
class RestUserToCreate {

  private final String name;

  RestUserToCreate(@JsonProperty("name") String name) {
    this.name = name;
  }

  public UserToCreate toDomain() {
    return new UserToCreate(new UserName(getName()));
  }

  @NotNull
  @Schema(description = "Name of this user", required = true)
  public String getName() {
    return name;
  }

}
