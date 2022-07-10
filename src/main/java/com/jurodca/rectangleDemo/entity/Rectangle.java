package com.jurodca.rectangleDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Rectangle {
  private Point topLeft;
  private Point bottomRight;
}
