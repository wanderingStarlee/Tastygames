package com.minibullsgames.MiniBullsGames;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private MiniBullsGroupGamesRepository gameRepository;

    public List<MiniBullsGroupGames> getGamesByGenre(String genre) {
        return gameRepository.findByGenre(genre);
    }

    // другие методы, если необходимо

    @PostConstruct
    public void initData() {
        // Создаем тестовые данные только если в БД еще нет данных
        if (gameRepository.count() == 0) {
            MiniBullsGroupGames game1 = new MiniBullsGroupGames("Game 1", "Studio 1", "9.0", "$10");
            MiniBullsGroupGames game2 = new MiniBullsGroupGames("Game 2", "Studio 2", "8.5", "$15");
            MiniBullsGroupGames game3 = new MiniBullsGroupGames("Game 3", "Studio 3", "7.0", "$20");
            gameRepository.saveAll(Arrays.asList(game1, game2, game3));
        }
    }
}
