Why do we need application.yaml file ?

1. It supports heirarichal structure and it is indentation based.

How it is helpful ?

Let say to write db properties: 

![alt text](image.png)

in yaml same will look like:
![alt text](image-1.png)

In a large project we might have been scattered these properties in different places far apart from each other , but in yaml all the similar properties are grouped hierarchially under one block, so it easy to manage all the properties.
Ex:

![alt text](image-2.png)

![alt text](image-3.png)


2. Using yaml file I can do all in single yaml file, All spring profiles are defined in a single file i.e. application.yaml
i.e. we prefer application.yaml over application.properties.

![alt text](image-4.png)

![alt text](image-5.png)

Similar way through cmd line arguments we can tell which to activate 
![alt text](image-6.png)

NOTE: Hierarchy must be maintained in application.yaml

![alt text](image-7.png)

![alt text](image-8.png)