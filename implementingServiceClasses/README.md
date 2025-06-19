#Implementing Service classes.

The aim of this project is to implement service classes and to showcase the proper way to carry out dependency injection.
The project has four packages: the repository layer, the service layer, the controller and the model(or entity).
The service layer is built upon the repository layer and the control layer is built upon the service layer.
Whenever an api call is made for example to get all interns registered in the database, it first hit the controller class.
 
Then inside the controller class, the service class in injected into the controller class using @Autowired annotation. This 
annotation is directly played above the class name call written as "private InternService internService". By so doing the constructor for the Interservice will be injected, hence making it available for use by the controller class.
Further more when method inside the InternService class in called in the controller class, The logic that will handle will 
then take you to Interservice class where the method resides for implementation. 
Finally inside the InternService class, InternRepository class is injected using the @Autowired annotation so that data could be retrieved from the database.