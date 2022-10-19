package co.com.ies.smolplus.context.device.application.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.device.application.DeviceService;
import co.com.ies.smolplus.context.device.domain.CreateDevice;
import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.context.device.domain.DeviceRepository;
import co.com.ies.smolplus.context.device.infrastructure.primary.dto.DeviceDTO;
import co.com.ies.smolplus.context.device.infrastructure.primary.mapper.DeviceMapper;

import java.util.UUID;

@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {

    private final CreateDevice createDevice;
    private DeviceRepository deviceRepository;
    private DeviceMapper deviceMapper;

    public DeviceServiceImpl(DeviceRepository deviceRepository, DeviceMapper deviceMapper){ 
        this.deviceRepository = deviceRepository;
        this.deviceMapper = deviceMapper;
        this.createDevice = new CreateDevice(deviceRepository);
    }

    @Override
    public DeviceDTO save(DeviceDTO deviceDTO) {

        //transformación de dto a modelo de domiio
        Device device = deviceMapper.toEntity(deviceDTO); 

        // llamadas a casos usos
        Device deviceCreated = createDevice.create(device);

        return deviceMapper.toDto(deviceCreated) ;
    }

    @Override
    public Optional<DeviceDTO> findOne(UUID id) {      
        return deviceRepository.findOne(id).map(deviceMapper::toDto);
    } 

   
}
