package com.codewithsahil.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="profiles")
public class Profile {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="bio")
    private String bio;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="loyalty_points")
    private Integer loyaltyPoints;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @MapsId
    private User user;

}
