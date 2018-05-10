package com.taiga.mvc;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LoveValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedLove {
    public String value() default "LOVE";

    public String message() default "GIVELOVE!!!";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};


}
