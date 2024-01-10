package org.greencoding.TravelUP.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.greencoding.TravelUP.models.DTO.PostFormDTO;
import org.greencoding.TravelUP.models.Post;
import org.greencoding.TravelUP.models.Review;
import org.greencoding.TravelUP.models.User;
import org.greencoding.TravelUP.models.Users;
import org.greencoding.TravelUP.models.data.PostRepository;
import org.greencoding.TravelUP.models.data.UserRepository;
import org.greencoding.TravelUP.models.data.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    AuthenticationController authenticationController;

    @GetMapping("/reviews")
    public List<Post> getAllReviews(Model model) throws Exception {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return(posts);
    }


    @PostMapping("/addreview")
    public String processReviewForm(@ModelAttribute("postFormDTO")PostFormDTO postFormDTO, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);

        Post post = new Post();
        post.setCaption(postFormDTO.getCaption());
        post.setLocation(postFormDTO.getLocation());
        post.setUser(postFormDTO.getUser());
        postRepository.save(post);
        return "redirect:/reviews";
    }


    @GetMapping("/addreview")
    public String renderAddReviewPage(Model model) {
        model.addAttribute("postFormDTO", new PostFormDTO());
        return "addreview";

    }
}

