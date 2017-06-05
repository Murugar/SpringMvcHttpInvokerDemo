package com.iqmsoft.spring.httpinvoker.interfaces;

import java.io.Serializable;


public interface SimpleService extends Serializable {
   String sayHelloTo(String name);
   String sayWelcomeTo(String name);
}
