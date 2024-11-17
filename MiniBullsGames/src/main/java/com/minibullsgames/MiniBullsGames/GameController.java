package com.minibullsgames.MiniBullsGames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/{genre}")
    public List<MiniBullsGroupGames> getGamesByGenre(@PathVariable String genre) {
        return gameService.getGamesByGenre(genre);
    }
}