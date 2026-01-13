package com.worldcup.dao.impl;

import com.worldcup.dao.BowlingStatsDao;
import com.worldcup.mapper.BowlingStatsRowMapper;
import com.worldcup.model.BowlingStats;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BowlingStatsDaoImpl implements BowlingStatsDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BowlingStats> getAllBowlingStats() {
        String sql = "SELECT * FROM bowling_stats";
        return jdbcTemplate.query(sql, new BowlingStatsRowMapper());
    }
}
