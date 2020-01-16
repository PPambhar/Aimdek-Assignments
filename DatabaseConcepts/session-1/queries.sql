-- CREATE DATABASE PritPambharDB

-- use PritPambharDB

-- CREATE TABLE DemoMaster
-- (
--     DemoId int IDENTITY(1,1) PRIMARY KEY,
--     DemoName VARCHAR(30),
--     DemoAge int,
--     DemoUserName VARCHAR(30),
-- );

-- INSERT INTO DemoMaster
-- VALUES ('Benny',40,'hillbenny');

-- select * from DemoMaster;

-- INSERT INTO DemoMaster
-- VALUES ('Frey',60,'Freyben');

-- INSERT INTO DemoMaster
-- VALUES ('William',45,'willy');

-- INSERT INTO DemoMaster
-- VALUES ('Micheal',20,'Machy');

-- INSERT INTO DemoMaster
-- VALUES ('Max',25,'Maxie');

-- INSERT INTO DemoMaster
-- VALUES ('Frey',65,'Freydone');

-- INSERT INTO DemoMaster
-- VALUES ('Frey',37,'Freyuse');

-- SELECT * FROM DemoMaster;

-- SELECT * FROM DemoMaster WHERE DemoName = 'Frey';

-- SELECT * FROM DemoMaster
-- ORDER BY DemoName;

-- SELECT * FROM DemoMaster
-- ORDER BY DemoName Desc;

-- SELECT TOP 5 * FROM DemoMaster;

-- SELECT TOP 10 PERCENT * FROM DemoMaster;

-- SELECT DISTINCT(DemoName) FROM DemoMaster;

-- SELECT DemoName FROM DemoMaster;

-- CREATE TABLE TestMaster
-- (
--     TestId int IDENTITY(1,1) PRIMARY KEY,
--     TestName VARCHAR(30),
-- );

-- Insert into TestMaster values('abc');
-- Insert into TestMaster values('xyz');
-- Insert into TestMaster values('abc');
-- Insert into TestMaster values('pqr');
-- Insert into TestMaster values('abc');
-- Insert into TestMaster values('xyz');


-- SELECT DemoName FROM DemoMaster
-- WHERE DemoId IN
-- (SELECT TestId
-- FROM TestMaster
-- WHERE TestName = 'abc');

-- SELECT * FROM DemoMaster
-- INNER JOIN TestMaster
-- ON DemoMaster.DemoId=TestMaster.TestId;

-- SELECT * FROM DemoMaster
-- LEFT JOIN TestMaster
-- ON DemoMaster.DemoId=TestMaster.TestId;

-- SELECT * FROM DemoMaster
-- RIGHT JOIN TestMaster
-- ON DemoMaster.DemoId=TestMaster.TestId;

-- SELECT * FROM DemoMaster
-- FULL JOIN TestMaster
-- ON DemoMaster.DemoId=TestMaster.TestId;

-- SELECT * FROM DemoMaster AS D
-- INNER JOIN TestMaster AS T
-- ON D.DemoId=T.TestId WHERE D.DemoId=2;

-- UPDATE TestMaster
-- SET TestName = 'funnyman'
-- WHERE TestId = 6;

-- SELECT * from TestMaster;

-- SELECT count(*) from DemoMaster;

-- SELECT count(*) from TestMaster;

-- ALTER TABLE TestMaster 
-- ADD TestSal FLOAT;

-- SELECT * FROM TestMaster;

-- Drop DATABASE TraineeDBSampleNew;







