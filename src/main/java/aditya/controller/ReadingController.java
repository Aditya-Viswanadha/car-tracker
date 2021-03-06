package aditya.controller;

import aditya.entity.Readings;
import aditya.service.ReadingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ReadingController {

   @Autowired
   ReadingService readingService;

   @RequestMapping(method = RequestMethod.POST, value="/readings")
   public Readings saveReading(Readings readings){
       return readingService.saveReading(readings);
   }
}