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
@Table("Order_Product")
public class OrderProduct {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("OrderID")
    private String orderId;

    @Column("ProductID")
    private String productId;

    @Column("ProductName")
    private String productName;

    @Column("UnitsOnOrder")
    private Integer unitsOnOrder;

    @Column("UnitPrice")
    private BigDecimal unitPrice;

    @Column("Gross")
    private BigDecimal gross;

    @Column("Discount")
    private BigDecimal discount;

    @Column("Net")
    private BigDecimal net;
}
