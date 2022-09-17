package io;

import enums.Color;
import enums.Size;

public class Product {
    private String name;
    private Color color;
    private Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Product setColor(Color color) {
        this.color = color;
        return this;
    }

    public Size getSize() {
        return size;
    }

    public Product setSize(Size size) {
        this.size = size;
        return this;
    }
}
