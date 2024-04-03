package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Vip_Cards")
public class VipCards {

    @Id
    @Column("Ctrl_V")
    private Integer ctrlV;

    @Column("VIP_ID")
    private String vipId;

    @Column("Customer_ID")
    private String customerId;

    @Column("Customer_Name")
    private String customerName;

    @Column("Date_Reg")
    private Date dateReg;

    @Column("Date_Expire")
    private Date dateExpire;

    @Column("Discount")
    private BigDecimal discount;

    @Column("Discontinue")
    private Boolean discontinue;

    @Column("VIP_Barcode")
    private String vipBarcode;
}
