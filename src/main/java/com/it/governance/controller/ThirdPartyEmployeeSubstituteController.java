package com.it.governance.controller;

import com.it.governance.model.ThirdPartyEmployee;
import com.it.governance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThirdPartyEmployeeSubstituteController {

    @Autowired
    private EmployeeService employeeService;

    // display list of employees
    @GetMapping("/showSubstituionHistoryEmployees")
    public String ViewHomePage(Model model) {
       // model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "third_party_substitute_employees";
    }

    @GetMapping("/showNewSubstituionEmployeeForm")
    public String showEmployeeForm(Model model) {
        ThirdPartyEmployee thirdPartyEmployee = new ThirdPartyEmployee();
      //  model.addAttribute("employee", thirdPartyEmployee);
        return "substituion_new_employee";
    }

    @PostMapping("/saveSubistituionEmployee")
    public String saveEmployee(@ModelAttribute("employee") ThirdPartyEmployee thirdPartyEmployee) {
        // save employee to database
     //   employeeService.saveEmployee(thirdPartyEmployee);
        return "redirect:/showSubstituionHistoryEmployee";
    }

    @GetMapping("/showSubstituionFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {
        ThirdPartyEmployee thirdPartyEmployee = employeeService.getEmployeeById(id);
    //    model.addAttribute("employee", thirdPartyEmployee);
        return "substituion_update_employee";
    }

    @GetMapping("/deleteSubstituionEmployee/{id}")
    public String deleteEmployee(@PathVariable ( value = "id") long id, Model model) {
    //    this.employeeService.deleteEmployeeById(id);
        return "redirect:/showSubstituionHistoryEmployee";
    }
}
