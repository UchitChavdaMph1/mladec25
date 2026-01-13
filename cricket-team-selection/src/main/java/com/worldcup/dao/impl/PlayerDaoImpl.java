package com.worldcup.dao.impl;

import com.worldcup.dao.PlayerDao;
import com.worldcup.mapper.PlayerRowMapper;
import com.worldcup.model.Player;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PlayerDaoImpl implements PlayerDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Player> getAllPlayers() {
        String sql = "SELECT * FROM players";
        return jdbcTemplate.query(sql, new PlayerRowMapper());
    }
}
