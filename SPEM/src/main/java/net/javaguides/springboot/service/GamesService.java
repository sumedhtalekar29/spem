package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Games;

public interface GamesService {
	List<Games> getAllGames();
	void saveGames(Games game);
	Games getGamesById(long id);
	void deleteGamesById(long id);
	Page<Games> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}