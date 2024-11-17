package com.minibullsgames.MiniBullsGames;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MiniBullsGroupGamesRepository extends JpaRepository<MiniBullsGroupGames, Long> {
    List<MiniBullsGroupGames> findByGenre(String genre);
}
