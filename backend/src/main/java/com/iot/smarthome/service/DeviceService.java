package com.iot.smarthome.service;


import com.iot.smarthome.dto.DeviceRegistrationRequest;
import com.iot.smarthome.dto.DeviceRegistrationResponse;
import com.iot.smarthome.repository.DeviceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class DeviceService {
    private final DeviceRepository deviceRepository;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Transactional
    public DeviceRegistrationResponse registerDevice(DeviceRegistrationRequest request, UUID userId){
        log.info("Registering device for user {}", userId);


    }
}
