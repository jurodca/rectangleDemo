package com.jurodca.rectangleDemo.impl;

import com.jurodca.rectangleDemo.entity.Rectangle;

public class RectangleOperations implements Operations<Rectangle> {

  @Override
  public boolean intersect(Rectangle r1, Rectangle r2) {

    if (isAreaEqualToZero(r1, r2)) {
      return false;
    }

    if (r1.getTopLeft().getCoordX() > r2.getBottomRight().getCoordX()
        || r2.getTopLeft().getCoordX() > r1.getBottomRight().getCoordX()) {
      return false;
    }

    return r1.getBottomRight().getCoordY() <= r2.getTopLeft().getCoordY()
        && r2.getBottomRight().getCoordY() <= r1.getTopLeft().getCoordY();
  }

  @Override
  public boolean contains(Rectangle r1, Rectangle r2) {

    if (isAreaEqualToZero(r1, r2)) {
      return false;
    }

    if (r1.getTopLeft().getCoordY() < r2.getTopLeft().getCoordY()
        || r1.getTopLeft().getCoordX() > r2.getTopLeft().getCoordX()) {
      return false;
    }

    return r1.getBottomRight().getCoordX() >= r2.getBottomRight().getCoordX()
        && r1.getBottomRight().getCoordY() <= r2.getBottomRight().getCoordY();
  }

  @Override
  public boolean isAdjacentTo(Rectangle r1, Rectangle r2) {

    if (isAreaEqualToZero(r1, r2)) {
      return false;
    }

    if (analyzeSubline(r1, r2)) {
      return true;
    }

    if (analyzeProper(r1, r2)) {
      return true;
    }

    return analyzePartial(r1, r2);
  }

  private boolean analyzePartial(Rectangle r1, Rectangle r2) {

    if (r2.getTopLeft().getCoordY() > r1.getTopLeft().getCoordY()
        && r2.getTopLeft().getCoordX() == r1.getBottomRight().getCoordX()
        && r2.getBottomRight().getCoordY() > r1.getBottomRight().getCoordY()) {
      return true;
    }

    return r2.getTopLeft().getCoordY() < r1.getTopLeft().getCoordY()
        && r2.getTopLeft().getCoordX() == r1.getBottomRight().getCoordX()
        && r2.getBottomRight().getCoordY() <= r1.getBottomRight().getCoordY();
  }

  private boolean analyzeProper(Rectangle r1, Rectangle r2) {
    return r2.getTopLeft().getCoordY() == r1.getTopLeft().getCoordY()
        && r2.getBottomRight().getCoordY() == r1.getBottomRight().getCoordY();
  }

  private boolean analyzeSubline(Rectangle r1, Rectangle r2) {
    return r2.getTopLeft().getCoordY() < r1.getTopLeft().getCoordY()
        && r2.getBottomRight().getCoordY() > r1.getBottomRight().getCoordY();
  }

  private boolean isAreaEqualToZero(Rectangle r1, Rectangle r2) {
    return r1.getTopLeft().getCoordX() == r1.getBottomRight().getCoordX()
        || r1.getTopLeft().getCoordY() == r1.getBottomRight().getCoordY()
        || r2.getTopLeft().getCoordX() == r2.getBottomRight().getCoordX()
        || r2.getTopLeft().getCoordY() == r2.getBottomRight().getCoordY();
  }
}
