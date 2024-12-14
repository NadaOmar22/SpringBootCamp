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

Bean Scopes Task:
1) Define a new implementation for the Shape interface.
2) Define Draw2d Class and Draw3d class
3) Add new Shapes from Shape like Circle and Square .
4) Use a Draw2d Object and Draw3d Object inside the Circle and Square Classes
5) Reference your new implementation in the Spring config file (applicationContext.xml).
6) Apply the Constructor injection into Circle bean
7) Apply the Setter injection into Square bean
8) Make the bean scope for CircleShape bean as singleton
9) Make the bean scope for CircleShape bean as prototype
10) Retrieve a bean for Circle class and draw the Circle
11) Retrieve a bean for Square class and draw the Rectangle

********************************************************************************************************************************************************************************************************************

Beans Lifecycle Task:

1) Add a new class named DatabaseOperations
2) Create a method named connectToDatabase of type void and print a message inside it “connection to database established ……”
3) Create a method named disconnectFromDatabase of type void and print a message inside it “connection to database closed……”
4) Define a init and destroy beans for the above methods.
5) Test your application by initalize the spring container inside the Main class and close it to see the output of init and destroy methods

Output:
connection to database established ……

connection to database closed……

********************************************************************************************************************************************************************************************************************

Vehicles System 1 Task:
We have a company that need a system to sell a vehicles like (car , plane , motorcycle)
Each one of them will be stored in the database so , we will have operations like saveVehicle.
The configurations of the database like url , username and password will be saved into a properties file.

Requirements:
1) Make a class that will control the database operations and have singleton scope (as we only need one bean through the app)
2) Read the database properties from properties file and link them to fields in the database operations class.
3) Define your models (car , plane , Bike) classes and make the scope of them as prototype (we will need lots of beans of these vehicles)
4) Inject the database operations bean into these models using constructor injection for car and setter injection for plane and field injection for Bike.
5) Make all the configurations inside the app in the java config class (no XML)
6) Make init method inside the database operations class that will connect to the database after the container created
7) Make destroy method inside the database operations class that will close the connection from the database after the container closed
8) Use MySQL to store your data and JDBC [saveVehicle() method ]
9) Use System.out.print methods for debugging purposes (connection established , closed …etc)
10) Use @Getter , @Setter , @ToString from lombok instead of normal setters and getters. See the hints
11) Add methods save , delete , update , searchById , getAllOrdersDetails
12) Define the below tables attached in the hints.

    ![image](https://github.com/user-attachments/assets/82e6ef69-6657-4a19-af4a-914c406ff5dd)

    ![image](https://github.com/user-attachments/assets/4405fc33-0f5e-4b55-8f94-b9ff2c74ad9f)


********************************************************************************************************************************************************************************************************************


