package co.com.ies.smolplus.context.dummyuser.infrastructure.primary.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.dummyuser.application.UsersApplicationService;
import co.com.ies.smolplus.context.dummyuser.domain.user.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/users")
class UsersResource {

  private final UsersApplicationService usersService;

  public UsersResource(UsersApplicationService users) {
    this.usersService = users;
  }

  @PostMapping
  @Operation(summary = "Add a user to the catalog")
  @ApiResponse(description = "User added to the catalog", responseCode = "201")
  ResponseEntity<RestUser> addUser(@Validated @RequestBody RestUserToCreate userToCreate) {
    User createdUser = usersService.create(userToCreate.toDomain());

    return new ResponseEntity<>(RestUser.from(createdUser), HttpStatus.CREATED);
  }


}
