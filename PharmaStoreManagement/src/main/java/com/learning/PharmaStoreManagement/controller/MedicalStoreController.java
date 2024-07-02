package com.learning.PharmaStoreManagement.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;


import com.learning.PharmaStoreManagement.model.MedicalStore;
import com.learning.PharmaStoreManagement.repo.IMediRepository;

import jakarta.validation.Valid;

@Controller
public class MedicalStoreController {

	@Autowired
	public IMediRepository repo;
	
	@GetMapping("/list-medicines")
	public String retrieveAllMedicines(ModelMap model)
	{
		List<MedicalStore> med = repo.findAll();
		System.out.println(med);
		model.addAttribute("med",med);
		return "listMedicines";
	}
	
	
	//GET,POST
		//@RequestMapping(value="add-todo", method= RequestMethod.GET)
		@GetMapping("/add-todo")
		public String shownewTodo( ModelMap model)
		{
			MedicalStore med=new MedicalStore();
			model.put("med", med);
			return "todo";
		}
		
		@RequestMapping(value="add-todo", method= RequestMethod.POST)
		public String addnewTodo( ModelMap model,@Valid MedicalStore med, BindingResult result)
		{
			if(result.hasErrors())
			{
				return "todo";
			}
			
			med.setMid(0);
			repo.save(med);
			
			return "redirect:list-medicines";
		}
		
		@RequestMapping("delete-todo")
		public String deletTodo(@RequestParam int id)
		{
			repo.deleteById(id);
			return "redirect:list-medicines";
		}
		
		@RequestMapping(value="update-todo" ,method=RequestMethod.GET)
		public String ShowUpdateTodoPage(@RequestParam int id,ModelMap model)
		{
			
			MedicalStore med = repo.findById(id).get();
			model.addAttribute("med",med);
			return "todo";
		}
	
	

}
