package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Customers")
public class Customer {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Customer_ID")
    private String customerId;

    @Column("FName")
    private String firstName;

    @Column("Mid")
    private String middleInitial;

    @Column("LName")
    private String lastName;

    @Column("Gender")
    private String gender;

    @Column("Civil_Stat")
    private String civilStatus;

    @Column("Address")
    private String address;

    @Column("DOB")
    private LocalDate dob;

    @Column("Phone")
    private String phone;

    @Column("Mobile")
    private String mobile;

    @Column("Date_Reg")
    private LocalDate dateRegistered;

    @Column("Height")
    private Float height;

    @Column("Weight")
    private Float weight;

    @Column("Desired_W")
    private Float desiredWeight;

    @Column("BP")
    private String bloodPressure;

    @Column("Job_Nature")
    private String jobNature;

    @Column("Sports_Act")
    private String sportsActivity;

    @Column("Main_Prob")
    private String mainProblem;

    @Column("Initial_Serv")
    private LocalDate initialService;

    @Column("Last_Serv")
    private LocalDate lastService;

    @Column("Barcode")
    private String barcode;
}
