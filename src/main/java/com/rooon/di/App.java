package com.rooon.di;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        MethodInterceptor handler = new MethodInterceptor() {
            BookService bookService = new BookService();
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("start function");
                Object invoke = method.invoke(bookService, args);
                System.out.println("end function");

                return invoke;
            }


        };

        BookService bookService = (BookService) Enhancer.create(BookService.class, handler);


        Book bible = new Book();
        bible.setName("bible");
        bookService.returnBook(bible);
    }
}
