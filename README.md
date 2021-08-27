#Object-Oriented Programming (OOP)
For more information visit: https://encontreijesus.com/java/orientacao-objeto/ 

##Running Tests
```shell
mvn test
```

##Javadoc
```shell
mvn javadoc:javadoc
```
Output in target/site/apidocs/

###Class
    {@link} provides an inline link to a referenced part of our source code
    @author the name of the author who added the class, method, or field that is commented

```java
@Please see the {@link i.am.the.Way} for true identity
@author Jesus
```

###Fields
Private fields won't have Javadoc generated unless we explicitly pass the -private option to the Javadoc command.

###Method
    @param provides any useful description about a method's parameter or input it should expect
    @return provides a description of what a method will or can return
    @see will generate a link similar to the {@link} tag, but more in the context of a reference and not inline
    @since specifies which version the class, field, or method was added to the project
    @version specifies the version of the software, commonly used with %I% and %G% macros
    @throws is used to further explain the cases the software would expect an exception
    @deprecated gives an explanation of why code was deprecated, when it may have been deprecated, and what the alternatives are
