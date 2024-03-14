package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Orders")
public class Orders {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("OrderID")
    private String orderId;

    @Column("Time_IN")
    private Time timeIn;

    @Column("Time_OUT")
    private Time timeOut;

    @Column("CustomerID")
    private String customerId;

    @Column("Customer_Name")
    private String customerName;

    @Column("UserID")
    private Integer id;

    @Column("User_Name")
    private String userName;

    @Column("ServiceID")
    private String serviceId;

    @Column("Service_Name")
    private String serviceName;

    @Column("VIP_ID")
    private String vipId;

    @Column("Card_Name")
    private String cardName;

    @Column("Gross")
    private BigDecimal gross;

    @Column("Discount")
    private BigDecimal discount;

    @Column("Net")
    private BigDecimal net;

    @Column("OrderDate")
    private Date orderDate;
}