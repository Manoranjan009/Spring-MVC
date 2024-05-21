package com.cglia.tms.DAO;

import java.util.List;

import com.cglia.tms.Model.Trainee;

public interface TraineeDAO {
	
    public Integer add(Trainee trainee);
    
    public void deleteById(Integer id);
    
    public Integer update(Trainee trainee);
    
    public List<Trainee> getAllDetails();
    
	
}
