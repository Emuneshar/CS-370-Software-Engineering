1. A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list.

I have represented this by creating listReminders class which allows the following functions: addReminder to add, delete Reminder to delete, editReminder to edit reminders in the list

2. The application must contain a database (DB) of reminders and corresponding data.

I have represented this by adding a database of reminders in the UML diagram

3. Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).

When listReminder is created, the ReminderType class is called in the UML diagram which implements the Reminder class

4. Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.

I have represented by placing the SearchReminders() arrow which searches the DB for similar names

5. The reminders must be saved automatically and immediately after they are modified.

I have represented this using the lolipop symbol in the UML diagram

6. Users must be able to check off reminders in the list (without deleting them).

Reminder class has a boolean value which handles check off in the reminder list

7. Users must also be able to clear all the check-off marks in the reminder list at once.

Handled by the listReminder class which contains clearCheckBox which marks off all reminders in the list

8. Check-off marks for the reminder list are persistent and must also be saved immediately.

Handled by the selectCheckBox function under the listReminder class. listReminder class is connected to the DB which can constantly update the reminder

9. The application must present the reminders grouped by type.

ReminderType attribute in the UML groups reminders by type

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.

I have represented this by using the Reminder class

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.

I have represented this by creating the repeatReminder class in the UML diagram

12. Extra Credit: Option to set up reminder based on location.

I have represented this by adding the Map location Search box which is connected to the Reminder class

13. The User Interface (UI) must be intuitive and responsive.

This is a UML diagram so not possible