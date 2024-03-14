package com.bodyline.org.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("CounterDB")
public class CounterDB {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("EmpID")
    private String empId;

    @Column("Barcode_Number")
    private String barcodeNumber;

    @Column("UserName")
    private String userName;

    @Column("Name")
    private String name;

    @Column("Time_In")
    private LocalDateTime timeIn;

    @Column("Time_Out")
    private LocalDateTime timeOut;

    @Column("Counter_Date")
    private Date counterDate;
}