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
@Table("Supplier")
public class Supplier {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;
    
    @Column("SupplierID")
    private String supplierId;

    @Column("FName")
    private String fName;

    @Column("Mid")
    private String mid;

    @Column("LName")
    private String LName;

    @Column("Gender")
    private String gender;

    @Column("Sup_Address")
    private String supAddress;

    @Column("Province")
    private String province;

    @Column("Phone")
    private String phone;

    @Column("Fax")
    private String fax;

    @Column("Mobile")
    private String mobile;

    @Column("Company_Name")
    private String companyName;

    @Column("Company_Add")
    private String companyAdd;

    @Column("Company_Contact")
    private String companyContact;

    @Column("EmailAdd")
    private String emailAdd;
}
