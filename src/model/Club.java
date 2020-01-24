package model;

import java.util.Scanner;

public class Club {
    private Club[] club;
    private String fullName;
    private String shortName;
    private int count;
    
    final Scanner sc = new Scanner(System.in);

    public Club[] getClub() {
        return club;
    }

    public void setClub(Club[] club) {
        this.club = club;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    
    
}
