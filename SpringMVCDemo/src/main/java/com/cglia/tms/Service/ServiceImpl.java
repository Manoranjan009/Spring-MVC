package com.cglia.tms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cglia.tms.DAO.TraineeDAO;
import com.cglia.tms.DAO.TraineeDAOImpl;
import com.cglia.tms.Model.Trainee;

@Service
public class ServiceImpl {
	private TraineeDAO traineeDAO = new TraineeDAOImpl();
	
     public Integer save(Trainee trainee) {
    	 traineeDAO=new TraineeDAOImpl();
	 	Integer id=traineeDAO.add(trainee);
		return id;
	}
     
    public void deleteById(Integer id) {
        traineeDAO.deleteById(id);
    }

    
    public Integer update(Trainee trainee) {
       Integer id = traineeDAO.update(trainee);
        return id;
    }

    
    public List<Trainee> getAllDetails() {
        return traineeDAO.getAllDetails();
    }

}
