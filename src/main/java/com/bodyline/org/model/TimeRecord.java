package com.bodyline.org.model;

import io.r2dbc.spi.Parameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.web.bind.annotation.InitBinder;

import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Time_Record")
public class TimeRecord {

    @Id
    @Column("TR_ID")
    private Integer trId;

    @Column("Schedule_ID")
    private Integer scheduleId;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Time_IN")
    private Time timeIn;

    @Column("Time_OUT")
    private Time timeOut;

    @Column("Date_Now")
    private Date dateNow;
}
