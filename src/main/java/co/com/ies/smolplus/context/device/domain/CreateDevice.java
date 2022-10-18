package co.com.ies.smolplus.context.device.domain;



public class CreateDevice {

    private DeviceRepository deviceRepository;

    public CreateDevice(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }


    public Device create(Device device) {
    
        // validar para poder crear    
           
    
        deviceRepository.save(device);

        return device;
      }



  
    
}
