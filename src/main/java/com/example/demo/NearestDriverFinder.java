package com.example.demo;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NearestDriverFinder {

	@GetMapping("/getNearestDriver")
	public ResponseEntity<Point> getNearestPoint(@PathParam("latitude") String latitude, @PathParam("longitude") String longitude){
		Double x = Double.valueOf(latitude);
		Double y = Double.valueOf(longitude);
		Point userLocation = new Point(x, y);
		Point[] points = {};
		Point nearestPoint = Point.nearestDriver(points, userLocation);
		ResponseEntity<Point> nearestResponse = new ResponseEntity(nearestPoint, HttpStatus.OK);
		return nearestResponse;
	}
}
