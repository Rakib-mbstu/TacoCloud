package com.dsi.tacocloud.tacos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;

public class TacoOrder {
    @NotBlank(message = "Must be not blank")
    private String deliveryName;
    @NotBlank(message = "Must be not blank")
    private String deliveryAddress;
    @NotBlank(message = "Must be not blank")
    private String deliveryPhone;
    private String deliveryEmail;
    @CreditCardNumber(message = "Must be a valid card")
    private String ccNumber;
    @Digits(integer = 3,fraction = 0,message = "Invalid")
    private String ccCVV;
    private List<Taco> tacos = new ArrayList<>();

    public TacoOrder(String ccCVV,
                     String ccNumber,
                     String deliveryAddress,
                     String deliveryEmail,
                     String deliveryName,
                     String deliveryPhone) {
        this.ccCVV = ccCVV;
        this.ccNumber = ccNumber;
        this.deliveryAddress = deliveryAddress;
        this.deliveryEmail = deliveryEmail;
        this.deliveryName = deliveryName;
        this.deliveryPhone = deliveryPhone;
    }

    public TacoOrder() {

    }

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }

    public String getCcCVV() {
        return ccCVV;
    }

    public void setCcCVV(String ccCVV) {
        this.ccCVV = ccCVV;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryEmail() {
        return deliveryEmail;
    }

    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    public void setTacos(List<Taco> tacos) {
        this.tacos = tacos;
    }
}
