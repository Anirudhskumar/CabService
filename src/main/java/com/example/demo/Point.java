package com.example.demo;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double distance(Point p) {
		return Math.sqrt((p.x - this.x) * (p.x - this.x) +
				(p.y - this.y) * (p.y - this.y));
	}

	public static Point nearestDriver(Point[] points, Point point) {
		Point p = points[0];
		for (int i = 0; i < points.length; i++) {
			if (points[i].distance(point) < p.distance(point)) {
				p = points[i];
			}
		}
		return p;
	}
}