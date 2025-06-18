# Database migration with flyway

This project show cases how flyway is used for database migration. 
The entity created in week four was used to implement the database migration.

There are five migration files under the db.migration folder located inside resources folder. The first migration file titled V1__create_employee_table.sql contains SQL statements that will create the table. The second migration file with name as V2__insert_into_employee_table.sql contains SQL statements to insert data into the employee table. The third migration file named V3_alter_name_of_column.sql contains SQL statement to change NOKFirstName to nextOfKinFirstName. The fourth migration file titled V4___addUserName_column_to_the_employee_table.sql contains SQL statement to add username column which was not in the table when it was initially created. The final being the fifth migration file name V5__add_default_value_to_the_userName_column.sql contains the SQL statements to add a default random text to the username column that was added to the table (employee entity) after the table was created. The above migrations were done one after the other.

POSTGRES database was used for this project with pgAdmin4 graphic user interface.