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
public class Subcategory {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idSubcategory;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false, foreignKey= @ForeignKey(name="FK_SUBCATEGORY_CATEGORY"))
    private Category category;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false)
    private boolean status;
}
