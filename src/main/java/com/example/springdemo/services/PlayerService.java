package com.example.springdemo.services;

import com.example.springdemo.DTO.PlayerDTO;
import com.example.springdemo.entities.Player;
import com.example.springdemo.mapper.Mapper;
import com.example.springdemo.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService implements IService<Player, PlayerDTO, Long>{

    private final PlayerRepository playerRepository;
    private final Mapper mapper;

    public PlayerService(PlayerRepository playerRepository, Mapper mapper) {
        this.playerRepository = playerRepository;
        this.mapper = mapper;
    }


    @Override
    public List<PlayerDTO> getAll() {

        return this.playerRepository.findAll()
                .stream()
                .map(mapper::toPlayerDto)
                .collect(Collectors.toList());

    }

    @Override
    public PlayerDTO getById(Long id) {

        Optional<Player> result = this.playerRepository
                .findById(id);

                return result.map(mapper::toPlayerDto)
                .orElse(null);


    }

    @Override
    public boolean update(Long id, Player entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public PlayerDTO toInsert(Player entity) {

        if(entity != null) {
            Player newPlayer = this.playerRepository.save(entity);
            return this.mapper.toPlayerDto(newPlayer);
        }
        else throw new RuntimeException("Attention, probleme de validité des données");
    }
}
