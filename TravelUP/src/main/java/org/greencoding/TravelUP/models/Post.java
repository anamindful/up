package org.greencoding.TravelUP.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Posts")
public class Post extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "user_pk")
    private User user;

    private String location;

    private String caption;

//    private double rating;

//    @Lob
//    @Column(name = "image_data")
//    private byte[] imageData;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    public Post () {}


    public Post(User user, String location, String caption, List<Comment> comments) {
//        super(id);
        this.user = user;
        this.location = location;
        this.caption = caption;
//        this.rating = rating;
//        this.imageData = imageData;
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

//    public double getRating() {
//        return rating;
//    }
//
//    public void setRating(double rating) {
//        this.rating = rating;
//    }
//
//    public byte[] getImageData() {
//        return imageData;
//    }
//
//    public void setImageData(byte[] imageData) {
//        this.imageData = imageData;
//    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}