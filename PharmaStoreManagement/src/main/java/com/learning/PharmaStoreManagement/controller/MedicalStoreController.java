package com.learning.PharmaStoreManagement.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.learning.PharmaStoreManagement.emailService.SendEmailService;
import com.learning.PharmaStoreManagement.model.MedicalStore;
import com.learning.PharmaStoreManagement.repo.IMediRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Controller
@Tag(name="PharmaStoreManagementAPIS", description="APIS to view available stock/products , Add new product, update stock and delete the out of stock or expired products details")
public class MedicalStoreController {

	@Autowired
	public IMediRepository repo;
	
	@Autowired
	private SendEmailService sendEmailService;
	
	@GetMapping("/list-medicines")
	@Operation(summary="GET operation ",description="API will return list of Medicines with available stocks within pharmacy ")
	public String retrieveAllMedicines(ModelMap model)
	{
		List<MedicalStore> med = repo.findAll();
		System.out.println(med);
		model.addAttribute("med",med);
		return "listMedicines";
	}
	
	
	    //GET,POST
		@GetMapping("/add-todo")
		@Operation(summary="GET operation ",description="API will add a new Medicine along with available stocks within pharmacy ")
		public String shownewTodo( ModelMap model)
		{
			MedicalStore med=new MedicalStore();
			model.put("med", med);
			return "todo";
		}
		
		
		@PostMapping("/add-todo") //@RequestMapping(value="add-todo", method= RequestMethod.POST)
		@Operation(summary="POST operation ",description="API will accept json medicine info and will return the list of available medicines along with the new stock")
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
		
		@DeleteMapping("delete-todo")
		@Operation(summary="DELETE operation ",description="API will delete the product")
		public String deletTodo(@RequestParam int id)
		{
			repo.deleteById(id);
			//sendEmailService.sendEmail("arthiawsacc@gmail.com", "medicine is out of stock", "Mail from PharmaStore");
			return "redirect:list-medicines";
		}
		
		
		@GetMapping("update-todo") //@RequestMapping(value="update-todo" ,method=RequestMethod.GET)
		@Operation(summary="GET operation ",description="API will return the list of available medicines to update the stock/ medicine info")
		public String ShowUpdateTodoPage(@RequestParam int id,ModelMap model)
		{
			
			MedicalStore med = repo.findById(id).get();
			model.addAttribute("med",med);
			return "todo";
		}
		
		
		@PostMapping("update-todo")  //@RequestMapping(value="update-todo", method = RequestMethod.POST)
		@Operation(summary="POST operation ",description="API will accept json medicine info and will return the list of available medicines along with the updated stock")
		public String updateTodo(ModelMap model, @Valid MedicalStore med, BindingResult result) {
			
			if(result.hasErrors()) {
				return "todo";
			}
		
			repo.save(med);
			return "redirect:list-medicines";
		}
	
	

}
