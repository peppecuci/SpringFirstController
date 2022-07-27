package com.example.springdemo.services;

import com.example.springdemo.entities.Player;
import com.example.springdemo.utils.Poste;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class DataInit implements InitializingBean {

    private final PlayerService playerService;

    private List<Player> players = Arrays.asList(
            Player.builder()
                    .name("Hazard")
                    .birthDate(LocalDate.of(1995, 11, 22))
                    .nbr(9)
                    .poste(Poste.AVANT_CENTRE)
                    .salary(150000.00)
                    .build(),

            Player.builder()
                    .name("De Bruyne")
                    .birthDate(LocalDate.of(1990, 4, 18))
                    .nbr(5)
                    .poste(Poste.AVANT_GAUCHE)
                    .salary(180000.00)
                    .build(),

            Player.builder()
                    .name("Meunier")
                    .birthDate(LocalDate.of(1985, 5, 10))
                    .nbr(10)
                    .poste(Poste.AVANT_DROITE)
                    .salary(200000.00)
                    .build(),

            Player.builder()
                    .name("Courtois")
                    .birthDate(LocalDate.of(1991, 12, 5))
                    .nbr(1)
                    .poste(Poste.GARDIEN)
                    .salary(100000.00)
                    .build(),

            Player.builder()
                    .name("Lukaku")
                    .birthDate(LocalDate.of(1990, 12, 1))
                    .nbr(7)
                    .poste(Poste.MILIEU_DEFENSIF)
                    .salary(150000.00)
                    .build()
    );

    public DataInit(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        this.players.forEach(playerService::toInsert);

    }
}
