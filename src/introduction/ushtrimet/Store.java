package introduction.ushtrimet;

import java.time.LocalTime;

public class Store {
    private String numriBiznesit;
    private String name;
    private String lokacioni;
    private float siperfaqja;
    private LocalTime openTime;
    private LocalTime closeTime;
    private int numriPunetoreve;

    private String lloji;

    public Store(String numriBiznesit, String name, String lokacioni) {
        this.numriBiznesit = numriBiznesit;
        this.name = name;
        this.lokacioni = lokacioni;
    }

    public Store(String numriBiznesit, String name, String lokacioni,
                 float siperfaqja, LocalTime openTime,
                 LocalTime closeTime, int numriPunetoreve,
                 String lloji) {
        this.numriBiznesit = numriBiznesit;
        this.name = name;
        this.lokacioni = lokacioni;
        this.siperfaqja = siperfaqja;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.numriPunetoreve = numriPunetoreve;
        this.lloji = lloji;
    }

    public String getNumriBiznesit() {
        return numriBiznesit;
    }

    public void setNumriBiznesit(String numriBiznesit) {
        this.numriBiznesit = numriBiznesit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLokacioni() {
        return lokacioni;
    }

    public void setLokacioni(String lokacioni) {
        this.lokacioni = lokacioni;
    }

    public float getSiperfaqja() {
        return siperfaqja;
    }

    public void setSiperfaqja(float siperfaqja) {
        this.siperfaqja = siperfaqja;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public int getNumriPunetoreve() {
        return numriPunetoreve;
    }

    public void setNumriPunetoreve(int numriPunetoreve) {
        this.numriPunetoreve = numriPunetoreve;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    public boolean isOpen() {
        return LocalTime.now().isAfter(openTime) && LocalTime.now().isBefore(closeTime);
    }

    @Override
    public String toString() {
        return "Store{" +
                "numriBiznesit='" + numriBiznesit + '\'' +
                ", name='" + name + '\'' +
                ", lokacioni='" + lokacioni + '\'' +
                ", siperfaqja=" + siperfaqja +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", numriPunetoreve=" + numriPunetoreve +
                ", lloji='" + lloji + '\'' +
                '}';
    }
}







