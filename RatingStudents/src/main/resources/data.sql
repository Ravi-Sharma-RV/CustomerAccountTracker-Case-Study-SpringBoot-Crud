INSERT INTO DISTRIBUTIONS (ASSIGNMENT_CATEGORY,Weight) VALUES
 ( 'Test', '40'),
 ('Quiz', '20'),
 ('Lab Work', '10'),
 ('Project', '30');
 
 
 INSERT INTO ASSIGNMENTS (STUDENT_NAME,SUBJECT,ASSIGNMENT_CATEGORY,DATE_OF_SUBMISSION,POINTS) VALUES
 ('Ananth', 'Electro Fields', 'test_1', to_date('21-07-16', 'DD-MM-RR'), '100'),
 ('Bhagath', 'Electro Fields', 'test_1', to_date('21-07-16', 'DD-MM-RR'), '78'),
 ('Chaya', 'Electro Fields', 'test_1', to_date('21-07-16', 'DD-MM-RR'), '68'),
 ('Esharath', 'Electro Fields', 'test_1', to_date('21-07-16', 'DD-MM-RR'), '87'),
 ('Bhagath', 'Electro Fields', 'quiz_1', to_date('22-07-16', 'DD-MM-RR'), '20'),
 ('Chaya', 'Electro Fields', 'lab_1', to_date('23-07-16', 'DD-MM-RR'), '10'),
 ('Ananth', 'Electro Fields', 'project_1', to_date('24-07-16', 'DD-MM-RR'), '100'),
 ('Davanth', 'Electro Fields', 'project_1', to_date('24-07-16', 'DD-MM-RR'), '100'),
 ('Bhagath', 'Electro Fields', 'quiz_2', to_date('25-07-16', 'DD-MM-RR'), '50'),
 ('Ananth', 'Electro Fields', 'quiz_1', to_date('26-07-16', 'DD-MM-RR'), '100'),
 ('Bhagath', 'Electro Fields', 'lab_1', to_date('27-07-16', 'DD-MM-RR'), '10'),
 ('Chaya', 'Electro Fields', 'project_1', to_date('28-07-16', 'DD-MM-RR'), '100'),
 ('Bhagath', 'Electro Fields', 'project_1', to_date('28-07-16', 'DD-MM-RR'), '100'),
 ('Ananth', 'Computing Techniques', 'test_1', to_date('29-07-16', 'DD-MM-RR'), '86'),
 ('Ananth', 'Electro Fields', 'quiz_2', to_date('29-07-16', 'DD-MM-RR'), '100'),
 ('Bhagath', 'Computing Techniques', 'project_1', to_date('30-07-16', 'DD-MM-RR'), '100'),
 ('Ananth', 'Electro Fields', 'lab_1', to_date('30-07-16', 'DD-MM-RR'), '100'),
 ('Chaya', 'Computing Techniques', 'quiz_1', to_date('31-07-16', 'DD-MM-RR'), '20'),
 ('Ananth', 'Electro Fields', 'test_2', to_date('01-08-16', 'DD-MM-RR'), '100'),
 ('Chaya', 'Electro Fields', 'test_2', to_date('01-08-16', 'DD-MM-RR'), '92');