package com.it.governance.controller;

import com.it.governance.model.VendorContact;
import com.it.governance.service.VendorContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VendorContactController {

    @Autowired
    private VendorContactService vendorContactService;

    @GetMapping("/showVendorContacts")
    public String ViewHomePage(Model model) {
        model.addAttribute("listVendorContact", vendorContactService.getAllVendorContact());
        return "vendor_contact";
    }
    @GetMapping("/showVendorContactForm")
    public String showVendorContactForm(Model model) {
        VendorContact vendorContact = new VendorContact();
        model.addAttribute("vendorContact", vendorContact);
        return "new_vendor_contact";
    }

    @PostMapping("/saveVendorContact")
    public String saveVendorContact(@ModelAttribute("vendorContact") VendorContact vendorContact) {
        // save employee to database
        vendorContactService.saveVendorContact(vendorContact);
        return "redirect:/showVendorContacts";
    }

    @GetMapping("/showVendorContactFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {
        VendorContact vendorContact = vendorContactService.getVendorContactById(id);
        model.addAttribute("vendorContact", vendorContact);
        return "update_vendor_contact";
    }

    @GetMapping("/deleteVendorContact/{id}")
    public String deleteVendorContact(@PathVariable ( value = "id") long id, Model model) {
        this.vendorContactService.deleteContactById(id);
        return "redirect:/showVendorContacts";
    }

}
