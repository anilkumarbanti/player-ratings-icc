package com.curd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.demo.model.Player;
import com.curd.demo.repository.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }

    public Player getPlayerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Player> addOrUpdatePlayer(List<Player> player) {
        return repository.saveAll(player);
    }

    public void deletePlayer(Long id) {
        repository.deleteById(id);
    }
}