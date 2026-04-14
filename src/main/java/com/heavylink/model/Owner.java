package com.heavylink.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Owner {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idOwner;

    @ManyToOne // FK
    @JoinColumn(name = "id_user", nullable = false, foreignKey= @ForeignKey(name="FK_OWNER_USER"))
    private User user;

    @Column(nullable = false, length = 10)
    private String document_type;

    @Column(nullable = false, length = 15)
    private String document_number;

    @Column(nullable = false, length = 100)
    private String fullname;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false)
    private String status;
}
