package com.iot.smarthome.repository;

import com.iot.smarthome.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeviceRepository extends JpaRepository<UUID, Device> {
}
