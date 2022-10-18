package co.com.ies.smolplus.context.device.infrastructure.secondary;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.context.device.domain.DeviceRepository;
import co.com.ies.smolplus.error.domain.Assert;

@Repository
public class SpringDataDeviceRepository implements DeviceRepository {  

  private final JpaDeviceRepository jpaDeviceRepository;

  public SpringDataDeviceRepository(JpaDeviceRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;
  }

  @Override
  public void save(Device device) {
    Assert.notNull("device", device);    

    jpaDeviceRepository.save(DeviceEnity.from(device));
  }
 
}
