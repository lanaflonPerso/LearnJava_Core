package generics.ohranichenia;

import java.awt.*;

interface HasColor { java.awt.Color getColor(); }

class Colored<T extends HasColor> {
    T item;

    Colored(T item) { this.item = item; }

    T getItem() { return item; }

    // The bound allows you to call a method:
    java.awt.Color color() { return item.getColor(); }
}

class Dimension { public int tamanoPequenio, tamanoMediano, tamanoGrande; }

// This won't work -- class must be first, then interfaces:
// class ColoredDimension<T extends HasColor & Dimension> {

// Multiple bounds:
class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    ColoredDimension(T item) { this.item = item; }

    T getItem() { return item; }

    java.awt.Color color() { return item.getColor(); }

    int getTamanoPequenio() { return item.tamanoPequenio; }
    int getTamanoMediano() { return item.tamanoMediano; }
    int getTamanoGrande() { return item.tamanoGrande; }
}

interface Weight { int weight(); }

// As with inheritance, you can have only one
// concrete class but multiple interfaces:
class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    Solid(T item) { this.item = item; }

    T getItem() { return item; }

    java.awt.Color color() { return item.getColor(); }

    int getTamanoPequenio() { return item.tamanoPequenio; }
    int getTamanoMediano() { return item.tamanoMediano; }
    int getTamanoGrande() { return item.tamanoGrande; }
    int weight() { return item.weight(); }
}

class Bounded extends Dimension implements HasColor, Weight {
    private int weight;

    public java.awt.Color getColor() {
        return null;
    }

    public int weight() { return 0; }

}

class R extends Dimension implements HasColor,Weight{
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}

public class BasicBounds {
    public static void main(String[] args) {

        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());

        Solid<R> solid1 = new Solid<>(new R());
        solid.color();
        solid.getTamanoGrande();
        solid.weight();
    }
}
