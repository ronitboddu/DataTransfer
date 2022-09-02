package com.example.DataTransfer.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ActorRowMapper implements RowMapper<Actor> {
    @Override
    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Actor(
                rs.getInt("actor_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("last_update")
        );
    }
}
