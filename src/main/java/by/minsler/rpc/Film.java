package by.minsler.rpc;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 12:11 PM
 */
public class Film {

    private String country;
    private String name;

    public Film() {
    }

    public Film(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}