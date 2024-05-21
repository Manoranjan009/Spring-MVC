package com.cglia.tms.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cglia.tms.Model.Trainee;
import com.cglia.tms.Service.ServiceImpl;

@Controller
public class TmsController {

@Autowired
private ServiceImpl service;
	
@RequestMapping({"/home","/"})
public String showHome() {
	return "Home";
}
@RequestMapping("/add")
public String add() {
	return "Add";
}
@RequestMapping("/update")
public String update()
{
	return "Update";
}
@RequestMapping("/delete")
public String updateById()
{
	return "Delete";
}

@RequestMapping(path="/save", method=RequestMethod.POST)
public String save(@ModelAttribute Trainee tr, HttpServletRequest request , RedirectAttributes attrs) {
	System.out.println(tr);
	Integer id=service.save(tr);
	request.setAttribute("id", id);
	
	if(id>0) {
		request.setAttribute("successmsg","Trainee saved successfully with ID:"+id);
	}else {
		request.setAttribute("failuremsg","System problem. Please contact Help desk.");
	}
	
	return "redirect:/alldetails";
}
@GetMapping("/alldetails")
public String listTrainees(@ModelAttribute Trainee trainee , HttpServletRequest request) {
	
	List<Trainee> trainees = service.getAllDetails();
    request.setAttribute("trainees", trainees);
    return "Trainee_list";
}

@RequestMapping(path="/updatetrainee",method=RequestMethod.POST)
public String Update( @ModelAttribute Trainee trainee) {
	int count = service.update(trainee);
	if(count != 0) {
		System.out.println("Trainee data is updated .");
		} else {
			System.out.println("Update failed .");
		}  
    return "redirect:/alldetails";
}
@RequestMapping("/deletebyid")
public String delete(@ModelAttribute Trainee trainee )
{    
	service.deleteById(trainee.getId());
	System.out.println("Delete Successfully .");
    return "redirect:/alldetails";
}


}
