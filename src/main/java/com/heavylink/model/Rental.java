package com.heavylink.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Rental {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idRental;

    @ManyToOne // FK
    @JoinColumn(name = "id_company", nullable = false, foreignKey= @ForeignKey(name="FK_RENTALCOMPANY"))
    private Company company;

    @ManyToOne // FK
    @JoinColumn(name = "id_user", nullable = false, foreignKey= @ForeignKey(name="FK_RENTAL_USER"))
    private User user;

    @Column(nullable = false, length = 10)
    private String rental_code;

    @Column(nullable = false)
    private LocalDateTime start_date;

    @Column(nullable = false)
    private LocalDateTime end_date;

    @Column(nullable = false)
    private Integer rental_days;

    @Column(nullable = false, length = 200)
    private String project_name;

    @Column(nullable = false, length = 200)
    private String project_location;

    @Column(nullable = false)
    private Double subtotal;

    @Column(nullable = false)
    private Double tax;

    @Column(nullable = false)
    private Double total;

    @Column(nullable = false)
    private Integer payment_status;

    @Column(nullable = false)
    private boolean contact_status;

    @Column(nullable = true)
    private String notes;

    // Relación lógica para mandar los datos del detalle
    @OneToMany(mappedBy = "rental", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RentalDetail> details;
}
