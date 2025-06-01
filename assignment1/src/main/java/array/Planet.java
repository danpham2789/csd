/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Admin
 */
public class Planet {
    String name;
    double equatorialDiameter, mass, semiMajorAxis, orbitalPeriod;

    public Planet(String name, double equatorialDiameter, double mass, double semiMajorAxis, double orbitalPeriod) {
        this.name = name;
        this.equatorialDiameter = equatorialDiameter;
        this.mass = mass;
        this.semiMajorAxis = semiMajorAxis;
        this.orbitalPeriod = orbitalPeriod;
    }

    public Planet() {
    }

    @Override
    public String toString() {
        return "name=" + name + ", equatorialDiameter=" + equatorialDiameter + ", mass=" + mass + ", semiMajorAxis=" + semiMajorAxis + ", orbitalPeriod=" + orbitalPeriod;
    }

}
