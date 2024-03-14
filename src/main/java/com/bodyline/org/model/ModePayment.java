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
@Table("Mode_Payment")
public class ModePayment {

    @Id
    @Column("ID")
    private Integer id;

    @Column("CustomerID")
    private Integer customerId;

    @Column("Customer_Name")
    private String  customerName;

    @Column("Cheque_No")
    private String chequeNo;

    @Column("Bank")
    private String bank;

    @Column("Branch")
    private String branch;

    @Column("Due_Date")
    private Date dueDate;

    @Column("Amount")
    private BigDecimal amount;

    @Column("Discount")
    private Float discount;

    @Column("Adjust")
    private BigDecimal adjust;

    @Column("Gross")
    private BigDecimal gross;

    @Column("NET")
    private BigDecimal net;
}