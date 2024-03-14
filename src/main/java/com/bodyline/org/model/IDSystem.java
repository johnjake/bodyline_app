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
@Table("ID_System")
public class IDSystem
{

    @Id
    @Column("ID")
    private Integer id;

    @Column("ID_NAME")
    private String idName;

    @Column("Table_Name")
    private String tableName;
}