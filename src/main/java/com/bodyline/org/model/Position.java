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
@Table("Position")
public class Position {

    @Id
    @Column("Position_ID")
    private Integer positionId;

    @Column("Position_Name")
    private String position;
}