package com.curd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.demo.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
