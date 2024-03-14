package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Sample")
public class Sample {

    @Id
    @Column("Ctrl")
    private Integer ctrl;

    @Column("Val1")
    private String val1;

    @Column("Val2")
    private String val2;

    @Column("Barcode")
    private String barcode;
}
