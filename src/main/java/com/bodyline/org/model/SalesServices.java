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
@Table("Sales_Services")
public class SalesServices {

    @Id
    @Column("Invoice_Ctrl")
    private Integer invoiceCtrl;

    @Column("InvoiceID")
    private String invoiceId;

    @Column("Time_In")
    private Time timeIn;

    @Column("Time_Out")
    private Time timeOut;

    @Column("Customer_Barcode")
    private String customerBarcode;

    @Column("Name")
    private String Name;

    @Column("Therapist_Barcode")
    private String therapistBarcode;

    @Column("Therapist_Name")
    private String therapistName;

    @Column("Service_Barcode")
    private String serviceBarcode;

    @Column("Service_Name")
    private String serviceName;

    @Column("Service_Charge")
    private BigDecimal serviceCharge;

    @Column("Discount_Barcode")
    private String discountBarcode;

    @Column("Service_Discount")
    private BigDecimal serviceDiscount;

    @Column("Discount_Type")
    private String discountType;

    @Column("Date")
    private Date date;
}
