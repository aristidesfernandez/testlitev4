package co.com.ies.smolplus.context.device.application;

import java.util.Optional;

import co.com.ies.smolplus.context.device.infrastructure.primary.dto.DeviceDTO;

public interface DeviceService {

    DeviceDTO save(DeviceDTO deviceDTO);

    Optional<DeviceDTO> findOne(Long id);
    
}
