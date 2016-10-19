package org.stripesbook.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DvdDAO {
    //DB Connection
    private Connection connection;
    
    //INSERT SQL
    private static final String insertSql = "INSERT INTO dvds (title, genre, cost) VALUES (?, ?, ?)";
    
    //SELECT * SQL
    private static final String selectAllSql = "SELECT * FROM dvds";
            
    /**
     * Insert a DVD
     */
    public void insert(Dvd dvd){
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(insertSql);
            stmt.setString(1, dvd.getTitle());
            stmt.setString(2, dvd.getGenre());
            stmt.setDouble(3, dvd.getCost());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        } finally{
            closeAll(null, stmt, conn);
        }
    }
    
    /**
     * Select all DVD records
     */
    public List<Dvd> selectAll(){
        List<Dvd> dvds = new ArrayList<Dvd>();
                
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(selectAllSql);
            while(resultSet.next()){
                String title = resultSet.getString("title");
                String genre = resultSet.getString("genre");
                double cost = resultSet.getDouble("cost");
                Dvd dvd = new Dvd(title, cost, genre);
                dvds.add(dvd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        } finally{
            closeAll(null, stmt, conn);
        }
        return dvds;
    }

    private Connection getConnection() {
        if(connection==null){
            String dbUrl = "jdbc:mysql://localhost/stripesbook";
            try{
                Class.forName ("com.mysql.jdbc.Driver").newInstance();
                connection = DriverManager.getConnection (dbUrl , "stripesbook", "password");
            } catch(Exception ex){
                ex.printStackTrace(System.err);
            }
        }
        return connection;    
    }
    
    private void closeAll(ResultSet rs, Statement stmt, Connection conn) {
        try{
            if(rs!=null){
                rs.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if(conn!=null){
                conn.close();
            }
        } catch(SQLException ex){
            ex.printStackTrace(System.err);
        }
    }
}
