package com.worldcup.mapper;

import com.worldcup.model.BattingStats;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BattingStatsRowMapper implements RowMapper<BattingStats> {

    @Override
    public BattingStats mapRow(ResultSet rs, int rowNum) throws SQLException {
        BattingStats stats = new BattingStats();
        stats.setPlayerId(rs.getInt("player_id"));
        stats.setMatches(rs.getInt("matches"));
        stats.setRuns(rs.getInt("runs"));
        stats.setAverage(rs.getDouble("average"));
        stats.setStrikeRate(rs.getDouble("strike_rate"));
        return stats;
    }
}
