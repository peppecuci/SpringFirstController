package com.example.springdemo.services;

import com.example.springdemo.entities.Player;
import com.example.springdemo.mapper.Mapper;
import com.example.springdemo.repositories.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IService<Player, Long>{

    private final PlayerRepository playerRepository;
    private final Mapper mapper;

    public PlayerService(PlayerRepository playerRepository, Mapper mapper) {
        this.playerRepository = playerRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Player> getAll() {
        return null;
    }

    @Override
    public Player getById(Long id) {
        return null;
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
    public Player insert(Player entity) {
        return null;
    }
}
