package com.workintech.s17d2.rest;

import com.workintech.s17d2.model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.workintech.s17d2.tax.Taxable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private Taxable taxable;
    public Map<Integer, Developer> developers;

    @PostConstruct
    public void init() {
        developers=new HashMap<>();
    }

    @Autowired
    public DeveloperController(Taxable taxable){
        this.taxable=taxable;
    }
/*
    @GetMapping
    public List<Developer> getAllDevelopers(){
        return developers.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable("id") Integer id) throws Exception {
        if(developers.containsKey(id)) {
            return developers.get(id);
        }else{
            throw new Exception("Developer uygulanamadı");
        }
    }

    @PostMapping
    public Developer createDeveloper(@RequestBody Developer developer){
       Developer createdDeveloper=null;
        if(developer.getExperience().equals(Experience.JUNIOR)){
            double vergi=developer.getSalary()*taxable.getSimpleTaxRate()/100;
           createdDeveloper=new JuniorDeveloper(developer.getId(),developer.getName(),developer.getSalary()-vergi);
        }else if(developer.getExperience().equals(Experience.MID)){
            double vergi=developer.getSalary()*taxable.getMiddleTaxRate()/100;
            createdDeveloper=new MidDeveloper(developer.getId(),developer.getName(),developer.getSalary()-vergi);
        }else if(developer.getExperience().equals(Experience.SENIOR)){
            double vergi=developer.getSalary()*taxable.getUpperTaxRate()/100;
            createdDeveloper=new SeniorDeveloper(developer.getId(),developer.getName(),developer.getSalary()-vergi);
        }
        if(Objects.nonNull(createdDeveloper)){
            developers.put(createdDeveloper.getId(),createdDeveloper);
        }
        return createdDeveloper;
    }


    @PutMapping("{id}")
    public Developer updateDeveloper(@PathVariable("id") Integer id,@RequestBody Developer developer){
        developer.setId(id);
        Developer createdDeveloper=null;
        if(developer.getExperience().equals(Experience.JUNIOR)){
            double vergi=developer.getSalary()*taxable.getSimpleTaxRate()/100;
            createdDeveloper=new JuniorDeveloper(developer.getId(),developer.getName(),developer.getSalary()-vergi);
        }else if(developer.getExperience().equals(Experience.MID)){
            double vergi=developer.getSalary()*taxable.getMiddleTaxRate()/100;
            createdDeveloper=new MidDeveloper(developer.getId(),developer.getName(),developer.getSalary()-vergi);
        }else if(developer.getExperience().equals(Experience.SENIOR)){
            double vergi=developer.getSalary()*taxable.getUpperTaxRate()/100;
            createdDeveloper=new SeniorDeveloper(developer.getId(),developer.getName(),developer.getSalary()-vergi);
        }
        if(Objects.nonNull(createdDeveloper)){
            developers.put(createdDeveloper.getId(),createdDeveloper);
        }
        return createdDeveloper;
    }

    @DeleteMapping("/{id}")
    public Developer delete(@PathVariable("id")Integer id){
        Developer developer=developers.remove(id);
        return developer;
    }*/
}
