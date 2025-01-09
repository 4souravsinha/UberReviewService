package org.souravsinha4.uberreviewservice.services;

import org.souravsinha4.uberreviewservice.models.Review;
import org.souravsinha4.uberreviewservice.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Review review = Review.builder()
                .rating(4.2D)
                .content("Nice comfy ride")
                .build();
        System.out.println(review);
        reviewRepository.save(review);
    }
}
