package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Rate")
public class Rate {

    @Id
    @Column("Rate_ID")
    private Integer rateId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Position_ID")
    private String positionId;

    @Column("Account_Day")
    private BigDecimal accountDay;

    @Column("Account_Hour")
    private BigDecimal accountHour;

    @Column("Account_OT")
    private BigDecimal accountOT;
}
