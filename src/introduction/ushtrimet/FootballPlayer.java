package introduction.ushtrimet;

import java.time.LocalDate;

public class FootballPlayer {
    private byte number;
    private String name;
    private String lastName;
    private String country;
    private LocalDate birthdate;
    private String position;

    private boolean active = true;
    private String club;
    private float height = 1.70f;
    private float weight = 70.0f;
    private char strongFoot = 'R';
    private byte rating = 50;

    public FootballPlayer(String name, String lastName, String birthdate, String club) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = LocalDate.parse(birthdate);
        this.club = club;
    }

    public FootballPlayer(byte number, String name, String lastName, String country,
                          LocalDate birthdate, String position, boolean active, String club,
                          float height, float weight, char strongFoot, byte rating) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.birthdate = birthdate;
        this.position = position;
        this.active = active;
        this.club = club;
        this.height = height;
        this.weight = weight;
        this.strongFoot = strongFoot;
        this.rating = rating;
    }


    public FootballPlayer(byte number, String name, String lastName) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
    }

    public void setNumber(byte number) {
        if (number >= 0) {
            this.number = number;
        }

    }
    public byte getNumber() {
        return number;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public char getStrongFoot() {
        return strongFoot;
    }

    public void setStrongFoot(char strongFoot) {
        if (strongFoot == 'R' || strongFoot == 'L'|| strongFoot=='r'|| strongFoot=='l'){
            this.strongFoot = strongFoot;
        }

    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", birthdate=" + birthdate +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", club='" + club + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", strongFoot=" + strongFoot +
                ", rating=" + rating +
                '}';
    }
}













