Below requirements are implemented in machine tests.


A) Use Spring boot

B) Use Rest controller

C) Need DB configuration (Use RDB instead of in-memory)

D) Use annotation based configuration (Not XML).

E) JPA & Hibernate


1) Category CRUD operation.

 

Below are the APIs required to be developed :

 

1.  http://localhost:8080/api/categories?page=3      GET all the categories

2   http://localhost:8080/api/categories           POST - create a new category

3.  http://localhost:8080/api/categories/{di}        GET category by Id

4.  http://localhost:8080/api/categories/{di}       PUT - update category by id

5. http://localhost:8080/api/categories/{di}       DELETE - Delete category by id


2) Product CRUD operation.

 Below are the APIs required to be developed :

1.   http://localhost:8080/api/products?page=2        GET all the products

2.   http://localhost:8080/api/products             POST - create a new product

3.   http://localhost:8080/api/products/{di}           GET product by Id

4.   http://localhost:8080/api/products/{di}        PUT - update product by id

5.   http://localhost:8080/api/products/{di}        DELETE - Delete product by id


3) Relation between Category-Products should have one-to-many relation. (One category can have multiple products).

4) Machine test should have Server side pagination.

5) While fetching single product details the response should be populated with respective category details.
