//Inheritance: Multi-Level Class Hierarchy code is here:

package javaapplication1;

class Box {
    private double width;
    private double height;
    private double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double volume() {
        return width * height * depth;
    }
}

// Adding the weight variable to the Box class:
class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

public class JavaApplication1 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(myBox1);
        BoxWeight myBoxWeight1 = new BoxWeight(5, 6, 7, 34.5);
        BoxWeight myBoxWeight2 = new BoxWeight(myBoxWeight1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myBoxWeight1.volume();
        System.out.println("Volume of myBoxWeight1 is " + vol);
        System.out.println("Weight of myBoxWeight1 is " + myBoxWeight1.weight);

        vol = myBoxWeight2.volume();
        System.out.println("Volume of myBoxWeight2 is " + vol);
        System.out.println("Weight of myBoxWeight2 is " + myBoxWeight2.weight);
    }
}

/*After run the code answer is:
Volume of myBox1 is 3000.0
Volume of myBox2 is 3000.0
Volume of myBoxWeight1 is 210.0
Weight of myBoxWeight1 is 34.5
Volume of myBoxWeight2 is 210.0
Weight of myBoxWeight2 is 34.5*/
