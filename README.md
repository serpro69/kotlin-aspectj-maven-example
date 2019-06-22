An example project showing that it's possible to do compile-time weaving of Kotlin classes with AspectJ.

### Motivation
I was looking into how to make Kotlin and AspectJ work together for some time.
Looking up things on the web didn't help much as most of the resources focus on Java not Kotlin when it comes to AOP,
and where Kotlin is mentioned people have been mostly saying that it does not work out of the box.

I've tried to make a sample project where I would be able to create an aspect, weave the classes at compile time using
maven as build tool, and verify the results in a test class. This is basically the main objective of this repo.

### Maven plugin for AspectJ
I have tried both [aspectj-maven-plugin](https://www.mojohaus.org/aspectj-maven-plugin/) 
and [jcabi-maven-plugin](https://plugin.jcabi.com/) plugins for aspectj and both worked as expected.

You can do `$ git checkout aspectj-maven-plugin` to see the pom setup for the for the former, or `$ git checkout master`
for the latter.

### Running tests
The project uses maven wrapper hence there's no need to have a local maven installation on your machine.

To execute tests run `$ ./mvnw clean test` (or `$ mvnw.cmd` if you're using Windows command line).
