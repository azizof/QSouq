package de.azizothman.qsouq.entities;

/**
 *
 * @author Azizo
 */
public class City {

    /**
     * The if of the city (Place)
     */
    private String id;
    /**
     * The name of the city (Place)
     */
    private String name;
    /**
     * The latitude of the city (Place)
     */
    private String lat;
    /**
     * The longitude of the city (Place)
     */
    private String lon;

    /**
     * Default constructor
     */
    public City() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

}
