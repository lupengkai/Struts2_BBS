package com.bbs.service;

import com.bbs.model.Category;
import com.bbs.util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tage on 3/14/16.
 */
public class CategoryService {
    public void add(Category c) {
        Connection conn = DB.createConn();
        String sql = "INSERT INTO _CATEGORY VALUE (NULL, ?, ?)";
        PreparedStatement ps = DB.prepare(conn,sql);
        try {
            ps.setString(1, c.getName());
            ps.setString(2, c.getDescription());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(ps);
            DB.close(conn);
        }
    }

    public List<Category> list() throws Exception{
        List<Category> categories = new ArrayList<>();

        Connection conn = DB.createConn();
        String sql = "SELECT * FROM _CATEGORY";
        PreparedStatement ps = DB.prepare(conn,sql);
        try {
            ResultSet rs = ps.executeQuery();
            Category c = null;
            while (rs.next()) {
                c = new Category();
                c.setId(rs.getInt("ID"));
                c.setName(rs.getString("NAME"));
                c.setDescription(rs.getString("DESCRIPTION"));
                categories.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw(e);

        } finally {
            DB.close(ps);
            DB.close(conn);
        }
        return categories;
    }

    public void delete(Category c) {
        deleteById(c.getId());
    }

    public void deleteById(int id) {
        Connection conn = DB.createConn();
        String sql = "DELETE FROM _CATEGORY WHERE ID =  ? " ;
        PreparedStatement ps = DB.prepare(conn,sql);
        try {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(ps);
            DB.close(conn);
        }
    }

    public void update(Category c) {
        Connection conn = DB.createConn();
        String sql = "UPDATE  _CATEGORY SET NAME = ?, DESCRIPTION = ? WHERE ID = ?";
        PreparedStatement ps = DB.prepare(conn,sql);
        try {
            ps.setString(1, c.getName());
            ps.setString(2, c.getDescription());
            ps.setInt(3, c.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(ps);
            DB.close(conn);
        }
    }


    public Category loadById(int id) {
        Category c = null;
        Connection conn = DB.createConn();
        String sql = "SELECT * FROM _CATEGORY WHERE ID = ?";
        PreparedStatement ps = DB.prepare(conn,sql);
        try {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = new Category();
                c.setId(rs.getInt("ID"));
                c.setName(rs.getString("NAME"));
                c.setDescription(rs.getString("DESCRIPTION"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(ps);
            DB.close(conn);
        }
        return c;
    }

}
