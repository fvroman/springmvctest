package com.taiga.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoveValidator implements ConstraintValidator<NeedLove, String> {

    private String prefix;

    @Override
    public void initialize(NeedLove love) {
        prefix = love.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

        return code == null ? true : code.startsWith(prefix);
    }

}
