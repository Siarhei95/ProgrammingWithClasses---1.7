//Описать  класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

package Task7;

public class triangle {
    int a; // первый катет
    int b; // второй катет
    int c; // гипотенуза
    double x; // координаты вершин треугольника x
    double y; // координаты вершин треугольника y
    double S; // площадь
    double P; // периметр

    public triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getP(){
        P = a + b + c;
        return P;
    }
    double getS() {
        int p;
        int x;
        p = (int) (P / 2);
        x = p * (p - a) * (p - b) * (p - c);
        S = Math.sqrt(x);
        return S;
    }
    public triangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public static void main(String[] args) {
        triangle tr = new triangle(7, 8, 4);
        double perimeter;
        double area;
        perimeter = tr.getP();
        area = tr.getS();

        triangle c1 = new triangle(2.0, 1.0);
        triangle c2 = new triangle(3.0, 4.0);
        triangle c3 = new triangle(3.0, 2.0);

        double m1 = (c1.getX() + c2.getX() + c3.getX()) / 3.0;
        double m2 = (c1.getY() + c2.getY() + c3.getY()) / 3.0; //точки пересечения медиан

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + Math.rint(area*100)/100);

        System.out.println("Median Intersection Point: (" + Math.rint(m1*100)/100 + ", " + Math.rint(m2*100)/100 + ")");
    }
}