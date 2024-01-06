package org.greencoding.TravelUP.models;

import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "location")
    private String location;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Column(name = "review_text", length = 2000)
    private String reviewText;

    @Column(name = "star_ratings")
    private int starRatings;

    // Constructors, getters, setters...

    public void setLocation(String location) {
        this.location = location;
    }
}

