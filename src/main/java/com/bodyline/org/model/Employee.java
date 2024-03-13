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
@Table("Employees")
public class Employee {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("EmpID")
    private String empId;

    @Column("LName")
    private String lName;

    @Column("FName")
    private String fName;

    @Column("Mid")
    private String mid;

    @Column("Gender")
    private String gender;

    @Column("Civil_Stat")
    private String civilStatus;

    @Column("Bday")
    private Date birthDay;

    @Column("Email")
    private String eMail;

    @Column("Phone")
    private String phone;

    @Column("Mobile")
    private String mobile;

    @Column("Address")
    private String address;

    @Column("Province")
    private String province;

    @Column("SSS")
    private String sss;

    @Column("PH")
    private String philHealth;

    @Column("Pos")
    private String position;

    @Column("Hire_Date")
    private Date hireDate;

    @Column("Barcode_Number")
    private String barcodeNumber;

}
