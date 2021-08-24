package de.azizothman.qsouq.entities;

/**
 *
 */
public class MessageList {

    /**
     * the id of the List
     */
    private String id;

    /**
     * The first user which the messages list betweeen
     */
    private String first_user_id;

    /**
     * The secound user which the messages list betweeen
     */
    private String sec_user_id;

    /**
     * Default constructor
     */
    public MessageList() {
    }

    /**
     * constructor
     *
     * @param id the id of the list od messages between two users
     * @param first_user_id The first user which the messages list betweeen
     * @param sec_user_id The secound user which the messages list betweeen
     */
    public MessageList(String id, String first_user_id, String sec_user_id) {
        this.id = id;
        this.first_user_id = first_user_id;
        this.sec_user_id = sec_user_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_user_id() {
        return first_user_id;
    }

    public void setFirst_user_id(String first_user_id) {
        this.first_user_id = first_user_id;
    }

    public String getSec_user_id() {
        return sec_user_id;
    }

    public void setSec_user_id(String sec_user_id) {
        this.sec_user_id = sec_user_id;
    }

}
