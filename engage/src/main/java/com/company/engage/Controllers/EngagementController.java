package com.company.engage.Controllers;

import com.company.engage.Models.Engagement;
import com.company.engage.Repositories.EngagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin

public class EngagementController {

    @Autowired
    EngagementRepository repository;


    @PostMapping("/engagement")
    public ResponseEntity<String> addEngagement(@RequestBody Engagement engagement) {
        System.out.println("engagement"+engagement);
        repository.save(engagement);
        return ResponseEntity.status(HttpStatus.CREATED).body("Engagement Created " + engagement.getTitle());
    }

    @GetMapping("engagements")
    public ResponseEntity<List<Engagement>> getEngagements(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findOpenEngagements());
    }

    @GetMapping("categories")
    public ResponseEntity<List<String>> getCategories(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllCategories());
    }

    @GetMapping("locations")
    public ResponseEntity<List<String>> getLocations(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllLocations());
    }

    @GetMapping("workOptions")
    public ResponseEntity<List<String>> getWorkOptions(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllWorkOptions());
    }

    @PatchMapping("/engagement/{id}/report")
    @Transactional
    public ResponseEntity<String> reportEngagement(@PathVariable int id) {

        System.out.println("in patch");

        repository.reportEngagement(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Engagement Reported ");
    }

}
