package mini_projects.shop.models;

import mini_projects.shop.enums.Rating;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Review {
    private String comment;
    private String username;
    private LocalDateTime reviewDate;
    private Rating rating;
    private boolean anonymous;

    public Review(String comment, String username, LocalDateTime reviewDate, Rating rating, boolean anonymous) {
        this.comment = comment;
        this.username = username;
        this.reviewDate = reviewDate;
        this.rating = rating;
        this.anonymous = anonymous;
    }

    public String getComment() {
        return comment;
    }

    public String getUsername() {
        return isAnonymous() ? "*******" : username;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    public Rating getRating() {
        return rating;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s - (%s)", rating.getValue(),
                getUsername(), comment, reviewDate);
    }
}









