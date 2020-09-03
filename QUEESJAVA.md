# **¿Qué es Java?** 
### *Felipe de Jesus Martinez Salinas 19100211*


## **Introducción.**

**Java** fue diseñado por la compañía *Sun Microsystems Inc*, con el propósito de crear un lenguaje que pudiera funcionar en sistemas de ordenadores heterogéneos, y que fuera independiente de la plataforma en la que se vaya a ejecutar. 
Esto significa que un programa de Java puede ejecutarse en cualquier máquina o plataforma.

Su origen se remonta a la creación de un lenguaje de programación para el desarrollo de aplicaciones para electrodomésticos y otros aparatos electrónicos. 
En septiembre de 1995 aparece el primer Kit de Desarrollo de Java (JDK). A principios de 1997 se presenta la primera revisión de Java (la versión 1.1) y a finales de 1998 surge la versión 1.2 (Java 2) que introdujo modificaciones bastante significativos. En octubre de 2004 se hace pública la versión Java 1.5 (Java 5) incluyendo innovaciones muy importantes en la plataforma.



---

# Características de Java
**Según Sun Microsystems**, Java cuenta con las siguientes características:

- ***Sencillo.*** Elimina la complejidad de los lenguajes como C y da paso al contexto de los lenguajes modernos orientados a objetos. 
- ***Orientado a Objetos.*** La filosofía de programación orientada a objetos es diferente a la programación convencional. 
- ***Independiente*** a la arquitectura y portable. Al compilar un programa en Java, el código resultante es un tipo de código binario conocido como Java bytecodes. Este código es interpretado por diferentes computadoras de igual manera, por lo que únicamente hay que implementar un intérprete para cada plataforma.
- ***Seguro.*** El sistema de Java tiene ciertas políticas que evitan que se puedan codificar virus con este lenguaje. Existen muchas restricciones, especialmente para los denominados applets, que limitan lo que se puede y no puede hacer con los recursos críticos de una computadora.
- ***Multitarea.*** Un lenguaje que soporta múltiples threads, hilos o tareas, es un lenguaje que puede ejecutar diferentes líneas de código al mismo tiempo. 

---

# **¿Cómo crear un programa en Java?**
Con el compilador de Java, el programa fuente con extensión `.java` es traducido a un lenguaje intermedio o pseudo-código (no es código máquina) llamado Java bytecodes generándose un programa compilado almacenado en un archivo con extensión `.class` . Este archivo puede ser posteriormente interpretado y ejecutado por el intérprete de Java (lo que se conoce como la Máquina Virtual Java o Java Virtual Machine). Por eso Java es multi-plataforma, ya que existe un intérprete para cada máquina diferente. Por tanto, la compilación se produce una vez y la interpretación cada vez que el programa se ejecuta. Este proceso se esquematiza en la siguiente figura.

![Image](https://www.arkaitzgarro.com/java/images/cap01/programa-con-java.png)

Actualmente las máquinas virtuales modernas realizan una compilación JIT (Just In Time) en donde el bytecode no es interpretado sino que se compila directamente a código máquina en tiempo de ejecución de acuerdo con la arquitectura (procesador y sistema operativo) en la que se ejecuta la máquina virtual. Esto permite conseguir velocidades de ejecución similares al C. En la práctica las máquinas virtuales suelen utilizar técnicas mixtas de interpretación/compilación JIT normalmente según la frecuencia de paso por un bytecode concreto.

---

# La plataforma Java.

La plataforma **Java** se diferencia de la mayoría de las demás en que está formada únicamente por software que se ejecuta en cualquier otra plataforma independiente de hardware. La plataforma Java tiene dos componentes:

- *El intérprete, Máquina Virtual Java ó Java Virtual Machine (Java VM) que ya se ha comentado anteriormente, y*
- *La Interfaz de Programación de Aplicaciones Java ó Java Application Programming Interface (Java API).*

El API de Java es una amplia colección de componentes de software que facilitan muchas necesidades de programación como puede ser código necesario para construir una interfaz de usuario (GUI).

La siguiente figura esquematiza la relación entre la aplicación o applet de Java, la Máquina Virtual, el API y el hardware correspondiente:

![Image](https://www.arkaitzgarro.com/java/images/cap01/relacion-plataformas.png)
    
---
## Bibliografía
### *https://www.arkaitzgarro.com/java/capitulo-1.html*