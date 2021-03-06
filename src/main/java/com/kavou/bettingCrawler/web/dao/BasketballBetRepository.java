package com.kavou.bettingCrawler.web.dao;

import com.kavou.bettingCrawler.web.entity.BasketballBet;
import com.kavou.bettingCrawler.web.entity.Bet;
import com.kavou.bettingCrawler.web.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketballBetRepository extends JpaRepository<BasketballBet, String> {

    Page<Bet> findAllByGame(Pageable page, Game game);
}
