**BuildImage**
docker build -t java-spring2 .
docker run -p 8081:8080 java-spring2

**test**
localhost:8081/order/3