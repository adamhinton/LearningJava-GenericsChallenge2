package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var yellowStone = new Park()

    }
}

interface Mappable{
    void render();
}

abstract class Point implements Mappable{
    private double[] location;

    private String location(){
        return "" + location[0] + location[1];
    }

    public Point(double[] location, String name) {
        this.location = location;
    }

    // Don't actually know what this does
    public void render(){
        System.out.println("Render " + this + " as POINT (" + location()+ ")");
    }
}

class Park extends Point{
    private String name;

    public Park(double[] location, String name) {
        super(location, name);
        this.name = name;
    }
}

abstract class Line implements Mappable{
    private double[][] location;

    @Override
    public void render(){
       System.out.println("I'm way too lazy to implement Line render");
    }

    public Line(double[][] location) {
        this.location = location;
    }
}

class River extends Line{
    private String name;

    public River(double[][] location, String name) {
        super(location);
        this.name = name;
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

class Layer <T extends Mappable> {
    private List<T> layerElements = new ArrayList<>();

    public void addElement(T t){
        layerElements.add(t);
    }

    public void addElements(T[] tArray){
        for(var t : tArray){
            layerElements.add(t);
        }
    }

    public void renderLayer(){
        for( var el : layerElements){
            el.render();
        }
    }
}

// Generic class called Layer
    // one type parameter: Only allow Mappable elements
    // A single private field, a list of elements to be mapped
    // method or constructor, or both, to add elements
    // method renderLayer() that loops through all elements and executes    render() on each element



//Main:
    // make inst's of specific classes
    // These get added to a typed Layer, and the renderLayer() method is called on that

// Gen instc:
// Add constr or mtds to support adding a couple adttributes, and location data, to your two specific classes
// Loc data can be a String or set of double values

