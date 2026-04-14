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
public class Company {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idCompany;

    // JPQL Java Persistence Query Language
    @ManyToOne // FK
    @JoinColumn(name = "id_user", nullable = false, foreignKey= @ForeignKey(name="FK_COMPANY_USER"))
    private User user;

    @Column(nullable = false, length = 10)
    private String ruc;

    @Column(nullable = false, length = 100)
    private String businessName;

    @Column(nullable = false, length = 70)
    private String sector;

    @Column(nullable = false, length = 100)
    private String contact_name;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 200)
    private String address;

    @Column(nullable = false)
    private boolean status;

}
