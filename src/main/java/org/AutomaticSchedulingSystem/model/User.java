package org.AutomaticSchedulingSystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer userId;
    @Column
    private String name;
    @Column
    private String surname;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "universityId")
    private University university;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Request> requests;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", university=" + university +
                ", requests=" + requests +
                '}';
    }
}
