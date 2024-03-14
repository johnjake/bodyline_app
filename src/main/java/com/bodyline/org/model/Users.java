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
@Table("Users")
public class Users {

    @Id
    @Column("User_id")
    private Integer userId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("UserName")
    private String userName;

    @Column("UserPass")
    private String userPass;

    @Column("UserType")
    private Integer userType;
}
