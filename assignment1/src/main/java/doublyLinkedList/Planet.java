/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublyLinkedList;

/**
 *
 * @author ADMIN
 */
public class Planet {
    String name;
    double diameter;
    double mass;
    double semiMajorAxis;
    double orbitalPeriod;

    public Planet(String name, double diameter, double mass, double semiMajorAxis, double orbitalPeriod) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.semiMajorAxis = semiMajorAxis;
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public String toString() {
        return name + " | Diameter: " + diameter + " | Mass: " + mass +
               " | Semi-Major Axis: " + semiMajorAxis + " | Orbital Period: " + orbitalPeriod;
    }
}