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
@Table("Expenses")
public class Expenses {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("ExpenseID")
    private String expenseId;

    @Column("SaleID")
    private String saleId;

    @Column("Expenses_Code")
    private String expensesCode;

    @Column("Expense_Name")
    private String expenseName;

    @Column("Expenses_Amount")
    private BigDecimal expensesAmount;

    @Column("Remarks")
    private String remarks;

    @Column("Expenses_Date")
    private Date expensesDate;

}
