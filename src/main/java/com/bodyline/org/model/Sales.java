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
@Table("Sales")
public class Sales {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("SaleID")
    private String saleId;

    @Column("Sales_Details_ID")
    private Integer salesDetailsId;

    @Column("Branch")
    private String branch;

    @Column("Sales_Date")
    private Date salesDate;

    @Column("Gross_Sales")
    private BigDecimal grossSales;

    @Column("Total_Discount")
    private BigDecimal totalDiscount;

    @Column("Total_Sales")
    private BigDecimal totalSales;

    @Column("Total_Expenses")
    private BigDecimal totalExpenses;

    @Column("Net_Sales")
    private BigDecimal netSales;

    @Column("Prepared_By")
    private String preparedBy;
}
