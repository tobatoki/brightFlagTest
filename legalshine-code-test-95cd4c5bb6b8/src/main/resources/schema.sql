create table student (
   studentID integer auto_increment not null,
   firstName varchar(255) not null,
   lastName varchar(255) not null,
   primary key(studentID)
);

create table subject (
   subjectID integer auto_increment not null,
   subjectName varchar(255) not null,
   primary key(subjectID)
);

create table exam (
   examID integer auto_increment not null,
   examName varchar(255) not null,
   primary key(examID)
);

create table faculty (
   facultyID integer auto_increment not null,
   facultyName varchar(255) not null,
   primary key(facultyID)
);

create table studentExams(
   studentExamsID integer auto_increment not null,
   examID integer auto_increment not null,
   studentID integer auto_increment not null,
   FOREIGN KEY (examID) REFERENCES exam(examID),
   FOREIGN KEY (studentID) REFERENCES student(studentID)
);

create table studentSubjects(
   studentSubjectsID integer auto_increment not null,
   subjectID varchar(255) not null,
   studentID varchar(255) not null, 
   FOREIGN KEY (subjectID) REFERENCES subject(subjectID),
   FOREIGN KEY (studentID) REFERENCES student(studentID)
);

create table studentGrades(
   studentID integer not null,
   examID integer not null,
   studentGrade integer not null,
   FOREIGN KEY (studentID) REFERENCES student(studentID),
   FOREIGN KEY (examID) REFERENCES exam(examID)
);