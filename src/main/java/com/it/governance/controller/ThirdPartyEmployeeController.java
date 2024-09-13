package com.it.governance.controller;
import com.it.governance.model.ThirdPartyEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.it.governance.service.ThirdPartyEmployeeService;


@Controller
public class ThirdPartyEmployeeController {

	@Autowired
	private ThirdPartyEmployeeService thirdPartyEmployeeService;

	// display list of employees
	@GetMapping("/showThirdPartyEmployees")
	public String ViewHomePage(Model model) {
		model.addAttribute("listEmployees", thirdPartyEmployeeService.getAllEmployees());
		return "third_party_employees";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showEmployeeForm(Model model) {
		ThirdPartyEmployee thirdPartyEmployee = new ThirdPartyEmployee();
		model.addAttribute("thirdPartyEmployee", thirdPartyEmployee);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("thirdPartyEmployee") ThirdPartyEmployee thirdPartyEmployee) {
		// save employee to database
		thirdPartyEmployeeService.saveEmployee(thirdPartyEmployee);
		return "redirect:/showThirdPartyEmployees";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		ThirdPartyEmployee thirdPartyEmployee = thirdPartyEmployeeService.getEmployeeById(id);
		model.addAttribute("thirdPartyEmployee", thirdPartyEmployee);
		return "update_employee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable ( value = "id") long id, Model model) {
		this.thirdPartyEmployeeService.deleteEmployeeById(id);
		return "redirect:/showThirdPartyEmployees";
	}
}
