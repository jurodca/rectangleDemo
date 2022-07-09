package com.jurodca.rectangleDemo.impl;

import com.jurodca.rectangleDemo.entity.Rectangle;

public class RectangleOperations implements Operations<Rectangle> {

	@Override
	public boolean intersect(Rectangle r1, Rectangle r2) {

		if (r1.getTopLeft().getCoordX() == r1.getBottomRight().getCoordX()
				|| r1.getTopLeft().getCoordY() == r1.getBottomRight().getCoordY()
				|| r2.getTopLeft().getCoordX() == r2.getBottomRight().getCoordX()
				|| r2.getTopLeft().getCoordY() == r2.getBottomRight().getCoordY() ) {
			return false;
		}

		if (r1.getTopLeft().getCoordX() > r2.getBottomRight().getCoordX()
		|| r2.getTopLeft().getCoordX() > r1.getBottomRight().getCoordX()) {
			return false;
		}

		if (r1.getBottomRight().getCoordY() > r2.getTopLeft().getCoordY()
			|| r2.getBottomRight().getCoordY() > r1.getTopLeft().getCoordY()) {
			return false;
		}

		return true;
	}

	@Override
	public boolean contains(Rectangle r1, Rectangle r2) {

		if(intersect(r1, r2)) {
			return false;
		}




		return true;
	}

	@Override
	public boolean adjacency(Rectangle r1, Rectangle r2) {
		return false;
	}
}
