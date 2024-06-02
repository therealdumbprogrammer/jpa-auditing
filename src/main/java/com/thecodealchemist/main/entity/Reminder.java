package com.thecodealchemist.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Entity
@Data
@Audited
public class Reminder {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
}
