#FROM openjdk:17
#WORKDIR /app
#COPY ./target/registry-server.jar .
#EXPOSE 8761
#CMD ["java", "-jar", "registry-server.jar"]
# Sử dụng hình ảnh OpenJDK vừa kéo
FROM openjdk:23-ea-17-jdk

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép tệp JAR vào thư mục làm việc
COPY ./target/registry-server.jar .

# Mở cổng 8761
EXPOSE 8761

# Chạy ứng dụng
CMD ["java", "-jar", "registry-server.jar"]
