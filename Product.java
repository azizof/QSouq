package de.azizothman.qsouq.entities;

import com.codename1.ui.Image;
import java.util.ArrayList;

public class Product {

    /**
     * The id of the product ad
     */
    private String id;

    /**
     * the title of the product ad
     */
    private String title;

    /**
     * the category which this product belong to
     */
    private String category_id;

    /**
     * The city in which this product published
     */
    private String city_id;

    /**
     * the price of the product
     */
    private String prise;

    /**
     * the description shows the product in details
     */
    private String description;

    /**
     * the user which published this product ad
     */
    private String user_id;

    /**
     * check if user want to show his phone number or not
     */
    private boolean showPhone;

    private ArrayList<Image> images;
    /**
     * Default constructor
     */
    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public boolean isShowPhone() {
        return showPhone;
    }

    public void setShowPhone(boolean showPhone) {
        this.showPhone = showPhone;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    
}
