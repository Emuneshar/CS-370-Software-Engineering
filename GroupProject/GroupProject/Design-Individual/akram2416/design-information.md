# SOFTWARE DESIGN
## REMINDERS
### REQUIREMENTS
<ol>
  <li>1.	A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list.
    <strong> In users reminder list there are method to createRemainder(),rename(oldName,newName),delelteRemainder() and searchReminde() implemented since the users want these primary operations. </strong>

  </li>
  <li>
    The application must contain a database (DB) of reminders and corresponding data.
    <strong>UML diagram contains a database that store reminder list data and able to do CRUD(create, read , delete , update) operations as per users need</strong>
  </li>
  <li>
    Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).

  </li>
  Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.
  <strong>Will be implemented in the later part of the development</strong>

  <li>
    The reminders must be saved automatically and immediately after they are modified.
    <strong>listREminders class handle all the add,edidt ,delete opertation and update the data in to the database.</strong>

  </li>
  <li>
    Users must be able to check off reminders in the list (without deleting them)
    <strong>Users is able to select and deselect items in the list by the use of checkOffmarks() method in the list reminders class</strong>
  </li>
  <li>
    Check-off marks for the reminder list are persistent and must also be saved immediately
    <strong>The criteria is implemented in the list Reminders class and it is conneceted to the database , </strong>
  </li>
  <li>
   <strong> The application must present the reminders grouped by type.
    ReminderTypeSet class contains the menthod contains the argument that set up the all the catagories of this requirement</strong>

  </li>
  <li>
    The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”, “Kid’s Reminders”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.
    <strong>RepeatsREminder class contains the method seperate the reminder frewuency by daily(), weekday(), monthly() and yearly() catagories</strong>

  </li>
  <li>
    The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior.

  </li>
  <li>
    Extra Credit: Option to set up reminder based on location
    <strong>Implemented by the use of third party API</strong>
  </li>
 
  </ol>
