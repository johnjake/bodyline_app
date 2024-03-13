package com.bodyline.org.model;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Discounted")
public class Discounted {

    @Id
    @Column("Discount_Ctrl")
    private Integer discountCtrl;

    @Column("Discount_Barcode")
    private String discountBarcode;

    @Column("Customer_Ctrl")
    private Integer customerCtrl;

    @Column("Customer_Barcode")
    private String customerBarcode;

    @Column("Customer_Name")
    private String customerName;

    @Column("Employee_Ctrl")
    private Integer employeeCtrl;

    @Column("Employee_Barcode")
    private String employeeBarcode;

    @Column("Employee_Name")
    private String employeeName;

    @Column("Discount_Type")
    private String discountType;

    @Column("Discount_Percentage")
    private BigDecimal discountPercentage;

    @Column("Date_Register")
    private Date dateRegister;

    @Column("Date_Expire")
    private Date dateExpire;

    @Column("Discontinued")
    private Boolean discontinued;
}