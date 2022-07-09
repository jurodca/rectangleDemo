package com.jurodca.rectangleDemo.impl;

public interface Operations<T> {
	boolean intersect(T r1, T r2);
	boolean contains(T r1, T r2);
	boolean isAdjacentTo(T r1, T r2);
}

