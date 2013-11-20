# Boot Application with Groovy via console
jugsaar5-spring-boot-example0

### Requirements

* Spring Boot CLI
see 
https://github.com/spring-projects/spring-boot/blob/master/README.md#manual-installation
https://github.com/spring-projects/spring-boot/blob/master/README.md#osx-homebrew-installation
https://github.com/spring-projects/spring-boot/blob/master/README.md#installation-with-gvm

* groovy installed

### Quick start with groovy

Open the groovyconsole and type the following code:

```groovy
@RestController
class Application {

    @RequestMapping('/')
    String home() {
        "Hello World"
    }
}
```

Then run the app.groovy from a shell:
```
spring run app.groovy
```

Open http://localhost:8080 in your favorite web browser and you should see the following output:
```
Hello World
```

Since we want the app to reflect code changes we make we restart the spring boot cli 
in "watch-mode".

```
spring run app.groovy --watch
```

When we now refresh our browser we can see that the code changes reflected quite quickly.