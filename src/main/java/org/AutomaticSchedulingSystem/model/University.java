package org.AutomaticSchedulingSystem.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer universityId;
    private String name;
    private int countOfRooms;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "university")
    private Set<User> users = new HashSet<>();

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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
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
