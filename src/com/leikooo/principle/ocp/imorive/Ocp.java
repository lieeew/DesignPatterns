package com.leikooo.principle.ocp.imorive;

/**
 * @author leikooo
 * @create 2023-10-10 15:40
 * @Package com.leikooo.principle.ocp
 * @Description
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

/**
 *  用于绘图的类 「使用方」
 */
class GraphicEditor {
    // 集合在一块
    public void drawShape(Shape s) {
        s.draw();
    }
}

// 基类
abstract class Shape {
    int m_type;

    abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}


class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形 ");
    }
}


class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    void draw() {
        System.out.println("绘制三角形 ");
    }
}
