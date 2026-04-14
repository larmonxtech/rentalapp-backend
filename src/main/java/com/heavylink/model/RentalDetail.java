package com.heavylink.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RentalDetail {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idRentalDetail;

    @ManyToOne // FK
    @JoinColumn(name = "id_equipment", nullable = false, foreignKey= @ForeignKey(name="FK_DETAIL_EQUIPMENT"))
    private Equipment equipment;

    @ManyToOne // FK
    @JoinColumn(name = "id_rental", nullable = false, foreignKey= @ForeignKey(name="FK_DETAIl_RENTAL"))
    private Rental rental;

    @Column(nullable = false)
    private Integer rental_days;

    @Column(nullable = false)
    private Double daily_rate;

    @Column(nullable = false)
    private Double subtotal;

    @Column(nullable = false)
    private String delivery_address;

    @Column(nullable = false, length = 50)
    private String return_condition;

    @Column(nullable = true)
    private String observations;
}
