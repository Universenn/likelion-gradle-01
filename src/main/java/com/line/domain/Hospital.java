package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;

    private Integer emergencyRoom;
    private String name;
    private String subdivison;

    public String getId() {
        return id;
    }

    public Hospital(String id, String address){
        this.id = id.replaceAll("\"","");
        this.address = address.replaceAll("\"","");
    }

    public Hospital(String id, String address, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivison = subdivison;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getSubdivison() {
        return subdivison;
    }

    public Integer getEmergencyRoom() {
        return emergencyRoom;
    }
}
