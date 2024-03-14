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
@Table("Services")
public class Services {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("ServiceID")
    private String serviceId;

    @Column("Services_Name")
    private String servicesName;

    @Column("Service_Code")
    private String serviceCode;

    @Column("CategoryID")
    private Integer categoryId;

    @Column("ServiceHour_Min")
    private String serviceHourMin;

    @Column("ServiceHour_Max")
    private String serviceHourMax;

    @Column("Number_Buying")
    private Short numberBuying;

    @Column("Reg_Price")
    private BigDecimal regPrice;

    @Column("Aroma_Price")
    private BigDecimal aromaPrice;

    @Column("Home_Service_Price")
    private BigDecimal homeServicePrice;

    @Column("Discontinued")
    private Boolean discontinued;

    @Column("Barcode")
    private String barcode;
}
