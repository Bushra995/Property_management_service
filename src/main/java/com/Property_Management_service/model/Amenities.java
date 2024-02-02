package com.Property_Management_service.model;

import  jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import jakarta.annotation.Nonnull;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Amenities")
public class Amenities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "amen_id")
    private Long amId;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE )
    @JoinColumn(name = "flat_id",referencedColumnName = "id", nullable = false)

    private FlatInfo flatInfo;

    @Column(name="name")
    private String name;

}
