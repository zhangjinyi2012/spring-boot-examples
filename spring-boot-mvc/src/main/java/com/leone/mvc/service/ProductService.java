package com.leone.mvc.service;

/**
 * @author leone
 * @since 2018-06-29
 **/
//@CustomerAnno(value = "product")
public class ProductService {

    public void init() {
        System.out.println("@Bean-init-method-在构造函数执行完之后执行");
    }

    public ProductService() {
        System.out.println("初始化构造函数-ProductService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method-在bean销毁之前执行");
    }

}
