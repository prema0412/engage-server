package com.company.engage.Models;

import javax.persistence.*;

@Entity

public class LanguagePreference {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @ManyToOne
    @JoinColumn(name="member_id")

    private Member member;
    private String preferredLanguage;
    private Proficiency proficiency;

    public LanguagePreference() {
    }

    public LanguagePreference(Member member, String preferredLanguage, Proficiency proficiency) {
        this.member = member;
        this.preferredLanguage = preferredLanguage;
        this.proficiency = proficiency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public Proficiency getProficiency() {
        return proficiency;
    }

    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "LanguagePreference{" +
                "id=" + id +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", proficiency=" + proficiency +
                '}';
    }
}
