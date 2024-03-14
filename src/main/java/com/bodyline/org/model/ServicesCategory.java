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
@Table("Services_Category")
public class ServicesCategory {

    @Id
    @Column("CategoryID")
    private Integer categoryId;

    @Column("Category_Name")
    private String categoryName;

    @Column("Descriptions")
    private String descriptions;
}
