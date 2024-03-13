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
@Table("Credit")
public class Credit {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Credit_ID")
    private String creditId;

    @Column("Customer_ID")
    private String customerId;

    @Column("EmpID")
    private String empId;

    @Column("Name")
    private String name;

    @Column("Account_Number")
    private String accountNumber;

    @Column("Cheque_Number")
    private String chequeNumber;

    @Column("Amount")
    private BigDecimal amount;

    @Column("Credit_Date")
    private Date creditDate;

    @Column("Due_Date")
    private Date dueDate;

}