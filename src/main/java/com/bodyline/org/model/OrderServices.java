package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Order_Services")
public class OrderServices {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("OrderID")
    private String orderId;

    @Column("ServiceID")
    private String  serviceId;

    @Column("Reg_Price")
    private BigDecimal regPrice;

    @Column("Aroma_Price")
    private BigDecimal aromaPrice;

    @Column("Other_Price")
    private BigDecimal otherPrice;

    @Column("Discount")
    private BigDecimal discount;
}