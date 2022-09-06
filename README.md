# **Wynn4j**
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)


## Description

Wynn4j is an easy to use api for ```Java``` that allows you
to either directly access WynnCraft Api Objects by using the built-in methods that 
are provided or using custom requests allowing the user to access all Api-Endpoints

## Usage

To get a new instance of the WynnCraftAPI just use
```java
WynnCraftAPI api = new WynnCraftAPI(debug);
```

To directly get provided objects use the api methods
```java
WynnPlayer player = api.player("Player Name");
WynnItem item = api.item("Item Name", index);
```

If you however want to use more complex filters or want to see Guild and User rankings
You have to access the api via requests which can be found under ```de.jo.wynn.api.requests``` 
and work like this
```java
Response response = api.request(new Request());
```