package co.com.ies.smolplus.context.device.infrastructure.secondary;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.context.device.domain.DeviceRepository;
import co.com.ies.smolplus.context.device.infrastructure.primary.mapper.DeviceEntityMapper;
import co.com.ies.smolplus.error.domain.Assert;

@Repository
public class SpringDataDeviceRepository implements DeviceRepository {  

  private final JpaDeviceRepository jpaDeviceRepository;

  private DeviceEntityMapper deviceEntityMapper;
 
  public SpringDataDeviceRepository(JpaDeviceRepository jpaDeviceRepository, DeviceEntityMapper deviceEntityMapper) {
    this.jpaDeviceRepository = jpaDeviceRepository;
    this.deviceEntityMapper = deviceEntityMapper;
  }

  @Override
  public void save(Device device) {

    Assert.notNull("device", device);  
    // mapear objeto dominio a objeto de BD  
    DeviceEntity deviceEntity = deviceEntityMapper.toEntity(device);

    jpaDeviceRepository.save(deviceEntity);
  }

  @Override
  public Optional<Device> findOne(UUID deviceId) {     
    return jpaDeviceRepository.findById(deviceId).map(deviceEntityMapper::toDomain);
  }
 
}
