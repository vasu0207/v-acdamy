DROP TABLE IF EXISTS VACADAMY_DEPARTMENT;

CREATE TABLE VACADAMY_DEPARTMENT (
  dept_Id INT AUTO_INCREMENT  PRIMARY KEY,
  dept_name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS VACADAMY_STUDENTS;

CREATE TABLE VACADAMY_STUDENTS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  dept_Id INT NOT NULL,
  foreign key (dept_Id) references VACADAMY_DEPARTMENT(dept_Id)
);

DROP TABLE IF EXISTS VACADAMY_COURSES;

CREATE TABLE VACADAMY_COURSES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  dept_Id INT NOT NULL,
  subject_name VARCHAR(250) NOT NULL,
  course_details CLOB NOT NULL,
  foreign key (dept_Id) references VACADAMY_DEPARTMENT(dept_Id)
);