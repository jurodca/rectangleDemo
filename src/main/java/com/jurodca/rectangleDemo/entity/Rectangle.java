package com.jurodca.rectangleDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Rectangle {
	private Point topLeft;
	private Point bottomRight;
}
