Las mediciones de tiempo se llevaron a cabo usando el método System.nanotime()
Los datos se muestran en nanosegundos.
El siguiente código muestra la forma en la que se midieron los tiempos
~~~java
long startTime = System.nanoTime();

//
// funcion que se medirá su tiempo
//

long elapsedTime = System.nanoTime() - startTime;

System.out.println("Time: " + elapsedTime);
~~~
