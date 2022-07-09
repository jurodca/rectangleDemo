package com.jurodca.rectangleDemo;

import com.jurodca.rectangleDemo.entity.Point;
import com.jurodca.rectangleDemo.entity.Rectangle;
import com.jurodca.rectangleDemo.impl.Operations;
import com.jurodca.rectangleDemo.impl.RectangleOperations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class RectangleOperationsTest {

	@Test
	public void when_Two_Rectangles_Intersect_On_The_Right_Side() {
		Rectangle r1 = new Rectangle(new Point(0,10), new Point(10,0));
		Rectangle r2 = new Rectangle(new Point(5,5), new Point(15,0));

		Operations<Rectangle> operations = new RectangleOperations();
		assertTrue(operations.intersect(r1,r2));
	}

	@Test
	public void when_Two_Rectangles_Intersect_In_The_Up_Side() {
		Rectangle r1 = new Rectangle(new Point(0,10), new Point(10,0));
		Rectangle r2 = new Rectangle(new Point(3,15), new Point(8,8));

		Operations<Rectangle> operations = new RectangleOperations();
		assertTrue(operations.intersect(r1,r2));
	}

	@Test
	public void when_Two_Rectangles_Intersect_In_The_Down_Side() {
		Rectangle r1 = new Rectangle(new Point(0,10), new Point(10,0));
		Rectangle r2 = new Rectangle(new Point(5,5), new Point(9,-2));

		Operations<Rectangle> operations = new RectangleOperations();
		assertTrue(operations.intersect(r1,r2));
	}

	@Test
	public void when_Two_Rectangles_Not_Intersect() {
		Rectangle r1 = new Rectangle(new Point(0,10), new Point(10,0));
		Rectangle r2 = new Rectangle(new Point(11,10), new Point(15,0));

		Operations<Rectangle> operations = new RectangleOperations();
		assertFalse(operations.intersect(r1,r2));
	}

	@Test
	public void when_RectangleR1_Contains_RectangleR2() {
		Rectangle r1 = new Rectangle(new Point(0,10), new Point(10,0));
		Rectangle r2 = new Rectangle(new Point(2,5), new Point(5,1));

		Operations<Rectangle> operations = new RectangleOperations();
		assertTrue(operations.contains(r1, r2));
	}

	@Test
	public void when_RectangleR1_Not_Contains_RectangleR2() {
		Rectangle r1 = new Rectangle(new Point(0,10), new Point(10,0));
		Rectangle r2 = new Rectangle(new Point(11,10), new Point(15,0));

		Operations<Rectangle> operations = new RectangleOperations();
		assertFalse(operations.contains(r1, r2));
	}

}

