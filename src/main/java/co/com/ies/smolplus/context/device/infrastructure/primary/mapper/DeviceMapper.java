package co.com.ies.smolplus.context.device.infrastructure.primary.mapper;


import org.mapstruct.*;

import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.context.device.infrastructure.primary.dto.DeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface DeviceMapper extends DomainMapper<DeviceDTO, Device> {
    
}
    