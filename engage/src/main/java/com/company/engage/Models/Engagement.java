package com.company.engage.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Engagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String preferredId;
    private ProviderType providerType;
    private String category;
    private EngagementPreference EngagementType; // FULLTIME PARTTIME WEEKDAYS WEEKENDS DAILY WEEKLY MONTHLY QUARTERLY YEARLY
    private String title;
    private String description;
    private ArrayList<String> imageUrls;
    private ArrayList<String> informationUrls;
    private String contactName;
    private String contactEmail;
    private String contactNumber;
    private String contactAddress;
    private String location;
    private String preferredContactMode;
    private Date expectedStartDate;
    private String period;
    private String expectedEndDate;
    private String totalPositions;
    private String openPositions;
    private int teamSize;
    private ArrayList<String> requiredSkills;
    private Proficiency expectedProficiency;
    private AgeGroup ageGroup;
    private ArrayList<String> languagePreference;
    private WorkingOption workingPreference; // REMOTE ONSITE OFFICE
    private Remuneration remunerationPreference; // PAID PROBONO
    private ArrayList<String> locationPreference;
    private Recommendation recommendation;
    private SpecialNeed specialneed; // VISUAL AUDITORY DYSLEXIA AUTISM SPASTIC MR
    private Status status; // OPEN BOOKED CANCELLED REPORTED
    private String additionalInformation;
    private Timestamp createdOn;
    private String createdBY;
    private Timestamp updatedOn;
    private String updatedBy;

    public Engagement() {
        Date date = new Date();
        this.createdOn = new Timestamp(date.getTime());
    }

    public Engagement(String preferredId, ProviderType providerType, String category, EngagementPreference engagementType, String title, String description, ArrayList<String> imageUrls, ArrayList<String> informationUrls, String contactName, String contactEmail, String contactNumber, String contactAddress, String location, String preferredContactMode, Date expectedStartDate, String period, String expectedEndDate, String totalPositions, String openPositions, int teamSize, ArrayList<String> requiredSkills, Proficiency expectedProficiency, AgeGroup ageGroup, ArrayList<String> languagePreference, WorkingOption workingPreference, Remuneration remunerationPreference, ArrayList<String> locationPreference, Recommendation recommendation, SpecialNeed specialneed, Status status, String additionalInformation, String createdBY, String updatedBy) {
        this.preferredId = preferredId;
        this.providerType = providerType;
        this.category = category;
        EngagementType = engagementType;
        this.title = title;
        this.description = description;
        this.imageUrls = imageUrls;
        this.informationUrls = informationUrls;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
        this.location = location;
        this.preferredContactMode = preferredContactMode;
        this.expectedStartDate = expectedStartDate;
        this.period = period;
        this.expectedEndDate = expectedEndDate;
        this.totalPositions = totalPositions;
        this.openPositions = openPositions;
        this.teamSize = teamSize;
        this.requiredSkills = requiredSkills;
        this.expectedProficiency = expectedProficiency;
        this.ageGroup = ageGroup;
        this.languagePreference = languagePreference;
        this.workingPreference = workingPreference;
        this.remunerationPreference = remunerationPreference;
        this.locationPreference = locationPreference;
        this.recommendation = recommendation;
        this.specialneed = specialneed;
        this.status = status;
        this.additionalInformation = additionalInformation;
        Date date = new Date();
        this.createdOn = new Timestamp(date.getTime());
        this.createdBY = createdBY;
        this.updatedBy = updatedBy;
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

    public ProviderType getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EngagementPreference getEngagementType() {
        return EngagementType;
    }

    public void setEngagementType(EngagementPreference engagementType) {
        EngagementType = engagementType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ArrayList<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public ArrayList<String> getInformationUrls() {
        return informationUrls;
    }

    public void setInformationUrls(ArrayList<String> informationUrls) {
        this.informationUrls = informationUrls;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPreferredContactMode() {
        return preferredContactMode;
    }

    public void setPreferredContactMode(String preferredContactMode) {
        this.preferredContactMode = preferredContactMode;
    }

    public Date getExpectedStartDate() {
        return expectedStartDate;
    }

    public void setExpectedStartDate(Date expectedStartDate) {
        this.expectedStartDate = expectedStartDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getExpectedEndDate() {
        return expectedEndDate;
    }

    public void setExpectedEndDate(String expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    public String getTotalPositions() {
        return totalPositions;
    }

    public void setTotalPositions(String totalPositions) {
        this.totalPositions = totalPositions;
    }

    public String getOpenPositions() {
        return openPositions;
    }

    public void setOpenPositions(String openPositions) {
        this.openPositions = openPositions;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public ArrayList<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(ArrayList<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Proficiency getExpectedProficiency() {
        return expectedProficiency;
    }

    public void setExpectedProficiency(Proficiency expectedProficiency) {
        this.expectedProficiency = expectedProficiency;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBY() {
        return createdBY;
    }

    public void setCreatedBY(String createdBY) {
        this.createdBY = createdBY;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "Engagement{" +
                "id=" + id +
                ", preferredId='" + preferredId + '\'' +
                ", providerType='" + providerType + '\'' +
                ", category='" + category + '\'' +
                ", EngagementType='" + EngagementType + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrls=" + imageUrls +
                ", informationUrls=" + informationUrls +
                ", contactName='" + contactName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", location='" + location + '\'' +
                ", preferredContactMode='" + preferredContactMode + '\'' +
                ", expectedStartDate=" + expectedStartDate +
                ", period='" + period + '\'' +
                ", expectedEndDate='" + expectedEndDate + '\'' +
                ", totalPositions='" + totalPositions + '\'' +
                ", openPositions='" + openPositions + '\'' +
                ", teamSize=" + teamSize +
                ", requiredSkills=" + requiredSkills +
                ", expectedProficiency=" + expectedProficiency +
                ", ageGroup=" + ageGroup +
                ", languagePreference=" + languagePreference +
                ", workingPreference=" + workingPreference +
                ", remunerationPreference=" + remunerationPreference +
                ", locationPreference=" + locationPreference +
                ", recommendation=" + recommendation +
                ", specialneed=" + specialneed +
                ", status=" + status +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", createdOn=" + createdOn +
                ", createdBY='" + createdBY + '\'' +
                ", updatedOn=" + updatedOn +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
