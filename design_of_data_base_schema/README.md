In this project, a high level database Schema design was carried out using the edit window of pgAdmin4. 

First A databse named intern_management_system was created using the following command:-
CREATE intern_management_system. 

Four Entities were created inside the above named database which implies that four tables were created namely:-  intern, mentor, project and assignment.

for the project entity, the follwoing command was used to create it.
CREATE TYPE project_status AS ENUM ('Planning', 'Ongoing', 'Completed', 'On Hold');
CREATE TABLE project (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    start_date DATE NOT NULL,
    end_date DATE,
   status project_status DEFAULT 'Planning'
);

for the mentor entity, the following command was used.
CREATE TABLE mentor (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    expertise VARCHAR(100) NOT NULL,
    hire_date DATE NOT NULL
);

for the intern entity, the follwoing command was used:-
CREATE TABLE intern (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    join_date DATE NOT NULL,
    mentor_id INT,
    FOREIGN KEY (mentor_id) REFERENCES mentor(id)
);

for the assignment entity, the following command was used:-
CREATE TYPE project_status AS ENUM('Active', 'Completed', 'Terminated');
CREATE TABLE assignment (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    intern_id INT NOT NULL,
    project_id INT NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
	assignment_status project_status DEFAULT 'Planning',
    FOREIGN KEY (intern_id) REFERENCES intern(id),
    FOREIGN KEY (project_id) REFERENCES project(id),
    UNIQUE (intern_id, project_id) 
);
