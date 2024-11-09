package com.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardDao {
    public int insBoard(Board board){
        int result = 0;
        String sql=" insert into board" +
                " set title = ? " +
                " , contents = ? " +
                " , writer = ? ";
        try (Connection conn= MyConnection.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)){

            {
                ps.setString(1, board.getTitle());
                ps.setString(2, board.getContents());
                ps.setString(3, board.getWriter());

                result=ps.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int delBoard(int boardId){
        int result = 0;
        String sql = " delete from board " +
                " where board_id = ? ";
        try (Connection conn = MyConnection.getConn();
        PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setInt(1,boardId);
            result = ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}