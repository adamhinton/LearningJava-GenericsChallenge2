package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

interface Mappable{
    void render();
}

class Point implements Mappable{
    private double[] location;
    private String name;

    private String location(){
        return "" + location[0] + location[1];
    }

    public Point(double[] location, String name) {
        this.location = location;
        this.name = name;
    }

    // Don't actually know what this does
    public void render(){

    }
}

class Park extends Point{
    String parentService;

    public Park(double[] location, String name, String parentService) {
        super(location, name);
        this.parentService = parentService;
    }
}

class Line implements Mappable{
    private double[][] location;
    private String name;

    @Override
    public void render() {

    }

    public Line(double[][] location, String name) {
        this.location = location;
        this.name = name;
    }
}

class River extends Line{
    private int depth;

    public River(double[][] location, String name, int depth) {
        super(location, name);
        this.depth = depth;
    }
}

// Mappable interface
    // one abst mtd: render

// two classes impl Mappable:

// class Point impl Mpbl
    // two specific classes that extend this
        // mappable item of interest

// Park point, River line

// class Line impl Mpbl
    // two specific classes that extend this
        // mappable item of interest

// Generic class called Layer
    // one type parameter: Only allow Mappable elements
    // A single private field, a list of elements to be mapped
    // method or constructor, or both, to add elements
    // method renderLayer() that loops through all elements and executes    render() on each element

class Layer <T extends Mappable> {
    private List<T> elementList = new ArrayList<T>();

    public List<T> getElementList() {
        return elementList;
    }

    public void addELement(T element){
        elementList.add(element);
    }
}

//Main:
    // make inst's of specific classes
    // These get added to a typed Layer, and the renderLayer() method is called on that

// Gen instc:
// Add constr or mtds to support adding a couple adttributes, and location data, to your two specific classes
// Loc data can be a String or set of double values

