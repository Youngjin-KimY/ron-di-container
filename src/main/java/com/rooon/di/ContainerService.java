package com.rooon.di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

public class ContainerService {
    private static final HashMap<String, Object> containerContext = new HashMap<String, Object>();

    public static <T> T getObject(Class<T> classType) {

        T instance;

        if (containerContext.containsKey(classType.getName())) {
            Object singleton = containerContext.get(classType.getName());
            try {
                instance = (T) singleton;
            } catch (Exception e) {
                throw new RuntimeException("casting fail");
            }


        } else {
            instance = createInstance(classType);
            Arrays.stream(classType.getDeclaredFields()).forEach(
                    f -> {
                        if(f.getAnnotation(Inject.class) != null){
                            Inject annotation = f.getAnnotation(Inject.class);
                            Object field = null;

                            if(annotation.Status().equals("SINGLETON")){
                                System.out.println("SINGLETON");
                                Object cachedField = containerContext.get(f.getName());
                                if(cachedField != null)
                                    field = cachedField;
                                else {
                                    field = createInstance(f.getType());
                                    containerContext.put(f.getName(), field);
                                }
                            } else {
                                System.out.println("NOT_SINGLETON");
                                field = createInstance(f.getType());
                            }

                            f.setAccessible(true);

                            try {
                                f.set(instance, field);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
            );
        }

        return instance;
    }

    private static <T> T createInstance(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
