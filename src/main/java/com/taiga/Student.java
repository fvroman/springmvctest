package com.taiga;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName = "YOUR FIRST NAME";
    private String lastName = "YOUR LASTNAME";
    private String country = "UNKNOWN";
    private LinkedHashMap<String, String> countryOptions;
    private List<String> operatingSystems;
    public Student() {
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("US", "United States");

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;

    }
}
