package com.design1.aChainPatternDemo;

interface Router{
    void fun(String s);
}
class Router_a implements Router{
    public void fun(String s){
        System.out.println("执行路由a的方法");
    }
}
class Router_b implements Router{
    public void fun(String s){
        System.out.println("执行路由b的方法");
    }
}
class Router_c implements Router{
    public void fun(String s){
        System.out.println("执行路由c的方法");
    }
}
class Router_d implements Router{
    public void fun(String s){
        System.out.println("执行路由d的方法");
    }
}
class Router_master{
    private Router router;
    public Router_master(Router router) {
        this.router=router;
    }
    public Router getRouter(){
        return router;
    }
}
public class MyChainTest {

    public static void main(String[] args){
      String[] routs=new String[]{"a","b","c","d"};
        ;
        for (String rout : routs) {
            switch (rout){
                case "a":
                    Router_master master = new Router_master(new Router_a());
                    master.getRouter().fun(rout);
                    break;
                case "b":
                    new Router_b().fun(rout);
                    break;
                case "c":
                    new Router_c().fun(rout);
                    break;
                case "d":
                    new Router_d().fun(rout);
                    break;
            }
        }
        if (1<=2){
            System.out.println(true);
        }
    }
}
