# spring-boot-microservices

List of API

1. http://localhost:7070/product/getProductByCategory/1001 ---->product-service---->product-category-service----> product-detail-service
2. http://localhost:7071/category/getListOfProductByCatId/1001----> product-category-service----> product-detail-service--->product-price-service
3. http://localhost:7072/detail/getProductsByCatNo/1001 ----> product-detail-service---->product-price-service
4. http://localhost:7073/price/getPrice/1001 ---->product-price-service
5. http://localhost:8761/ - Eureka-discovery-server
