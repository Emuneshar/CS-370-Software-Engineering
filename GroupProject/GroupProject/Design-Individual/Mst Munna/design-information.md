1. Classes:
   User, reminder, reminderType, reminderList, checkoff_reminders

2.Attributes:
 - user ( user_firstName, user_lastName, address)
 - reminder (reminderID, reminderName, description, address, date)
 - reminderType (typeName, description)
 - reminderList (reminderList, totalReminder)
 - checkoff_Reminders (reminderList, reminderID, totalReminder)

3. opearations: 
 - user(adduser(), updateUser())
 - reminder( addReminder(), updateReminder(), deleteReminder())
 - reminderList(addlist(), deletelist(), updatetotalreminder())
 - reminderType (addtype(), deletetype())
 - checkoff_reminders (addcheckoff(), deletecheckoff())

4. Relationship:
 - user can have multiple reminderList
 - reminderList is a child of reminder and can have one or multiple reminder.
 - one reminder can have none or multiplr checkoff_Reminders
 - reminder can have one reminderType.
  
Design Analysis:

1. A class is needed to be added which will have all the reminders selected by one user.
   class: reminderList
    attributes: reminderList, totalReminder 
    operation : addlist(), deletelist(), updatetotalreminder()
2. A class is needed to be added which will have all the reminders available.
   class: reminder
   attributes: reminderID, reminderName, description
   operation: addReminder(), updateReminder(), deleteReminder()
3. A class is needed for the relationship between user and reminderList.Relationship needs to be added for Item and User which is already implemented in requirement 3 i.e. reminderList.
   class: user
   attributes:  user_firstName, user_lastName, address
    operation : - user(adduser(), updateUser())
4. This requirement is not related to class design, it will be implemented on software development side where the query will be sent to database and resultant items will be returned back to user screen.
5.This requirement is regarding saving the ItemsList implemented as a design of Requirement3.
6.A class is needed to be added which will have all the reminders checkoff selected by user.
  class: checkoff_Reminders
   attributes: reminderList, reminderID, totalReminder
  operation: addcheckoff()
7. To implement the requirement checkOffItems class need to have a new function 
   class:checkoff_Reminders
   operation: deletecheckoff()
8. This requirement will be implemented using below class and method already designed for requirement 8
9. This require a class to categories the Items by its Type and it will inherit reminders class.
    class:reminderType
    attributes: typeName, description
    operation: addtype(), deletetype()
10.one user class can have multiple reminderList here.
11. For this requirement the reminders need extra attributes.
    class: reminder
    attributes: date
12. For this requirement the reminders need extra attributes in remider class.
    class : reminder
    attributes: address.

