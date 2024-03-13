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
@Table("Commission")
public class Commission {

    @Id
    @Column("Commission_ID")
    private Integer commissionId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Rate")
    private Float rate;

    @Column("Bunos")
    private BigDecimal bunos;

    @Column("Others")
    private BigDecimal others;
}
