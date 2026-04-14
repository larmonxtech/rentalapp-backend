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

    private String fullname;
    private String phone;
    private String email;
    private String status;
}
