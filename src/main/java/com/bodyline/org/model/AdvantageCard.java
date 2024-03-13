package com.bodyline.org.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Advantage_Card")
public class AdvantageCard {

    @Id
    @Column("Advantage_CtrlID")
    private Integer advantageCtrlId;

    @Column("Advantage_Number")
    private String advantageNumber;

    @Column("AdvantageID")
    private String advantageId;

    @Column("Customer_Barcode")
    private String customerBarcode;

    @Column("CustomerCtrlID")
    private Integer customerCtrlId;

    @Column("Customer_ID")
    private String customerId;

    @Column("Customer_Name")
    private String customerName;

    @Column("Date_Register")
    private Date dateRegister;

    @Column("Date_Expire")
    private Date dateExpire;

    @Column("Discount")
    private Float discount;

    @Column("Discontinue")
    private Boolean discontinue;

    @Column("Discount_Type")
    private String discountType;

}