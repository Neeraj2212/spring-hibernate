package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions, osOptions, languageOptions;

    private String languageUsed;
    private String[] osKnown;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        osOptions = new LinkedHashMap<>();
        languageOptions = new LinkedHashMap<>();

        countryOptions.put("IN", "India");
        countryOptions.put("BR", "Brazil");
        countryOptions.put("GE", "Germany");
        countryOptions.put("USA", "United States of America");

        osOptions.put("Linux", "Linux");
        osOptions.put("Windows", "Windows");
        osOptions.put("MacOs", "MacOs");

        languageOptions.put("C++", "C++");
        languageOptions.put("Python", "Python");
        languageOptions.put("Ruby", "Ruby");
        languageOptions.put("Java", "Java");

    }

    public String getLanguageUsed() {
        return languageUsed;
    }

    public void setLanguageUsed(String languageUsed) {
        this.languageUsed = languageUsed;
    }

    public String[] getOsKnown() {
        return osKnown;
    }

    public void setOsKnown(String[] osKnown) {
        this.osKnown = osKnown;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getOsOptions() {
        return osOptions;
    }

    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }
}
