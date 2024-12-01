Practice-IOC-Task: Inversion of Control with XML Configuration   
1) Define a new implementation for the Shape interface.
2) Add getArea() method to the interface
3) Add new Shapes from Shape like Circle and Rectangle.
4) Implement the getArea() method for the two shapes.
5) Reference your new implementation in the Spring config file (applicationContext.xml).
6) Retrieve a bean for Circle class and calculate the area of Circle
7) Retrieve a bean for Rectangle class and calculate the area of Rectangle
   
Input:
  3
  
Output:

  the area of the circle = 18.84955592153876
  
  the area of the Square = 9.0

********************************************************************************************************************************************************************************************************************

Practice-DI-Task: Dependency Injection with XML Configuration
1) Define a new implementation for the Shape interface.
2) Define Draw2d Class and Draw3d class
3) Add new Shapes from Shape like Circle and Square .
4) Use a Draw2d Object and Draw3d Object inside the Circle and Square Classes
5) Reference your new implementation in the Spring config file (applicationContext.xml).
6) Apply the Constructor injection into Circle bean
7) Apply the Setter injection into Square bean
8) Retrieve a bean for Circle class and draw the Circle
9) Retrieve a bean for Square class and draw the Rectangle
    
Input:

Output:

  Drawing a 2d for circle
  
  Drawing a 2d for Square

********************************************************************************************************************************************************************************************************************

Practice-DI-2-Task: Dependency Injection with XML Configuration
We have a backend system that store some vehicles with two types (car , plane) . we need to store the brand of each vehicle into the database.  You will take the database properties details (url , username , password) and store them into a properties file.
1) Define a new implementation for the Vehicle interface that contains a method for save data into database
2) Define Car Class and Plane class from Vehicle
3) Define a application.properties file that contains these values
   database.url = jdbc:mysql://localhost:3306/test
   database.username = ahmed
   database.password = MyPassWord123
4) Define a class that will make the database operations
5) Use a DatabaseOperation object inside car class and plane class to store their data into the database
6) Reference your new implementation in the Spring config file (applicationContext.xml).
7) Apply the Constructor injection into Car bean
8) Apply the Setter injection into Plane bean
9) Retrieve a bean for Car class and store the data into the database
10) Retrieve a bean for Plane class and store the data into the database

********************************************************************************************************************************************************************************************************************


