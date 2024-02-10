E-commerce Product Catalog




## Objective
Develop a Java Application for Managing the product by their Categories.
## Entities
Product
>Fields:Id, Name, Price
>Realtionships: ManyToOne with Category

Category
>Fields:id, Name
>Realtionships: OneToMany with Product
## API Reference

1. Add a Category
• Endpoint : Post/Category   
• RequestBody :
```http
 {
 "categ_id":0,
 "categ_name":"Mobile"
 }
```
Response:
```http
 {
    "categ_id": 1,
    "categ_name": "Laptop",
    "products": null
}
```

2. Add a Product
• Endpoint : Post/Ecommerce        
• RequestBody :
```http
{ 
    "prod_name":"HP",
    "prod_price":10000,
    "category":{
        "categ_id":1
        }
}
```
Response:
```http
{
    "category": {
        "categ_id": 1,
        "categ_name": null,
        "products": null
    },
    "prod_id": 1,
    "prod_name": "HP",
    "prod_price": 10000.0
} 

```
3. Get all  Category
• Endpoint: Get/Category       

Response:
```http
 [
    {
        "categ_id": 1,
        "categ_name": "Laptop",
        "products": [
            {
                "prod_id": 1,
                "prod_price": 10000.0,
                "prod_name": "HP"
            }
        ]
    },
    {
        "categ_id": 2,
        "categ_name": "Mobile",
        "products": [
            {
                "prod_id": 2,
                "prod_price": 10000.0,
                "prod_name": "realme"
            }
        ]
    }
]
```
4. Add a products
• Endpoint: post/Ecommerce       

Response:
```http
 [
    {
        "prod_id": 1,
        "prod_price": 10000.0,
        "prod_name": "HP"
    },
    {
        "prod_id": 2,
        "prod_price": 10000.0,
        "prod_name": "realme"
    }
]
```
5. Update Products 
• Endpoint: post/Ecommerce/{id}    
• RequestBody:
```http
 {
    "prod_price":1000,
    "prod_name":"oppo"
}
```
Response:
```http
 {
    "prod_id": 2,
    "prod_price": 1000.0,
    "prod_name": "oppo"
}
```
6. Delete a product
• Endpoint: post/Ecommerce/{id}     

Response:
```http
 []  
```
7. Delete a Category
• Endpoint: post/Category/{id}     

Response:
```http
 []  
```



## Setup
1. Dependencies:

List any dependencies and how to install them.

2. Project Structure:

Briefly explain the project structure.
## How to Run

Provide instructions on how to run the application locally.
## API Documentation

For detailed API documentation, refer to API_DOCUMENTATION.md



## Postman Collection

Test the API using the provided Postman Collection.

Feel free to reach out if you have any questions or issues!
## 🔗 Links
API_DOCUMENTATION.md 

Postman Collection

