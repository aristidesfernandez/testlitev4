package co.com.ies.smolplus.context.device.domain;

import java.util.UUID;

public class CreateDevice {

    private DeviceRepository deviceRepository;

    public CreateDevice(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }


    public Device create(Device device) {
    
        // validar para poder crear    
           
        device.setId(UUID.randomUUID());
        deviceRepository.save(device);

        return device;
      }



  
    
}
