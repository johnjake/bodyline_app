package com.bodyline.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Schedule")
public class Schedule {

    @Id
    @Column("Schedule_ID")
    private Integer scheduleId;

    @Column("scheduleid")
    private Integer scheduleId2;

    @Column("Ctrl_ID")
    private Integer ctrlId;

    @Column("Status")
    private String status;

    @Column("Schedule_Day")
    private String scheduleDay;

    @Column("Start_AM")
    private Time startAM;

    @Column("End_AM")
    private Time endAM;

    @Column("Start_PM")
    private Time startPM;

    @Column("End_PM")
    private Time endPM;

    @Column("Schedule_Date")
    private Date scheduleDate;
}
