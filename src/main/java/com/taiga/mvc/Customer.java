package com.taiga.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Customer extends Person{
    @NotNull(message = "required")
    @Min(value = 0, message = ">0!")
    @Max(value = 10, message = "<10")
    private Integer coupons;

    @NeedLove
    private String love;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "not a postalCode")
    private String postalCode;

    public Integer getCoupons() {
        return coupons;
    }

    public void setCoupons(Integer coupons) {
        this.coupons = coupons;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getLove() {
        return love;
    }
}
