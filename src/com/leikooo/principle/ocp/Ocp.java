package com.leikooo.principle.ocp;

/**
 * @author leikooo
 * @create 2023-10-10 15:40
 * @Package com.leikooo.principle.ocp
 * @Description 违反了 ocp 原则，已经使用了的还需要进行修改对应的代码
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
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }


    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形 " + r);
    }


    public void drawCircle(Shape r) {
        System.out.println("绘制圆形 " + r);
    }


    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形 " + r);
    }
}

// 基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}


class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
