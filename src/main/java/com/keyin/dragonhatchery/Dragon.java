package com.keyin.dragonhatchery;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dragon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dragonId;
    private String name;
    private String color;
    private String element;
    private int age;

    public Dragon() {
    }

    public Dragon(String name, String color, String element, int age) {
        this.name = name;
        this.color = color;
        this.element = element;
        this.age = age;
    }

    public Dragon(Long dragonId, String name, String color, String element, int age) {
        this.dragonId = dragonId;
        this.name = name;
        this.color = color;
        this.element = element;
        this.age = age;
    }

    public Long getDragonId() {
        return dragonId;
    }

    public void setDragonId(Long dragonId) {
        this.dragonId = dragonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
