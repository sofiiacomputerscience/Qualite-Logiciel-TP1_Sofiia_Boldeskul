package isen.library;

public class Person {
    private String name;
    private int years;


    public Person(){
        this.name = "unknown";
        this.years = 22;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getYears(){
        return years;
    }
    public void setYears(int newYears){
        this.years = newYears;
    }
}

