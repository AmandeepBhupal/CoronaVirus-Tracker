package io.javabrains.coronatracker.models;

public class locationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrev;

    public int getDiffFromPrev() {
        return diffFromPrev;
    }

    public void setDiffFromPrev(int diffFromPrev) {
        this.diffFromPrev = diffFromPrev;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "locationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", diffFromPrev=" + diffFromPrev + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
