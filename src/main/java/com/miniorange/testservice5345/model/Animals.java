package com.miniorange.testservice5345.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter @Setter
@NoArgsConstructor
@Entity(name = "animals")
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private String size;

    @Column(name = "type")
    private String type;

    @Column
    @CreationTimestamp
    private LocalDateTime createdDttm;

}
