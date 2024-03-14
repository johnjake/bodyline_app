package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Walk_In")
public class WalkIn {

    @Id
    @Column("CustomerID")
    private Integer customerId;

    @Column("Name")
    private String name;

    @Column("Date")
    private Date date;

    @Column("Service_Name")
    private String serviceName;
}
