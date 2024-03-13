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
@Table("Gross_Sales")
public class GrossSales {

    @Id
    @Column("Sales_Control")
    private Integer salesControl;

    @Column("SalesID")
    private String salesId;

    @Column("Invoice_Ctrl")
    private Integer invoiceCtrl;

    @Column("InvoiceID")
    private String invoiceId;

    @Column("Gross")
    private BigDecimal gross;

    @Column("Discount")
    private BigDecimal discount;

    @Column("Discount_Type")
    private String discountType;

    @Column("Net")
    private BigDecimal net;

    @Column("User_Control")
    private Integer userControl;

    @Column("User_Name")
    private String userName;

    @Column("Sales_Date")
    private Date salesDate;
}
