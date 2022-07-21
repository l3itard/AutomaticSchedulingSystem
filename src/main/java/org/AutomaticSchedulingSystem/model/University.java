package org.AutomaticSchedulingSystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer universityId;
    @Column
    private String name;
    @Column
    private int countOfRooms;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "university")
    private List<User> users;

    public University() {
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityId=" + universityId +
                ", name='" + name + '\'' +
                ", countOfRooms=" + countOfRooms +
                ", users=" + users +
                '}';
    }
}
