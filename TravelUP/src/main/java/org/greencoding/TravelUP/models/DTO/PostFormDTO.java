package org.greencoding.TravelUP.models.DTO;

import org.greencoding.TravelUP.models.User;

public class PostFormDTO {
    private User user;

    private String location;

    private String caption;

//    private String comments;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
