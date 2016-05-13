package com.udr.controller;

import com.udr.models.Record;
import com.udr.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by udr013 on 11-5-2016.
 */
@Controller
public class CollectionController {

    @Autowired
    RecordServiceInterface recordServiceInterface;


    //    @Autowired
//    public void setRecordServiceInterface(RecordServiceInterface recordServiceInterface) {
//        this.recordServiceInterface = recordServiceInterface;
//    }
    static ArrayList<Record> sortRecords;

    @RequestMapping("/completeCollection")
    public String viewCollection(Model model) {
        System.out.println("collection");
        model.addAttribute("record", new Record());
        sortRecords = (ArrayList<Record>)recordServiceInterface.getAllRecords();
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = {"/record/save"}, method = RequestMethod.POST)
    public String saveRecord(@ModelAttribute("record") Record record) {
        recordServiceInterface.saveRecord(record);

        return "completeCollection";
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

    @RequestMapping("/sortCollection/artist")
    public String sortByArtistCollection(Model model) {
        System.out.println("sortByArtistCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new ArtistCompare());
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping("/sortCollection/album")
    public String sortByAlbumCollection(Model model) {
        System.out.println("sortByAlbumCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new AlbumCompare());
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping("/sortCollection/year")
    public String sortByDateCollection(Model model) {
        System.out.println("sortByDateCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new DateCompare());
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = "sortCollection/format")
    public String sortByFormatCollection(Model model) {
        System.out.println("sortByFormatCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new FormatCompare());
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = "/sortCollection/label")
    public String sortByLabelCollection(Model model) {
        System.out.println("sortByLabelCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new LabelCompare());
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = "/sortCollection/price")
    public String sortByPriceCollection(Model model) {
        System.out.println("sortByPriceCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new PriceCompare());
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping("/sortCollection/artist/reverse")
    public String reverseSortByArtistCollection(Model model) {
        System.out.println("sortByArtistCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new ArtistCompare());
        Collections.reverse(sortRecords);
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping("/sortCollection/album/reverse")
    public String reverseSortByAlbumCollection(Model model) {
        System.out.println("sortByAlbumCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new AlbumCompare());
        Collections.reverse(sortRecords);
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping("/sortCollection/year/reverse")
    public String reverseSortByDateCollection(Model model) {
        System.out.println("sortByDateCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new DateCompare());
        Collections.reverse(sortRecords);
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = "sortCollection/format/reverse")
    public String reverseSortByFormatCollection(Model model) {
        System.out.println("sortByFormatCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new FormatCompare());
        Collections.reverse(sortRecords);
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = "/sortCollection/label/reverse")
    public String reverseSortByLabelCollection(Model model) {
        System.out.println("sortByLabelCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new LabelCompare());
        Collections.reverse(sortRecords);
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }

    @RequestMapping(value = "/sortCollection/price/reverse")
    public String reverseSortByPriceCollection(Model model) {
        System.out.println("sortByPriceCollection");
        model.addAttribute("record", new Record());
        Collections.sort(sortRecords, new PriceCompare());
        Collections.reverse(sortRecords);
        model.addAttribute("allRecords", sortRecords);
        return "collection";
    }


}
