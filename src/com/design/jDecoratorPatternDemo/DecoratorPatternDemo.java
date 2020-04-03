package com.design.jDecoratorPatternDemo;

/**
 * 装饰器模式
 *
 * 颜色：红，白，蓝
 * 形状：方，圆，角
 * 可以组合成9种组合，用装饰器模式就是一个很不错的实现方式。
 */

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
class greenShapeDecorator extends ShapeDecorator {

    public greenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
public class DecoratorPatternDemo {
    public static void main(String[] args) {

//        Shape circle = new Circle();
//
//        Shape redCircle = new RedShapeDecorator(new Circle());
//
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//        System.out.println("带正常边框的圆");
//        circle.draw();
//
//        System.out.println("\n红色边框的圆");
//        redCircle.draw();
//
//        System.out.println("\n红色边框的矩形");
//        redRectangle.draw();

    }
}