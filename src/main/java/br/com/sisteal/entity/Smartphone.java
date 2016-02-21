package br.com.sisteal.entity;

import javax.persistence.Column;

/**
 *
 * @author Nataniel Paiva
 */
public class Smartphone extends Item {

    @Column(name = "MARK")
    private String mark;

    @Column(name = "MODEL")
    private String model;

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

}
