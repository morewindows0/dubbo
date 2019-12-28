package org.apache.dubbo.demo.provider;

/**
 * @author: dengxin.chen
 * @date: 2019-12-28 21:23
 * @description:
 */
public class WrapperProxy {
    
    // JavassistProxyFactory.getInvoker中生成的代理对象
    /*
    public Object invokeMethod(Object o, String n, Class[] p, Object[] v)
            throws java.lang.reflect.InvocationTargetException {
        
        org.apache.dubbo.demo.DemoService w;
        try {
            w = ((org.apache.dubbo.demo.DemoService) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            if ("sayHello".equals($2) && $3.length == 1) {
                return ($w) w.sayHello((java.lang.String) $4[0]);
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class org.apache.dubbo.demo.DemoService.");
    }
    
    }
    */
}
