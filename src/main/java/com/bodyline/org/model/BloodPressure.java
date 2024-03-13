package com.bodyline.org.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Blood_Pressure")
public class BloodPressure {

    @Id
    @Column("BP_ControlID")
    private Integer bpControlId;


    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Barcode")
    private String barcode;

    @Column("BP")
    private String bp;

    @Column("Weight")
    private Float weight;

    @Column("Date_Taken")
    private Date dateTaken;
}
