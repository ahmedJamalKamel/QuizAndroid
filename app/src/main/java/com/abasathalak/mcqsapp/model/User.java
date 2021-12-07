package com.abasathalak.mcqsapp.model;

public class User {

    public String matchingId, cateId,  langId, authID, userID, isAvail, status, email, name, image, user_id, opponentName, opponentProfile, resut;
    String NameUnv,NameUniL;
    String mobile_number,Country,the_University,the_college,Squad_level;


    public User() {
    }


    public String getNameUnv() {
        return NameUnv;
    }

    public void setNameUnv(String nameUnv) {
        NameUnv = nameUnv;
    }

    public String getNameUniL() {
        return NameUniL;
    }

    public void setNameUniL(String nameUniL) {
        NameUniL = nameUniL;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public String getOpponentProfile() {
        return opponentProfile;
    }

    public void setOpponentProfile(String opponentProfile) {
        this.opponentProfile = opponentProfile;
    }
    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getThe_University() {
        return the_University;
    }

    public void setThe_University(String the_University) {
        this.the_University = the_University;
    }

    public String getThe_college() {
        return the_college;
    }

    public void setThe_college(String the_college) {
        this.the_college = the_college;
    }

    public String getSquad_level() {
        return Squad_level;
    }

    public void setSquad_level(String squad_level) {
        Squad_level = squad_level;
    }

    public String getResut() {
        return resut;
    }

    public void setResut(String resut) {
        this.resut = resut;
    }
    public User(String email, String name, String mobile_number, String country, String the_University, String the_college, String squad_level) {
        this.email = email;
        this.name = name;
        this.mobile_number = mobile_number;
        Country = country;
        this.the_University = the_University;
        this.the_college = the_college;
        Squad_level = squad_level;
    }
    public User(String first_name, String email, String user_id) {
        this.name = first_name;
        this.email = email;
        this.user_id = user_id;
    }

    public User(String userID, String name, String image, String isAvail, String langId, String cateId) {
        this.userID = userID;
        this.name = name;
        this.image = image;
        this.isAvail = isAvail;
        this.langId = langId;
        this.cateId = cateId;



    }

    public String getCateId() {
        return cateId;
    }



    public String getLangId() {
        return langId;
    }

    public String getStatus() {
        return status;
    }

    public String getMatchingId() {
        return matchingId;
    }

    public String getAuthID() {
        return authID;
    }

    public String getUserID() {
        return userID;
    }

    public String getIsAvail() {
        return isAvail;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getUser_id() {
        return user_id;
    }
}