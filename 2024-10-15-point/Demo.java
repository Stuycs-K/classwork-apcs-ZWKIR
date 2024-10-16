public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow(a.getY() - b.getY(), 2)));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p3);
    Point p5 = new Point(p1);

    System.out.println("------------testing toString()------------");
    System.out.println( p3);
    System.out.println(p4);
    System.out.println(p1);
    System.out.println(p5);

    System.out.println("\n------------testing Demo.distance()------------");
    System.out.println( distance(p1,p2));
    System.out.println( distance(p2,p3));
    System.out.println( distance(p1,p3));

    System.out.println("\n------------testing Point.distance()------------");
    System.out.println( Point.distance(p1,p2));
    System.out.println( Point.distance(p2,p3));
    System.out.println( Point.distance(p1,p3));

    System.out.println("\n------------testing nonstatic distanceTo()------------");
    System.out.println( p1.distanceTo(p2));
    System.out.println( p2.distanceTo(p3));
    System.out.println( p1.distanceTo(p3));

    Point t1 = new Point(0, 0);
    Point t2 = new Point(1, 0);
    Point t3 = new Point(0.5, Math.sqrt(3)/2);

    System.out.println("\n------------testing triangle------------");
    System.out.println(t1.distanceTo(t2));
    System.out.println(t1.distanceTo(t3));
    System.out.println(t2.distanceTo(t3));
  }
}
