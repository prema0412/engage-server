package com.company.engage.Controllers;

import com.company.engage.Models.Member;
import com.company.engage.Repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http//localhost:3000")

public class MemberController {

    @Autowired
    MemberRepository repository;

    @PostMapping("/member")
    public ResponseEntity<String> addMember(@RequestBody Member member){
        repository.save(member);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Member Added " + member.getName());
    }


    @GetMapping("/members")
    public ResponseEntity<List<Member>> getMembers(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
}
