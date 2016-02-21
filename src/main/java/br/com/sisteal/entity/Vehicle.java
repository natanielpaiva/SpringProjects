package br.com.sisteal.entity;

import br.com.sisteal.domain.TypeVehicle;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author Nataniel Paiva
 */
public class Vehicle extends Item {

    @Column(name = "MARK")
    private String mark;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "LICENSE_PLATE")
    private String licesePlate;

    @Column(name = "TYPE_VEHICLE")
    @Enumerated(EnumType.STRING)
    private TypeVehicle typee;

    @Column(name = "YEAR")
    private Integer year;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicesePlate() {
        return licesePlate;
    }

    public void setLicesePlate(String licesePlate) {
        this.licesePlate = licesePlate;
    }

    public TypeVehicle getTypee() {
        return typee;
    }

    public void setTypee(TypeVehicle typee) {
        this.typee = typee;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
