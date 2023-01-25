package com.customprojects.springliquibasemysql.controlers;

import com.customprojects.springliquibasemysql.models.Insurance;
import com.customprojects.springliquibasemysql.models.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceRepository insuranceRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Insurance> getAllUsers() {
        return insuranceRepository.findAll();
    }

    @PostMapping(path = "/add")
    public @ResponseBody String addNewInsurance(@RequestParam String name, @RequestParam String type) {
        Insurance insurance = new Insurance();
        insurance.setName(name);
        insurance.setType(type);
        insuranceRepository.save(insurance);
        return "Saved";
    }
}
