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
@Table("Total_Expenses")
public class TotalExpenses {

    @Id
    @Column("ID")
    private Integer id;

    @Column("Total_Expenses")
    private BigDecimal totalExpenses;

    @Column("Date_Expenses")
    private Date dateExpenses;
}

