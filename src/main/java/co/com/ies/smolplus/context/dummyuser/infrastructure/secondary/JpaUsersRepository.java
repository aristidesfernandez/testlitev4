package co.com.ies.smolplus.context.dummyuser.infrastructure.secondary;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

interface JpaUsersRepository extends JpaRepository<UserEntity, UUID> {
 
}
