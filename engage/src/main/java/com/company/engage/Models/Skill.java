package com.company.engage.Models;

import javax.persistence.*;

//@Entity

public class Skill {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  //  @ManyToOne
   // @JoinColumn(name="member-id", insertable = false, nullable = false)
  //  private Member member;
    private String skill;
    private Proficiency proficiency;

    public Skill() {
    }

    public Skill(Member member, String skill, Proficiency proficiency) {
       // this.member = member;
        this.skill = skill;
        this.proficiency = proficiency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Proficiency getProficiency() {
        return proficiency;
    }

    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", proficiency=" + proficiency +
                '}';
    }
}

