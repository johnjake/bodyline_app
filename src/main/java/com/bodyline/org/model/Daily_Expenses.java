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
@Table("Daily_Expenses")
public class Daily_Expenses {

    @Id
    @Column("ID")
    private Integer id;

    @Column("TOTAL_EXPENSES")
    private BigDecimal totalExpenses;

    @Column("DATE_EXPENSES")
    private Date dateExpenses;
}