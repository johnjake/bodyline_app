package com.bodyline.org.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Expenses_Constant")
public class ExpensesConstant {

    @Id
    @Column("ID")
    private Integer id;

    @Column("Expenses_Code")
    private String expensesCode;

    @Column("Expenses_Name")
    private String expensesName;
}
