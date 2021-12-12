package com.company.engage.Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Member {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String preferredId;
        private String name;
        private String emailAddress;
        private String contactNumber;
        private String address;
        private String currentLocation;
        private ArrayList<String> imageUrls;
        private ArrayList<String> portfolioUrls;
      //  @OneToMany
       // @JoinColumn(name = "Member_ID")
       // private List<Skill> skills;
        private ArrayList<String> skills;
        private ArrayList<String> interests;
        private AgeGroup ageGroup;   // JUNIOR YOUNGADULT MIDDEL SENIOR
       // @OneToMany(cascade=CascadeType.ALL)
       // @JoinColumn(name = "member_id")
       // private ArrayList<LanguagePreference> languagePreference;
        private ArrayList<String> languagePreference;
        private EngagementPreference engagemnetPreference; // FULLTIME PARTTIME WEEKDAYS WEEKENDS DAILY WEEKLY MONTHLY QUARTERLY YEARLY
        private WorkingOption workingPreference; // REMOTE ONSITE OFFICE
        private Remuneration remunerationPreference; // PAID PROBONO
        private ArrayList<String> locationPreference;
        private Recommendation recommendation;
        private SpecialNeed specialneed; // VISUAL AUDITORY DYSLEXIA AUTISM SPASTIC MR
        private boolean openToCollaborate;
        private Status status; // OPEN ENGAGED DORMANT REPORTED
        private Timestamp registeredOn;

    public Member() {
            Date date = new Date();
            this.registeredOn = new Timestamp(date.getTime());
    }

    public Member(String preferredId, String name, String emailAddress, String contactNumber, String address, String currentLocation, ArrayList<String> imageUrls, ArrayList<String> portfolioUrls, ArrayList<String> skills, ArrayList<String> interests, AgeGroup ageGroup, ArrayList<String> languagePreference, EngagementPreference engagemnetPreference, WorkingOption workingPreference, Remuneration remunerationPreference, ArrayList<String> locationPreference, Recommendation recommendation, SpecialNeed specialneed, boolean openToCollaborate, Status status) {
        this.preferredId = preferredId;
        this.name = name;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.address = address;
        this.currentLocation = currentLocation;
        this.imageUrls = imageUrls;
        this.portfolioUrls = portfolioUrls;
        this.skills = skills;
        this.interests = interests;
        this.ageGroup = ageGroup;
        this.languagePreference = languagePreference;
        this.engagemnetPreference = engagemnetPreference;
        this.workingPreference = workingPreference;
        this.remunerationPreference = remunerationPreference;
        this.locationPreference = locationPreference;
        this.recommendation = recommendation;
        this.specialneed = specialneed;
        this.openToCollaborate = openToCollaborate;
        this.status = status;
        Date date = new Date();
        this.registeredOn = new Timestamp(date.getTime());
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPreferredId() {
        return preferredId;
    }

    public void setPreferredId(String preferredId) {
        this.preferredId = preferredId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public ArrayList<String> getLanguagePreference() {
        return languagePreference;
    }

    public void setLanguagePreference(ArrayList<String> languagePreference) {
        this.languagePreference = languagePreference;
    }

    public EngagementPreference getEngagemnetPreference() {
        return engagemnetPreference;
    }

    public void setEngagemnetPreference(EngagementPreference engagemnetPreference) {
        this.engagemnetPreference = engagemnetPreference;
    }

    public WorkingOption getWorkingPreference() {
        return workingPreference;
    }

    public void setWorkingPreference(WorkingOption workingPreference) {
        this.workingPreference = workingPreference;
    }

    public Remuneration getRemunerationPreference() {
        return remunerationPreference;
    }

    public void setRemunerationPreference(Remuneration remunerationPreference) {
        this.remunerationPreference = remunerationPreference;
    }

    public ArrayList<String> getLocationPreference() {
        return locationPreference;
    }

    public void setLocationPreference(ArrayList<String> locationPreference) {
        this.locationPreference = locationPreference;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    public SpecialNeed getSpecialneed() {
        return specialneed;
    }

    public void setSpecialneed(SpecialNeed specialneed) {
        this.specialneed = specialneed;
    }

    public boolean isOpenToCollaborate() {
        return openToCollaborate;
    }

    public void setOpenToCollaborate(boolean openToCollaborate) {
        this.openToCollaborate = openToCollaborate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(Timestamp registeredOn) {
        this.registeredOn = registeredOn;
    }

    public ArrayList<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ArrayList<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public ArrayList<String> getPortfolioUrls() {
        return portfolioUrls;
    }

    public void setPortfolioUrls(ArrayList<String> portfolioUrls) {
        this.portfolioUrls = portfolioUrls;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", preferredId='" + preferredId + '\'' +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", imageUrls=" + imageUrls +
                ", portfolioUrls=" + portfolioUrls +
                ", skills=" + skills +
                ", interests=" + interests +
                ", ageGroup=" + ageGroup +
                ", languagePreference=" + languagePreference +
                ", engagemnetPreference=" + engagemnetPreference +
                ", workingPreference=" + workingPreference +
                ", remunerationPreference=" + remunerationPreference +
                ", locationPreference=" + locationPreference +
                ", recommendation=" + recommendation +
                ", specialneed=" + specialneed +
                ", openToCollaborate=" + openToCollaborate +
                ", status=" + status +
                ", registeredOn=" + registeredOn +
                '}';
    }
}
