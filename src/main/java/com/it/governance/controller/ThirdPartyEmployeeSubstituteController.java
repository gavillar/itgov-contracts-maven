package com.it.governance.controller;

import com.it.governance.model.ThirdPartySubstituteEmployee;
import com.it.governance.service.ThirdPartySubstituteEmployeeService;
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
    private ThirdPartySubstituteEmployeeService thirdPartySubstituteEmployeeService;

    // display list of employees
    @GetMapping("/showSubstituionHistoryEmployees")
    public String ViewHomePage(Model model) {
        model.addAttribute("listSubstituteEmployees", thirdPartySubstituteEmployeeService.getAllSubstituteEmployees());
        return "third_party_substitute_employees";
    }

    @GetMapping("/showNewSubstituteEmployeeForm")
    public String showEmployeeForm(Model model) {
        ThirdPartySubstituteEmployee thirdPartySubstituteEmployee = new ThirdPartySubstituteEmployee();
        model.addAttribute("thirdPartySubstituteEmployee", thirdPartySubstituteEmployee);
        return "new_substitute_employee";
    }

    @PostMapping("/saveSubstituteEmployee")
    public String saveEmployee(@ModelAttribute("thirdPartySubstituteEmployee") ThirdPartySubstituteEmployee thirdPartySubstituteEmployee) {
        // save employee to database
        thirdPartySubstituteEmployeeService.saveSubstituteEmployee(thirdPartySubstituteEmployee);
        return "redirect:/showSubstituionHistoryEmployees";
    }

    @GetMapping("/showSubstituteFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {
        ThirdPartySubstituteEmployee thirdPartySubstituteEmployee = thirdPartySubstituteEmployeeService.getEmployeeSubstituteById(id);
        model.addAttribute("thirdPartySubstituteEmployee", thirdPartySubstituteEmployee);
        if (thirdPartySubstituteEmployee.getCompleteNameSubstitute() != null) {
            return "update_substitute_employee";
        }
        return null;
    }

    @GetMapping("/deleteSubstituteEmployee/{id}")
    public String deleteEmployee(@PathVariable ( value = "id") long id, Model model) {
        this.thirdPartySubstituteEmployeeService.deleteEmployeeById(id);
        return "redirect:/showSubstituionHistoryEmployees";
    }
}
