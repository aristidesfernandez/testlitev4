package co.com.ies.smolplus.context.device.application;

import java.util.Optional;
import java.util.UUID;

import co.com.ies.smolplus.context.device.infrastructure.primary.dto.DeviceDTO;

public interface DeviceService {

    DeviceDTO save(DeviceDTO deviceDTO);

    Optional<DeviceDTO> findOne(UUID id);
    
}
