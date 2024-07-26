package com.dsi.tacocloud.tacos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Data
public class TacoOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private Date placedAt;
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

}
