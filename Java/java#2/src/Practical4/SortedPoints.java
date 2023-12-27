package Practical4;

import java.util.*;

class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x < other.x) {
            return -1;
        } else if (this.x > other.x) {
            return 1;
        } else {
            // If x-coordinates are equal, compare y-coordinates
            if (this.y < other.y) {
                return -1;
            } else if (this.y > other.y) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() < p2.getY()) {
            return -1;
        } else if (p1.getY() > p2.getY()) {
            return 1;
        } else {
            // If y-coordinates are equal, compare x-coordinates
            if (p1.getX() < p2.getX()) {
                return -1;
            } else if (p1.getX() > p2.getX()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

public class SortedPoints {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        // Randomly create 100 points with coordinates between 0.0 and 1.0
        for (int i = 0; i < 100; i++) {
            double x = Math.random();
            double y = Math.random();
            points.add(new Point(x, y));
        }

        // Sort points by x-coordinates
        Collections.sort(points);

        System.out.println("Sorted by X-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }

        // Sort points by y-coordinates using CompareY comparator
        Collections.sort(points, new CompareY());

        System.out.println("\nSorted by Y-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
