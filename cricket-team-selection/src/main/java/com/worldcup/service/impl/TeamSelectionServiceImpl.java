package com.worldcup.service.impl;

import com.worldcup.dao.BattingStatsDao;
import com.worldcup.dao.BowlingStatsDao;
import com.worldcup.dao.PlayerDao;
import com.worldcup.model.*;
import com.worldcup.service.TeamSelectionService;

import java.util.*;
import java.util.stream.Collectors;

public class TeamSelectionServiceImpl implements TeamSelectionService {

    private PlayerDao playerDao;
    private BattingStatsDao battingStatsDao;
    private BowlingStatsDao bowlingStatsDao;

    public void setPlayerDao(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public void setBattingStatsDao(BattingStatsDao battingStatsDao) {
        this.battingStatsDao = battingStatsDao;
    }

    public void setBowlingStatsDao(BowlingStatsDao bowlingStatsDao) {
        this.bowlingStatsDao = bowlingStatsDao;
    }

    @Override
    public List<Player> selectFinalTeam() {

        List<Player> players = playerDao.getAllPlayers();
        List<BattingStats> battingStats = battingStatsDao.getAllBattingStats();
        List<BowlingStats> bowlingStats = bowlingStatsDao.getAllBowlingStats();

        // Convert lists to maps for easy lookup
        Map<Integer, BattingStats> battingMap = battingStats.stream()
                .collect(Collectors.toMap(BattingStats::getPlayerId, b -> b));

        Map<Integer, BowlingStats> bowlingMap = bowlingStats.stream()
                .collect(Collectors.toMap(BowlingStats::getPlayerId, b -> b));

        List<PlayerPerformance> performances = new ArrayList<>();

        for (Player player : players) {
            PlayerPerformance perf = new PlayerPerformance();
            perf.setPlayer(player);

            BattingStats bat = battingMap.get(player.getPlayerId());
            if (bat != null) {
                perf.setBattingAverage(bat.getAverage());
                perf.setTotalRuns(bat.getRuns());
            }

            BowlingStats bowl = bowlingMap.get(player.getPlayerId());
            if (bowl != null) {
                perf.setWickets(bowl.getWickets());
                perf.setBowlingAverage(bowl.getBowlingAverage());
            }

            performances.add(perf);
        }

        // --- Selection Rules ---

        List<Player> finalTeam = new ArrayList<>();

        // Top 5 Batsmen
        performances.stream()
                .filter(p -> "BATSMAN".equalsIgnoreCase(p.getPlayer().getRole()))
                .sorted(Comparator
                        .comparingDouble(PlayerPerformance::getBattingAverage).reversed()
                        .thenComparingInt(PlayerPerformance::getTotalRuns).reversed())
                .limit(5)
                .forEach(p -> finalTeam.add(p.getPlayer()));

        // Top 2 All-rounders
        performances.stream()
                .filter(p -> "ALL_ROUNDER".equalsIgnoreCase(p.getPlayer().getRole()))
                .filter(p -> p.getBattingAverage() >= 30 && p.getWickets() >= 20)
                .limit(2)
                .forEach(p -> finalTeam.add(p.getPlayer()));

        // Top 4 Bowlers
        performances.stream()
                .filter(p -> "BOWLER".equalsIgnoreCase(p.getPlayer().getRole()))
                .sorted(Comparator
                        .comparingDouble(PlayerPerformance::getBowlingAverage)
                        .thenComparingInt(PlayerPerformance::getWickets).reversed())
                .limit(4)
                .forEach(p -> finalTeam.add(p.getPlayer()));

        return finalTeam;
    }
}
