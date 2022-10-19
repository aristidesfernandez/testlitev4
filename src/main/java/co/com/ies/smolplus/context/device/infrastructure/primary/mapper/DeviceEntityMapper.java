package co.com.ies.smolplus.context.device.infrastructure.primary.mapper;


import org.mapstruct.*;

import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.context.device.infrastructure.secondary.DeviceEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface DeviceEntityMapper extends EntityMapper<Device, DeviceEntity> {

}
    