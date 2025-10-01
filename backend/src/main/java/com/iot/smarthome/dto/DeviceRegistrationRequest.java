package com.iot.smarthome.dto;

import com.iot.smarthome.model.DeviceType;
import com.iot.smarthome.validation.ValidDeviceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeviceRegistrationRequest {
    @NotBlank(message = "Device type is required")
    @ValidDeviceType
    private DeviceType deviceType;

    @NotBlank(message = "Manufacturer is required")
    @Size(max = 100)
    private String manufacturer;

    @NotBlank(message = "Model is required")
    @Size(max = 100)
    private String model;

    @NotBlank(message = "Serial Number is required")
    @Size(max = 100)
    private String serialNumber;

    @NotBlank(message = "CSR is required")
    private String certificateSigningRequest;

    @Size(max = 1000)
    private String metadata;
}
