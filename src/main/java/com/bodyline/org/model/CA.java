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
@Table("Blood_Pressure")
public class CA {

    @Id
    @Column("CA_ID")
    private Integer caId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("Purpose")
    private String purpose;

    @Column("Receipt_Num")
    private String receiptNumber;

    @Column("Ca_Date")
    private Date caDate;

}
