Install redis (on Mac):
```https://medium.com/@petehouston/install-and-config-redis-on-mac-os-x-via-homebrew-eb8df9a4f298```

Using docker redis:
```https://hub.docker.com/_/redis```
```docker run -d  -p 6379:6379 redis```

Finding your docker ip on Mac
```ifconfig```
Most likely the address is: ```192.168.0.12```


Run app from command line:
```mvn clean install -DskipTests && java -jar target/redis-test-0.0.1-SNAPSHOT.jar```

Web ui:
```http://localhost:8080/swagger-ui.html```
