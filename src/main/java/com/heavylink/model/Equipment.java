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
public class Equipment {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idEquipment;

    @ManyToOne // FK
    @JoinColumn(name = "id_owner", nullable = false, foreignKey= @ForeignKey(name="FK_EQUIPMENT_OWNER"))
    private Owner owner;

    @ManyToOne // FK
    @JoinColumn(name = "id_subcategory", nullable = false, foreignKey= @ForeignKey(name="FK_EQUIPMENT_SUBCATEGORY"))
    private Subcategory subcategory;

    @Column(nullable = false, length = 70)
    private String brand;

    @Column(nullable = false, length = 70)
    private String model;

    @Column(nullable = false)
    private String serial_number;

    @Column(nullable = false)
    private String manufacture_year;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Integer num_cylinders;

    @Column(nullable = false)
    private Double weight_kg;

    @Column(nullable = false, length = 70)
    private String certification;

    @Column(nullable = false, length = 70)
    private Double daily_rate;

    @Column(nullable = true, length = 200)
    private String description;

    @Column(nullable = false)
    private boolean status;
}
