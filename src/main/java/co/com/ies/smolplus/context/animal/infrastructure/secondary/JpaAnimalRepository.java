package co.com.ies.smolplus.context.animal.infrastructure.secondary;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

interface JpaAnimalRepository extends JpaRepository<AnimalEntity, UUID> {
 
}
