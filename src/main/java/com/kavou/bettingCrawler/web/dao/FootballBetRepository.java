package com.kavou.bettingCrawler.web.dao;

import com.kavou.bettingCrawler.web.entity.Bet;
import com.kavou.bettingCrawler.web.entity.Bettor;
import com.kavou.bettingCrawler.web.entity.FootballBet;
import com.kavou.bettingCrawler.web.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballBetRepository extends JpaRepository<FootballBet, String> {

    Page<Bet> findAllByGame(Pageable page, Game game);
}
