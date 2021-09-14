# About
```dtd
My first spring boot rest API. It is simple api for creating , updating, deleting and showing
quotes. It uses h2 database which is a in memory database i.e data will get deleted once 
application stops
```

# To Run
```dtd
Simply pull/download and run it. 
```

# Api Documentaion

### To create a quote

```dtd
Post request at localhost:8080/api/quote
Data in the request body

{
    quote: String,
    author: String
}


```
### To show all quotes

```dtd
Get request at localhost:8080/api/quotes
Data in response body

{
    id: int,
    quote: String,
    author: String
    publishedOn: Date
}
```

### To show quote by id
```dtd
Get request at localhost:8080/api/quote/{id}
Data in response body
{
        id: int,
        quote: String,
        author: String
        publishedOn: Date
}
```

### To update a quote by id
```dtd
Put request at localhost:8080/api/quote/{id}
Data is request body
{
    quote: String,
    author: String
}
```

### To delete a quote by id
```dtd
Delete request at localhost:8080/api/quote/{id}
Data is response body
If successful : 
    OK
If Unsuccessful:
    Not_Found
```