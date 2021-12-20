#Spring Boot Microservice 2 - Transaction Service

#Endpoints

#### 1 - Save Transaction
POST /api/transaction HTTP/1.1
Host: localhost:4444
Content-Type: application/json
Authorization: Basic basic64(username:password)
Content-Length: 43

{
    "userId":1,
    "productId" :365
}

#### 2 - Get Transaction of User
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic basic64(username:password)

#### 3 - Delete Transaction of User

DELETE /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic basic64(username:password)
