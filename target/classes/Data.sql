DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department`(
     `department_id` INT(6) NOT NULL AUTO_INCREMENT,
     `department_name` VARCHAR(30) NOT NULL,
     `department_location` VARCHAR(50) NOT NULL,
     PRIMARY KEY (`department_id`))
     ENGINE=INNODB DEFAULT CHARSET=UTF8;
     
  DROP TABLE IF EXISTS `Course`;
  CREATE TABLE `Course`(
      `course_id` VARCHAR(10) NOT NULL,
      `course_name` VARCHAR(25) NOT NULL,
      `course_length` VARCHAR(15) NOT NULL,
      `department_id` INT(6) NOT NULL
      PRIMARY KEY (`course_id`),
      FORIGN KEY (`department_id`) REFERENCES Department(`department_id`))
      ENGINE=INNODB DEFAULT CHARSET=UTF8;
      
    DROP TABLE IF EXISTS `Student`;
  CREATE TABLE `Student`(
      `student_id` VARCHAR(10) NOT NULL,
      `student_name` VARCHAR(30) NOT NULL,
      `student_academicyear` INT(15) NOT NULL,
      PRIMARY KEY (`course_id`))
      ENGINE=INNODB DEFAULT CHARSET=UTF8;   
      
   DROP TABLE IF EXISTS `Student_Course`;
   CREATENTABLE `Student_Course`(
       `student_id` VARCHAR(10) NOT NULL,
       `course_id`  VARCHAR(10) NOT NULL,
       PRIMARY KEY (`student_id`,`course_id`),
       FORIGN KEY  (`student_id`) REFERENCES Student(`student_id`),
       FORIGN KEY   (`course_id`) REFERENCES Course(`course_id`))
       ENGINE=INNIDB DEFAULT CHARSET=UTF8;
       
       INSERT INTO Department(department_name,department_location) VALUES('CM Department','2nd floor,fit');
       