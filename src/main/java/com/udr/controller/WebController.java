package com.udr.controller;

import com.udr.models.Record;
import com.udr.services.RecordServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    static ArrayList<Record> sortRecords;

    @RequestMapping("/")
    public String startPage(){

        return "index";

    }

    @RequestMapping("/completeCollection")
    public String viewCollection(Model model) {
        System.out.println("collection");
        model.addAttribute("record", new Record());
        sortRecords = (ArrayList<Record> )recordServiceInterface.getAllRecords();
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }



    @RequestMapping(value = {"/record/save"}, method = RequestMethod.POST)
    public String saveRecord(@ModelAttribute("record") Record record) {
       recordServiceInterface.saveRecord(record);

        return "redirect:/collection";
    }
    @RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.GET)
    public String deleteRecord(@PathVariable("id") Integer  id) {
        System.out.println("we have id"+id);
        recordServiceInterface.deleteRecord(id);

        return "redirect:/collection";
    }

    @RequestMapping(value = {"/update/{id}"}, method = RequestMethod.GET)
    public String editRecord(@PathVariable("id") Integer  id,Model model) {

        System.out.println("we have id"+id);
        Record editRecord= recordServiceInterface.findRecord(id);
        model.addAttribute("editRecord", editRecord);
        model.addAttribute("allRecords", sortRecords);
        return "/update";
    }

    @RequestMapping(value = {"/record/update"}, method = RequestMethod.POST)
    public String updateRecord(@ModelAttribute("editRecord") Record editRecord){
        System.out.println("we have editRecord"+editRecord);
        recordServiceInterface.editRecord(editRecord);

        return "redirect:/collection";
    }

    @RequestMapping(value = "/getAllByArtist", method = RequestMethod.GET)
    //@ResponseBody
    public String getAllByArtist(@RequestParam("artist") String artist, Model model) {
        System.out.println(artist);
        sortRecords = (ArrayList<Record> )recordServiceInterface.findByArtist(artist);
        model.addAttribute("allRecords", sortRecords);

        return "artistCollection";
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
