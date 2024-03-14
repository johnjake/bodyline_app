package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Products")
public class Products {

    @Id
    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("ProductID")
    private String productId;

    @Column("ProductName")
    private String productName;

    @Column("SupplierID")
    private String supplierId;

    @Column("CategoryID")
    private Integer categoryId;

    @Column("QuantityPerUnit")
    private String quantityPerUnit;

    @Column("UnitPrice")
    private BigDecimal unitPrice;

    @Column("UnitsInStock")
    private short unitsInStock;

    @Column("UnitsOnOrder")
    private short unitsOnOrder;

    @Column("ReorderLevel")
    private short reorderLevel;

    @Column("Discontinued")
    private Boolean discontinued;
}
