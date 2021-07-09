package com.sword.trailersdb.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CommentModel {

    private @Id @GeneratedValue Long id;

    @Column(nullable = false, length = 250)
    private String text;

    @Column(nullable = false)
    private Long rating;

    @Column(nullable = false)
    private Date datePosted;

    @ManyToOne // set relationship with model
    @JoinColumn(name="user_id", nullable = false)
    private UserModel user;

    // Todo: Finish relationship when Movie model is finished
    // @OneToOne
    // @JoinColumn(name="movie_id", nullable = false)
    // private Movie movie;

    public CommentModel(String text, Long rating, Date datePosted, UserModel user) {
        this.text = text;
        this.rating = rating;
        this.datePosted = datePosted;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", datePosted=" + datePosted +
                ", user=" + user +
                '}';
    }

}