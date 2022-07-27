package com.example.springdemo.entities;

import com.example.springdemo.utils.Poste;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data //Getter Setter ToString Equals
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(columnDefinition = "DATE")
    LocalDate birthDate;

    @Column
    int nbr;

    @Column
    double salary;

    @Column
    @Enumerated(EnumType.STRING)
    Poste poste;

}
