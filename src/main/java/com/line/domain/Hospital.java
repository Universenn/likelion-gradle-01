package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private String emergencyRoom;
    private String name;
    private String subdivison;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setEmergencyRoom(String emergencyRoom) {
        this.emergencyRoom = emergencyRoom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubdivison(String subdivison) {
        this.subdivison = subdivison;
    }

    public Hospital(String id){
        this.id = id.replaceAll("\"","");
    }

}
