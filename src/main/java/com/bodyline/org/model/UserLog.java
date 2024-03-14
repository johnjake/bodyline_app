package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("User_Log")
public class UserLog {

    @Id
    @Column("user_log_id")
    private Integer userLogId;

    @Column("User_id")
    private Integer userId;

    @Column("UserName")
    private String userName;

    @Column("UserPass")
    private String userPass;

    @Column("UserType")
    private Integer userType;

    @Column("udate")
    private Date udate;

    @Column("utime")
    private Time uTime;

    @Column("action")
    private String action;
}
