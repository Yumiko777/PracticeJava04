// インターフェースの宣言
interface HasGetAreaMethod {
    // このインターフェースを実装するクラスは必ずこのメソッドを持たなくてはいけない
    double getArea();
}

// 抽象クラス。Shapeクラスのインスタンスは生成できない。
abstract class Shape {
    // 抽象メソッド。Shapeクラスのサブクラスはこのメソッドを実装しなくてはいけない
    abstract void draw();   
}

// drawメソッド持つことを約束         getAreaメソッド持つことを約束
class Rectangle extends Shape implements HasGetAreaMethod {
    void draw() {
        System.out.println("□");
    }
    public double getArea() {
        System.out.println("RectangleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Circle extends Shape implements HasGetAreaMethod {
    void draw() {
        System.out.println("○");
    } 
    public double getArea() {
        System.out.println("CircleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Polyline extends Shape {
    void draw() {
        System.out.println("N");
    }
}

class Polygon extends Polyline implements HasGetAreaMethod {
    void draw() {
        System.out.println("凸");
    }
    public double getArea() {
        System.out.println("PolygonクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3];
        // HasGetAreaMethodインターフェースを実装したクラスのインスタンスを代入できる
        closedShapes[0] = new Polygon();
        closedShapes[1] = new Rectangle();
        closedShapes[2] = new Circle();

        for (int i = 0; i < 3; i++) {
            // インスタンスが持つgetAreaメソッドを呼び出す
            closedShapes[i].getArea();
        }
    }  
}
