package th.in.pnnutkung.wongnorg.model;

/**
 * Created by Pipatpol on 2559-05-13.
 */
public class Restaurant {
    private String name;
    private String cuisine;
    private float star;
    private String call;
    private String about;

    public Restaurant(String name, String cuisine, float star, String call, String about){
        this.name = name;
        this.cuisine = cuisine;
        this.star = star;
        this.call = call;
        this.about = about;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getName() {

        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public float getStar() {
        return star;
    }

    public String getCall() {
        return call;
    }

    public String getAbout() {
        return about;
    }
}
