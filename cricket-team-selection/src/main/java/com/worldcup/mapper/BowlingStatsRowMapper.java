package com.worldcup.mapper;

import com.worldcup.model.BowlingStats;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BowlingStatsRowMapper implements RowMapper<BowlingStats> {

    @Override
    public BowlingStats mapRow(ResultSet rs, int rowNum) throws SQLException {
        BowlingStats stats = new BowlingStats();
        stats.setPlayerId(rs.getInt("player_id"));
        stats.setMatches(rs.getInt("matches"));
        stats.setWickets(rs.getInt("wickets"));
        stats.setBowlingAverage(rs.getDouble("bowling_average"));
        stats.setEconomy(rs.getDouble("economy"));
        return stats;
    }
}
