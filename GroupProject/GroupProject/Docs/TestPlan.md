\# Test Plan

**Author**: <Team 1>

**## 1 Testing Strategy**

We will start with Unit testing then Integration Test. If the build is correct then we will move forward to System,Regression and API testing in order.

**### 1.1 Overall strategy**

**Unit Testing** Test the individual components of the software.

*1. Create Reminder-- Check that the new reminder is added.*

*2. Rename-- check if the user is able to re-write.*

*3. Delete-- User is able to delete from the list.*

*4. Search-- Find the reminder from the list.*

**Integration testing** will be performed by the QA tester to ensure multiple modules of the application perform together smoothly.

- Newly created reminder is able to select different types of event, able to add location,able delete,remove and Edit.

**System testing**  will be performed by running the application on an android device to ensure the application as a  whole performs according to the user’s requirement.

**Regression testing** will be performed if needed by developers to ensure new code does not have a negative impact on the existing code.

1. *Database should be configured as per the application requirements.*
1. *Return the value regards to its input.*
1. *Update the database.*
1. *Push the update to the database*

**### 1.2 Test Selection**

- We will test using black & white box techniques.

- White-box testing will be used on units, going through the code to see if each unit works as intended.

- Black-box testing will be used on the system and regression, including if the program executes or not, choosing valid and invalid inputs to check if the program works correctly, see if the selected function shows the expected output, etc.

- Most testing will be done manually

**### 1.3 Adequacy Criterion**

- To ensure a list of good quality test cases, we will select cases that cover every function of the application, i.e. every structure must execute at least once.

**### 1.4 Bug Tracking**

Will be tracked using github version tracking.

Bug testing will be dealt by the QA tester

We will use LogCat and Runtime Stack provided by Android Studio 

**### 1.5 Technology**

**JUNIT --** Well suited for Manual Testing. 

**Android Studio --** proved real time feedback on the app progress

**Java** -- will be used for programming the app.

**MySql** -- needed for the database of the app.

**## 2 Test Case**












|**Test Case Id**|**Test Cases Description**|**Steps**|**Expected Result**|**Actual Result (to be filled later)\***|<p>**Pass**</p><p>**(to be filled later)\***</p>|
| :- | :- | :- | :- | :- | :- |
|REMINDER APP\_REMINDER NAME\_01|INPUT DOMAIN TESTING ON REMINDER NAME|CLICK ON REMINDERAPP, ENTER THE REMINDER NAME|IT MUST ACCEPT THE INPUT VALUES|IT IS ECCEPTING THE INPUT VALUES|pass|
|REMINDER APP\_TIME\_02|INPUT DOMAIN TESTING ON TIME|CLICK ON REMINDER APP, ENTER THE REMINDER NAME, ENTER THE TIME OF THE REMINDER|TIME MUST ACCPET IPUT TIME VALUE|It IS ACCEPTING THE TIME OF THE REMINDER|pass|
|REMINDER APP\_DATE\_03|INPUT DOMAIN TESTING ON DATE|CLICK ON REMINDER APP, ENTER THE REMINDER NAME, ENTER THE TIME OF THE REMINDER, ENTER THE date of the reminder|Date MUST ACCPET THE INPUT DATE VALUE|IT ACCEPTING THE DATE VALUE FOR THE REMINDER|pass|
|REMINDER APP\_CREATE REMINDER\_04|DATABASE OR BACKEND COVERAGE FOR THE CREATE REMINDER BUTTON|CLICK ON REMINDER APP, ENTER THE REMINDER NAME, ENTER THE TIME OF THE REMINDER, ENTER THE date of the reminder, CLICK ON CREATE REMINDER|IT MUST CREATE THE REMINDER|It IS CREATING THE REMINDER|pass|
|REMINDER APP\_EDIT REMINDER\_05|DATABASE OR BACKEND COVERAGE FOR THE EDIT REMINDER|CLICK ON REMINDER APP, ENTER THE REMINDER NAME, ENTER THE TIME OF THE REMINDER, ENTER THE date of the reminder, CLICK ON EDIT REMINDER|IT must edit the previous reminder and show new reminder|It is allowing to edit previous reminder and showing new reminder|pass|
|REMINDER APP\_DELETE REMINDER\_O6|DATABASE OR BACKEND COVERAGE FOR THE DELETE REMINDER BUTTON|CLICK ON REMINDER APP,CLICK ON DELETE REMINDER|IT MUST ALLOW TO DELETE THE REMINDER|It is ALLOWING TO DELETE THE REMINDER.|pass|
|REMINDER APP\_VIEW REMINDER\_07|DATABASE OR BACKEND COVERAGE FOR THE VIEW REMINMDER BUTTON|CLICK ON REMINDER APP, ENTER THE REMINDER NAME, ENTER THE TIME OF THE REMINDER, ENTER THE date of the reminder, CLICK ON CREATE REMINDER, CLICK ON VIEW REMINDER|IT MUST SHOW THE REMINDER NAME, DATE AND TIME|It is SHOWING THE REMINDER NAME, DATE AND TIME|pass|
|||||||


