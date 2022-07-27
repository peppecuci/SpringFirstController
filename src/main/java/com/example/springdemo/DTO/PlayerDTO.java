package com.example.springdemo.DTO;


import com.example.springdemo.utils.Poste;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Data //Getter Setter ToString Equals
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDTO {

    //Dans la DTO on ne mets que les données que nous souhaitons afficher/utiliser
    Long id;

    String name;

    LocalDate birthDate;

    int age;

    int nbr;

    double salary;

    Poste poste;

}
