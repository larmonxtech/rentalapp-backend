package com.heavylink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(EquipmentExamPK.class)
public class EquipmentExam {
    @Id
    //private int idEquipment;
    private Equipment equipment;

    @Id
    //private int idExam;
    private Exam exam;

    /*static class EquipmentExamPK implements Serializable{
        @ManyToOne
        private Equipment equipment;
        @ManyToOne
        private Exam exam;
    }*/
}
