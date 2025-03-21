package com.project.Flatmate.Fight.Resolver.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String flatCode;

    private int karmaPoints = 0;
    private int complaintsFiled = 0;
    private int complaintsAgainst = 0;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Complaint> complaints;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFlatCode() {
        return flatCode;
    }

    public void setFlatCode(String flatCode) {
        this.flatCode = flatCode;
    }

    public int getKarmaPoints() {
        return karmaPoints;
    }

    public void setKarmaPoints(int karmaPoints) {
        this.karmaPoints = karmaPoints;
    }

    public int getComplaintsFiled() {
        return complaintsFiled;
    }

    public void setComplaintsFiled(int complaintsFiled) {
        this.complaintsFiled = complaintsFiled;
    }

    public int getComplaintsAgainst() {
        return complaintsAgainst;
    }

    public void setComplaintsAgainst(int complaintsAgainst) {
        this.complaintsAgainst = complaintsAgainst;
    }
}



