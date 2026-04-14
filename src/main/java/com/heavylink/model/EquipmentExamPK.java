package com.heavylink.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class EquipmentExamPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "id_equipment", nullable = false, foreignKey= @ForeignKey(name="FK_EQUIPMENTEXAM_EQUIPMENT"))
    private Equipment equipment;

    @ManyToOne
    @JoinColumn(name = "id_exam", nullable = false, foreignKey= @ForeignKey(name="FK_EQUIPMENTEXAM_EXAM"))
    private Exam exam;
}
