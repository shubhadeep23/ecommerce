# ecommerce
POST-http://localhost:8080/ecommerce/v1/users


Description-Create New User
Body-
{
    "name":"Name",
    "phoneNumber":12234444,
    "emailId":"email@de.com",
    "birthDate":"xxxx-yy-zz"
}

POST-http://localhost:8080/ecommerce/v1/users/20/address
Description-Add address for exsiting User
Body-
{
    "userId":2,
    "type":"Office Address",
    "addressDetails":"address"
}
GET-http://localhost:8080/ecommerce/v1/users
Description- Get all users profile with address
Response-
[
    {
        "id": 1,
        "name": "tu",
        "birthDate": "1990-06-23T00:00:00.000+00:00",
        "address": [
            {
                "id": 2,
                "type": "Office Address",
                "addressDetails": "Flat-103: Sai Balaji Lakew View Apartment,Hyderabad"
            }
        ],
        "phoneNumber": 8465887108,
        "emailId": "shubhadeep.chaudhuri99@gmail.com"
    }
]
