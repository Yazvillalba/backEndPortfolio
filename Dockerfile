FROM amazoncorretto:17-alpine-jdk  
MAINTAINER yazminvillalba      
COPY target/YazminVillalba-0.0.1-SNAPSHOT.jar yv-app.jar
ENTRYPOINT ["java", "-jar", "/yv-app.jar"]    
