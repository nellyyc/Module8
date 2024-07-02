package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    // Constructor
    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) {
            throw new IllegalArgumentException("A senior must have at least 85 credits.");
        }
        this.credits = credits;
    }

    // ToString method to print senior details
    @Override
    public String toString() {
        return "Senior [Name=" + getName() + ", Age=" + getAge() + ", Address=" + getAddress() +
                ", GPA=" + getGpa() + ", Credits=" + credits + "]";
    }
}

