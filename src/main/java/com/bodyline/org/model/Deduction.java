package com.bodyline.org.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Deduction")
public class Deduction {

    @Id
    @Column("Deduction_ID")
    private Integer deductionId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("SSS")
    private BigDecimal sss;

    @Column("PHP")
    private BigDecimal php;

    @Column("PAG")
    private BigDecimal pag;

    @Column("OTH")
    private BigDecimal oth;
}