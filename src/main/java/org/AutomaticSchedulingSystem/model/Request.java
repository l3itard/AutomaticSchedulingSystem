package org.AutomaticSchedulingSystem.model;

import javax.persistence.*;

@Entity
@Table
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer requestId;
    @Column
    private int studyGroup;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
    @Column
    private String discipline;
    @Column
    private int numberOfClasses;

    public Request() {
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public int getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(int studyGroup) {
        this.studyGroup = studyGroup;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", studyGroup=" + studyGroup +
                ", user=" + user +
                ", discipline='" + discipline + '\'' +
                ", numberOfClasses=" + numberOfClasses +
                '}';
    }
}
