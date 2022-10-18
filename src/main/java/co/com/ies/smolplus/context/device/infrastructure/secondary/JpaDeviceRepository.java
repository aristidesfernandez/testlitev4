package co.com.ies.smolplus.context.device.infrastructure.secondary;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Device entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JpaDeviceRepository extends JpaRepository<DeviceEnity, Long>, JpaSpecificationExecutor<DeviceEnity> {
    
}
