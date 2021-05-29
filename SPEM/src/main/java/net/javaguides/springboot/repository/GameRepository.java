package net.javaguides.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Games;

@Repository
public interface GameRepository extends JpaRepository<Games, Long>{

}
