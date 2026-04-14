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
}
