REQUIREMENTS

1. A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list. **To consider this requirement, ReminderList class is added to the design.**
2. The application must contain a database (DB) of reminders and corresponding data. **There is database ReminderDB with attributes reminder and reminderData.**
3. Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).**To maintain the hierarchical structure, I created ReminderType class with attribute reminderType which will then be added to ReminderList with reminderName. **
4. Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB. **To achieve this requirement, I added a operation search in class UserReminder. It then looks for the reminder with similar name is database and if matches add to the list.In case, it didn't match, it creates new reminder from ReminderType class. **
5. The reminders must be saved automatically and immediately after they are modified. 
6. Users must be able to check off reminders in the list (without deleting them). **I added a checkOffMarks(reminder) for this requirement.**
7. Users must also be able to clear all the check-off marks in the reminder list at once. **I added clearAllCheckOffMarks() for this requirement.**
8. Check-off marks for the reminder list are persistent and must also be saved immediately.
9. The application must present the reminders grouped by type.
10.  The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”, “Kid’s Reminders”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists. **For this requiremnt I added create, rename, select and delete operations in UserReminder class.**
11. The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior.**I added the operations isDayTimeAlert() and repeat() in class ReminderList along with attributes day, time.**
12. Extra Credit: Option to set up reminder based on location.
13. The User Interface (UI) must be intuitive and responsive.