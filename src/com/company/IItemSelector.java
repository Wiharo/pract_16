package com.company;


@FunctionalInterface
public interface IItemSelector<E> {

    boolean selectIt(E item);
}