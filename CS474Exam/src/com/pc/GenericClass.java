package com.pc;

public final class GenericClass<T> {
    T Object;

    GenericClass(T obj)
    {
        this.Object = obj;
    }


    public T getObject()
    {
        return this.Object;
    }
}
