package models;

public class Postcode {

    private String postcode;
    private String country;
    private String region;
    private String incode;
    private String outcode;
    private String parish;

    public Postcode(String postcode, String country, String region, String incode, String outcode, String parish) {
        this.postcode = postcode;
        this.country = country;
        this.region = region;
        this.incode = incode;
        this.outcode = outcode;
        this.parish = parish;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIncode() {
        return incode;
    }

    public void setIncode(String incode) {
        this.incode = incode;
    }

    public String getOutcode() {
        return outcode;
    }

    public void setOutcode(String outcode) {
        this.outcode = outcode;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }
}
