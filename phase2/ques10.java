package phase2;

public class ques10 {

    public static void main(String[] args) {
         ques10 q = new ques10();
         q.circleArea(4);
         q.sphereArea(4);

    }

    // 10- Find surface area of sphere

    void sphereArea(int r){
        double area = 4 * 3.14 * r*r;
        System.out.println("Area of Sphere: "+ area);
    }
    
    // 11- Find circumference and area of circle

    void circleArea(int r){
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: "+ area);
    }

}
