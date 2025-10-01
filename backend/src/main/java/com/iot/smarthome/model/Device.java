package com.iot.smarthome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name="devices", indexes = {
        @Index(name = "idx_device_external_id", columnList = "externalId"),
        @Index(name = "idx_device_user_id",columnList = "userId"),
        @Index(name = "idx_device_status",columnList = "status")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true,nullable = false, length = 100)
    private String externalId;

    @Column(nullable = false)
    private UUID userId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private DeviceType type;

    @Column(nullable = false,length = 100)
    private String manufacturer;

    @Column(nullable = false,length = 100)
    private String model;

    @Column(length = 50)
    private String firmwareVersion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private DeviceStatus status;

    @Column(nullable = false)
    private Instant registeredAt;

    private Instant lastSeenAt;

    @Column(columnDefinition = "jsonb")
    private String metadata;

    private Long version; // Optimistic locking


    @PrePersist
    private void onCreate(){
        this.registeredAt = Instant.now();
        if(status == null) status = DeviceStatus.ACTIVE;

    }
}
