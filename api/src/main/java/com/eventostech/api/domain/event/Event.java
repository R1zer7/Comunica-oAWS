package com.eventostech.api.domain.event;


import java.sql.Date;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Event")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {


    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String derscription;
    private String imUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;

}
