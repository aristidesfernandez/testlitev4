package co.com.ies.smolplus.context.device.infrastructure.secondary;


import java.util.UUID;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaDeviceRepository extends JpaRepository<DeviceEntity, UUID>, JpaSpecificationExecutor<DeviceEntity> {
    
}
