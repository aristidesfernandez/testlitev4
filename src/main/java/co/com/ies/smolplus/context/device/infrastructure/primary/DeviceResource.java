package co.com.ies.smolplus.context.device.infrastructure.primary;


import java.net.URISyntaxException;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.device.application.DeviceService;
import co.com.ies.smolplus.context.device.infrastructure.primary.dto.DeviceDTO;

@RestController
@RequestMapping("/api")
public class DeviceResource {

    private final Logger log = LoggerFactory.getLogger(DeviceResource.class);

    private final DeviceService deviceService;

    public DeviceResource(DeviceService deviceService) {
        this.deviceService = deviceService;
    }


    @PostMapping("/devices")
    public ResponseEntity<DeviceDTO> createDevice(@Valid @RequestBody DeviceDTO deviceDTO) {
        log.debug("REST request to save Device : {}", deviceDTO);

        DeviceDTO result = deviceService.save(deviceDTO);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/devices/{id}")
    public ResponseEntity<DeviceDTO> getDevice(@PathVariable UUID id) {
        log.debug("REST request to get Device : {}", id);
        Optional<DeviceDTO> oDeviceDTO = deviceService.findOne(id);
        DeviceDTO result = oDeviceDTO.orElseGet(DeviceDTO::new);

        return ResponseEntity.ok(result);
    }


}
