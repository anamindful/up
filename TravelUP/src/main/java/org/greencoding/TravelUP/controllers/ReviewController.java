package org.greencoding.TravelUP.controllers;

import org.greencoding.TravelUP.models.Review;
import org.greencoding.TravelUP.models.data.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;


@Controller
public class ReviewController {


    @PostMapping("/submitedreview")
    public String handlePostRequest(@RequestParam("locationInput") String location,
                               @RequestParam("picture") MultipartFile picture,
                               @RequestParam("reviewText") String reviewText,
                               @RequestParam("starRatings") int starRatings,
                               Model model) {
        // Create a new Review object
        Review review = new Review();
        review.setLocation(location);
        // Set other properties...

        // Save the Review object to the database

        // Redirect to a confirmation page or home page
        return "redirect:/submitedreview";
    }
}

