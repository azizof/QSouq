package de.azizothman.qsouq.entities;

import com.codename1.io.Externalizable;
import com.codename1.io.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class User implements Externalizable {

    /**
     * the id of the user
     */
    private String id;

    /**
     * the name of the user shows in his page and publicly
     */
    private String name;

    /**
     * the email of the user
     */
    private String email;

    /**
     * the Password of the user
     */
    private String password;

    /**
     * the adresse of the user
     */
    private String adresse;

    /**
     * the phone number of the user
     */
    private String phone;

    /**
     * Default constructor
     */
    public User() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /// This Methods for Register User in the Storage 
    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public void externalize(DataOutputStream out) throws IOException {
        Util.writeUTF(id, out);
        Util.writeUTF(name, out);
        Util.writeUTF(email, out);
        Util.writeUTF(adresse, out);
        Util.writeUTF(phone, out);
    }

    @Override
    public void internalize(int version, DataInputStream in) throws IOException {
        id = Util.readUTF(in);
        name = Util.readUTF(in);
        email = Util.readUTF(in);
        adresse = Util.readUTF(in);
        phone = Util.readUTF(in);
    }

    @Override
    public String getObjectId() {
        return "User";
    }

}
