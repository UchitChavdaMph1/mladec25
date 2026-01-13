package com.worldcup.dao.impl;

import com.worldcup.dao.BattingStatsDao;
import com.worldcup.mapper.BattingStatsRowMapper;
import com.worldcup.model.BattingStats;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BattingStatsDaoImpl implements BattingStatsDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BattingStats> getAllBattingStats() {
        String sql = "SELECT * FROM batting_stats";
        return jdbcTemplate.query(sql, new BattingStatsRowMapper());
    }
}
