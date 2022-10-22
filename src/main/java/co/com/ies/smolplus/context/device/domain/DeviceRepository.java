package co.com.ies.smolplus.context.device.domain;

import java.util.UUID;
import java.util.Optional;

public interface DeviceRepository {

    void save(Device device);
    
    Optional<Device> findOne(UUID deviceid);
    
}
