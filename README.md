# PetStoreSystem
This project's primary objective is to provide an overview of a fundamental Java-based pet store management system.This console-based application, called Pet Store System, enables us to carry out a number of tasks, such as comparing pets based on pricing, adding pet details, updating pet details, and checking vaccination status Etc.
1. Introduction

1.1. Purpose of the Document
The purpose of this document is to provide an overview of the Pet Store System project developed using Core Java. It outlines the system's requirements, architecture, features, user interface.

1.2. Project Overview
The Pet Store System is a console-based application that allows users to perform various pet search activities such as pets details management, view all pets information, search pets by category , price and more. The system aims to provide user-friendly interface for pets store owner and buyers to access pets details and search it as per requirement.
Note: for core java track participants will do this project as console-based menu driven code.

1.3. Scope
The scope of the Pet Store System project includes the following functionalities:
- Pets management (add, update, delete pet details).
- View all pets available for sale .
- Count number of pets for each category 
-  Search by price range
- Count number of pets vaccinated for given pet type

2. System Requirements

2.1. Functional Requirements
1. Pets Management: Users should be able to add, update(price and vaccination status) and delete pet details.
2. View All: Users should be able to view all pets available for sale.
3. Count number of pets for each category: Users should be able to view  number of pets for each 					      category(say category is Dog/Cat)
4. Search by price range: Users should be able to search pets information by price range(between 			min and max cost)
5. Count number of pets vaccinated for given pet type: Users should be able to view number of pets vaccinated for given pet type (say type is Golden Retriever)



3. Architecture

3.1. High-Level Architecture
The Pet Store System will follow a menu driven application. The application will handle logic, data processing  and database interactions.

3.2. Class Diagram
Pet
-petId:int
-petCategory:String
-petType:String
-color:String
-age:int
-price:double
-isVaccinated:boolean
-foodHabits:String
  
PetDAO
+addPetDetails(Pet):int
+deletePetDetails(int):int
+updatePetPriceAndVaccinationStatus(double, boolean):boolean
+showAllPets():<List>
+countPetsByCategory(String):int
+searchByPrice(double,double):<List>
+countByVaccinationStatusForPetType(String):int
 
4. User Interface
The Pet Store System should have menu to select operation to perform. Wherever search operation doesn’t return any result, show appropriate message. E.g. If for given pet category pet doesn’t exist , show message “Pet not available”.
Menu should have below options
Enter your choice:
1. Add new pet details
2. Update pet price and Vaccination Status
3. Delete pet details
4. View all pets
5. Count pets by category
6. Find by price
7. Find by vaccination status for pet type
8. Exit
After user selects one option, take input from user wherever applicable. E.g. If option 6 is selected, application should ask to enter minimum and maximum price and then show result.

5. Technologies Used
. Core Java, JDBC, Oracle
6. Conclusion
The Pet Store System will help pet store owner to advertise his/her pets for sale  and buyers can search it as per their requirement.
7. References
https://docs.oracle.com/javase/8/docs/
https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
