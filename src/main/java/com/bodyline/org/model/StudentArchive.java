package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("StudentArchive")
public class StudentArchive {

    @Id
    @Column("Aid")
    private Integer aid;

    @Column("Type")
    private String type;

    @Column("WhenChange")
    private Timestamp whenChange;

    @Column("StudentID")
    private Integer studentId;

    @Column("nFirstName")
    private String nFirstName;

    @Column("nLastName")
    private String nLastName;

    @Column("oFirstName")
    private String oFirstName;

    @Column("oLastName")
    private String oLastName;
}
