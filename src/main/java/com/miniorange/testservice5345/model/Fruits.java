package com.miniorange.testservice5345.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter @Setter
@NoArgsConstructor
@Entity(name = "fruits")
public class Fruits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "season")
    private String season;

    @Column
    @CreationTimestamp
    private LocalDateTime createdDttm;
}
