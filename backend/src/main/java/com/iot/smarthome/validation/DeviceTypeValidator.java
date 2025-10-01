package com.iot.smarthome.validation;

import com.iot.smarthome.model.DeviceType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DeviceTypeValidator implements ConstraintValidator<ValidDeviceType, String> {
    private static final Set<String> TYPES = Arrays.stream(DeviceType.values())
            .map(Enum::name)
            .collect(Collectors.toSet());

    @Override
    public boolean isValid(String type, ConstraintValidatorContext context){
        if(type == null || type.isEmpty()){ return false;}
        return TYPES.contains(type);
    }
}
