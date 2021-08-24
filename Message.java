package de.azizothman.qsouq.entities;

public class Message {

    /**
     * The ID of the Message
     */
    public String id;

    /**
     * The body of the Message
     */
    public String text;

    /**
     * The List of Messages which Contain this Message
     */
    public String list_id;

    /**
     * The User who send the Message
     */
    public String user_id;

    /**
     * Default constructor
     */
    public Message() {
    }

    /**
     * constructor
     *
     * @param id
     * @param text
     * @param list_id
     * @param user_id
     */
    public Message(String id, String text, String list_id, String user_id) {
        this.id = id;
        this.text = text;
        this.list_id = list_id;
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getList_id() {
        return list_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}
