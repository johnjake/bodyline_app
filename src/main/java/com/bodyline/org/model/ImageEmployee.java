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
@Table("Image_Employee")
public class ImageEmployee {

    @Id
    @Column("Image_Employee_ID")
    private Integer imageEmployeeId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("EmpID")
    private String empId;

    @Column("Image")
    private  byte[] image;

    @Column("Image_Title")
    private String imageTitle;

    @Column("Image_Type")
    private String imageType;

    @Column("Image_Location")
    private String  imageLocation;

    @Column("Image_Height")
    private Integer imageHeight;

    @Column("Image_Width")
    private Integer imageWidth;
}