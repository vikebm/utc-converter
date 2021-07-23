package com.utc.converter.controllers;

import com.utc.converter.models.UTCTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ConverterController {

    @CrossOrigin(origins = "*")
   @PostMapping("/convert")
   public ResponseEntity<UTCTime> convertDate(@RequestBody UTCTime date){
       return new ResponseEntity<>(date, HttpStatus.OK);
   }

}
