package com.iot.smarthome.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeviceRegistrationResponse {
    private String deviceId;
    private String externalId;
    private String certificatePem;
    private String privateKey;
    private String mqttEndpoint;
    private String mqttPort;
    private String status;
    private String registeredAt;
}
