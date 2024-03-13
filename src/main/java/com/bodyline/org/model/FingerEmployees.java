package com.bodyline.org.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Finger_Employees")
public class FingerEmployees {

    @Id
    @Column("Finger_ID")
    private Integer fingerId;

    @Column("EmpID")
    private String empId;

    @Column("finger_index")
    private Integer fingerIndex;

    @Column("Finger_Byte")
    private String fingerByte;

}
