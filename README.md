# PHARMA STORE MANAGEMENT APPLICATION 

### Purpose of the project
PharmaStore is a web based application.The main purpose of this project is to focus on real-life application scenarios. The agenda would be to build an application and implement the pharmacy inventory features. 

### Scope: <br> 
Pharma Store Management System for Medicines inventory is a web-based application that allows the admin to handle all the activities online quickly.
So, the aim of the project is to check and keep track of products. The Admin can view the products from the list and track the list of medicines which are in stock. once stock of the products are available, Admin who is responsible to maintain the products will update the number of stock and expiration date of the item. when the medicines are out of stock, admin can delete the medicines that are out of stock

### Technology Stack:  
**Spring Boot:** For rapid development of the application with minimal configuration. <br>
**Spring Data JPA:** For object-relational mapping (ORM) and database interactions. <br>
**Spring MVC:** To implement the Model-View-Controller architecture. <br> 
**JSP and JSTL:** As the template engine for server-side rendering. <br>
**MySQL:** As the relational database to store and manage data. <br>
**HTML:** To define the frontend elements. <br>
**Bootstrap and CSS:** For Styling. <br> 
**Server:** Tomcat(For localhost deployment). <br> 
**Swagger-UI:** <br> 

these are the modules used in the pharma-store-management-system

### Used Tool and Technologies:
## Front-End: JSP, Html, CSS. 
Pharma store Management System uses HTML to develop the web elements and CSS to style these elements. It uses JSP to manage the response that is coming from the server side.

## Server-side: Servlet, Spring MVC.
PMS is using Servet and Spring MVC to manage the server-side programming also it will handle the request and responses.

## Back-end: MYSQL, Hibernate.
MYSQL is a database and hibernate is an ORM tool that helps to perform transactions with the database.
Server: Tomcat.
Its a web application and uses a tomcat server to deploy and run the application

## Features and functions of project

### Admin module
Admin is the main role in the overall system. Admin can log in into the system using credential where admin credential was already stored in the database.
After successful login into the admin dashboard, there are various operations that the admin can do mentioned below –

* View medicines: Admin is able to view the list of medicines which are already registered into the system. medicines data is stored in a database so the admin can fetch those data to view the list of medicines
* Add medicine : Admin can add medicines by giving name, company and batch in which it belongs also admin is able to delete it from the system
* View updated medicines: Admin can view the list of medicines which is added to the list after updating

### Admin management :
Easily add, update, and delete Medicines information.Efficiently manage your medicine database and Keep track of your supply items, including stock levels and pricing. Effectively manage your stock to optimize supply chain operations.

### User Authentication :
Implement secure login and authentication for admin. Protect sensitive information and control access to different parts of the application.

### Thymeleaf Templates
Utilize Thymeleaf for dynamic HTML templates. Create interactive and user-friendly web pages with server-side rendering.

### Database Integration
Integrated with MySQL for data storage. Ensure reliable and scalable data management to support your application's functionality.

### Technologies Used
Spring Boot: Backend framework for building Java-based web applications.
Thymeleaf: Server-side Java template engine for dynamic HTML generation.
MySQL: Relational database management system for data storage.

### About This Project
```
 you can add new products 
 update the products if there is any new stock available for that product 
 check the stocks availability and expiration date for the available medicines in our pharmastore 
 you can delete the product if its out of stock
```
# User Interface

## Admin Home page:



![image](https://github.com/user-attachments/assets/5dc50d9b-2082-41fc-98b4-ef7f1de887e2)


## view medicine details



![image](https://github.com/user-attachments/assets/6b6ce571-ed99-4c14-92d1-af24a15874d5)


## Add a new Medicine to the Store 



![image](https://github.com/user-attachments/assets/b35dec1a-49cb-426f-bc04-91e5dc6b157e)



## Update stock or other details for a medicine



![image](https://github.com/user-attachments/assets/8a96d555-f2f9-4e0c-9974-ae3bbc1e0027)


# Launching Swagger UI
Swagger UI Is available at Http://localhost:9097/swagger-ui.html
Below screenshot shows the Home Page of Swagger UI. It shows a list of all the resources that are exposed.
It shows all the request methods that can be used with a Resource.
You can also see the details for a Specific Request Method.

## Swagger UI Documentation

![image](https://github.com/user-attachments/assets/b13ef4a1-fb06-4db3-bc6c-1107dddcd56e)

### It shows all the request methods that can be used with a Resource.

![image](https://github.com/user-attachments/assets/2366888c-30e7-4626-b9c3-5f72db59cd30)

### You can also see the details for a Specific Request Method.

![image](https://github.com/user-attachments/assets/67ac987f-b659-4310-a52a-3bbb7448f9f1)

### use the ‘Try it out’ button to execute a request and see the response

![image](https://github.com/user-attachments/assets/f6708820-df42-46c4-9d6a-530ba10f4ea6)
