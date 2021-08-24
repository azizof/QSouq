package de.azizothman.qsouq.entities;

public class Category {

    /**
     * The Id of the category
     */
    private String id;
    /**
     * The name of the category
     */
    private String name;

    /**
     * Default constructor
     */
    public Category() {
    }

    /**
     * constructor
     *
     * @param id the id of the category
     * @param name the name of the category
     */
    public Category(String id, String name) {
        this.id = id;
        this.name = name;
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

}
