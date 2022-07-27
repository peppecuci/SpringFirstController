package com.example.springdemo.mapper;

import com.example.springdemo.DTO.PlayerDTO;
import com.example.springdemo.entities.Player;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class Mapper {

    public PlayerDTO toPlayerDto(Player entity) {

        return PlayerDTO.builder()
                .id(entity.getId())
                .birthDate(entity.getBirthDate())
                .name(entity.getName())
                .nbr(entity.getNbr())
                .poste(entity.getPoste())
                .salary(entity.getSalary())
                .age(Period.between(LocalDate.now(), entity.getBirthDate()).getYears())
                .build();

    }

//    public Player toPlayerEntity(PlayerDTO dto) {
//
//    }
}
