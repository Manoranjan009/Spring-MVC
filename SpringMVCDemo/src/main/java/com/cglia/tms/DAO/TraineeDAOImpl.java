package com.cglia.tms.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cglia.tms.DButils.DBconnection;
import com.cglia.tms.Model.Trainee;

public class TraineeDAOImpl implements TraineeDAO {
	
	@Override
	public Integer add(Trainee trainee) {
		int out = 0;
		String query = "INSERT INTO TRAINEE (name,email,mob_no,college_name,city) VALUES(? , ? , ? , ? , ?) ";
		try(Connection connection = DBconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);)
		{
			   statement.setString(1,trainee.getName());
			   statement.setString(2,trainee.getEmail());
			   statement.setString(3,trainee.getMob_no());
			   statement.setString(4,trainee.getCollege_name());
			   statement.setString(5,trainee.getCity());
			   out = statement.executeUpdate();
			   
			   if(out>0) {
				   try (ResultSet rs = statement.getGeneratedKeys()) {
		                if (rs.next()) {
		                    Integer id = rs.getInt(1);
		                    System.out.println("Trainee added with id=" + id);
		                    return id;
		                }
		            }
		        } else {
		            System.out.println("Employee save failed");
		            return out;
		        }
			   }
		
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		
	 }
		return out;
	}
	
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DBconnection.getConnection();
            pstmt = conn.prepareStatement("DELETE FROM trainee WHERE id = ?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
		
	}

	@Override
	public Integer update(Trainee trainee) {
		Connection conn = null;
        PreparedStatement pstmt = null;
        Integer id = 0;
        try {
            conn = DBconnection.getConnection();
            pstmt = conn.prepareStatement("UPDATE trainee SET name = ?, email = ?, mob_no = ?, college_name = ?, city = ? WHERE id = ?");
            pstmt.setString(1, trainee.getName());
            pstmt.setString(2, trainee.getEmail());
            pstmt.setString(3, trainee.getMob_no());
            pstmt.setString(4, trainee.getCollege_name());
            pstmt.setString(5, trainee.getCity());
            id = trainee.getId();
            pstmt.setInt(6, id);
            pstmt.executeUpdate();
            
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
			
	}

	@Override
	public List<Trainee> getAllDetails() {
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Trainee> trainees = new ArrayList<>();
        try {
            conn = DBconnection.getConnection();
            pstmt = conn.prepareStatement("SELECT * FROM trainee");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Trainee trainee = new Trainee(rs.getInt("id"), 
                		                      rs.getString("name"), 
                		                      rs.getString("email"), 
                		                      rs.getString("mob_no"), 
                		                      rs.getString("college_name"), 
                		                      rs.getString("city"));
                trainees.add(trainee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trainees;
	}

}
