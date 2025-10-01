package com.iot.smarthome.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DeviceTypeValidator.class)
public @interface ValidDeviceType {
    String message() default "Invalid device type";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]  payload() default {};

}
