package com.csulb.constraint.programming.river.crossing.Util;

public interface Queue<E> extends java.util.Queue<E> {
	boolean isEmpty();
	E pop();
	Queue<E> insert(E element);
}