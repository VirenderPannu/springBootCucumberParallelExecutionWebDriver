package com.ea.SpringBasic.libraries;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

// Spring allows us to build our own custom scopes and register them with application context.
// Spring already provides us an implementation of Scope interface which provides us with ThreadLocal -like semantics - the org.springframework.context.support.SimpleThreadScope class. 
// As you might have already guessed, the SimpleThreadScope class maintains it's internal state in the form of a ThreadLocal object
public class DriverScope extends SimpleThreadScope {
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        return super.get(name, objectFactory);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }
}
