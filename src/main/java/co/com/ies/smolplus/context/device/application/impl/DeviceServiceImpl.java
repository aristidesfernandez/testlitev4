package co.com.ies.smolplus.context.device.application.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.device.application.DeviceService;
import co.com.ies.smolplus.context.device.domain.CreateDevice;
import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.context.device.domain.DeviceRepository;
import co.com.ies.smolplus.context.device.infrastructure.primary.dto.DeviceDTO;
import java.util.UUID;

@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {

    private final CreateDevice createDevice;
    private DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository){ 
        this.deviceRepository = deviceRepository;
        this.createDevice = new CreateDevice(deviceRepository);
    }

    @Override
    public DeviceDTO save(DeviceDTO deviceDTO) {

        //validar en el dominio
        createDevice.create(Mapper.toEntity(deviceDTO));
        return null;
       
    }

    @Override
    public Optional<DeviceDTO> findOne(Long id) {      
        return Optional.empty();
    } 

    public static class Mapper{
        private Mapper() {
        }

        static Device toEntity(DeviceDTO deviceDTO) {
            return new Device(UUID.randomUUID(), deviceDTO.getSerial());            
        }

        static DeviceDTO toDto(Device device) {
            return new DeviceDTO(device.getId(), device.getSerial());            
        }

    }





   
}
