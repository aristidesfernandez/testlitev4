package co.com.ies.smolplus.context.dummyuser.application;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.dummyuser.domain.user.User;
import co.com.ies.smolplus.context.dummyuser.domain.user.UserToCreate;
import co.com.ies.smolplus.context.dummyuser.domain.user.UsersCreator;
import co.com.ies.smolplus.context.dummyuser.domain.user.UsersRepository;

@Service
public class UsersApplicationService {

  private final UsersRepository users;
  private final UsersCreator creator;
 
  public UsersApplicationService(UsersRepository users) {
    this.users = users;

    creator = new UsersCreator(users);
  }

  @Transactional
  public User create(UserToCreate userToCreate) {
    return creator.create(userToCreate);
  }
  
}
