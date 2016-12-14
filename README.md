# introsde-2016-assignment-3-client

This client calls the server: **https://github.com/DavideLissoni/introsde-2016-assignment-3-server**

## IMPLEMENTATION
The client is divided in the following packages and classes:

* client
  * PeopleClient.java
* introsde.document.ws
  * all the classes generated parsing the **wsdl** of the service
  
The classes was generated executing the following command line, inside the src folder of client:
```sh
wsimport -keep <serverURL>/ws/people?wsdl
```

The client runs each of 10 methods defined in server.
Moreover, it prints into **client-server.log** file the server WSDL url and, for each method, methods name and number, parameters passed and response received in detail.


## DEPLOYMENT

The client can be easily tested copying the repository in local
```sh
git clone https://github.com/DanieleDellagiacoma/introsde-2016-assignment-3-client
```

And execute it
```sh
ant execute.client
```
