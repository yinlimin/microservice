/**
 * Created by lenovo on 2016/7/11.
 */



def xxx(Class<?>...ccc){
   // bbb=(Class<?>)ccc
    ccc.each { c->
        println  c
    }
}

ccc=new Class[2]
ccc[0]=String.class
ccc[1]=Integer.class

Class<?>[] ddd =new Class[2]

ddd[0] =ccc[0]
ddd[1]=ccc[1]

xxx([String.class,Integer.class].toArray(new Class[0]))
