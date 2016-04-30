package com.udr.controller;

import com.udr.models.Record;
import com.udr.services.RecordServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by udr013 on 21-4-2016.
 */
@Controller
@ComponentScan
public class WebController {

    @Autowired
    RecordServiceInterface recordServiceInterface;

//    @Autowired
//    public void setRecordServiceInterface(RecordServiceInterface recordServiceInterface) {
//        this.recordServiceInterface = recordServiceInterface;
//    }

    @RequestMapping(value = {"/","/startpage"}, method = RequestMethod.GET)
    public String startPage(Model model){
        model.addAttribute("record", new Record());
        model.addAttribute("allRecords", (ArrayList<Record>)recordServiceInterface.getAllRecords());

        return "index";

    }

    @RequestMapping("/collection")
    public String viewCollection(Model model) {
        model.addAttribute("record", new Record());
        model.addAttribute("allRecords", (ArrayList<Record>)recordServiceInterface.getAllRecords());

        return "collection";
    }

    @RequestMapping(value = {"/record/save"}, method = RequestMethod.POST)
    public String saveRecord(@ModelAttribute("record") Record record) {
       recordServiceInterface.saveRecord(record);

        return "redirect:/collection";
    }
    @RequestMapping(value = {"/record/delete/{id}"}, method = RequestMethod.GET)
    public String deleteRecord(@PathVariable("id") Integer  id) {
        System.out.println("we have id"+id);
        recordServiceInterface.deleteRecord(id);

        return "redirect:/collection";
    }

    @RequestMapping("/about")
    public String viewAbout(){
        return "about";
    }

    @RequestMapping("/contact")
    public String viewContact(){
        return "contact";
    }

}
