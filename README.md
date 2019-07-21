# Student-Result-Record-Enhanced
Student Result Record -- Separate Connection File (Advance java assignment-1)

database Demo hosted At Local server here.

this is the enhanced version of the previous project Student-Result-Record

in this project i make separate Connection file and all objects like Connection object, Statement object, ResultSet object palced into
ConnectionFile.java we just have to make object of ConnectionFile in remaining File where we want to connect database , so we can save 
memory as well lines of code by using this way of codding.

here you have to

first run SchemaCreation1.java First which create Schema of database.
then run InsertRecord1.java which insert data like semid,sgpa,cgpa,class(first class,second class,..)
then run AlterTable1.java which will add new column called marksheet of type blob.
then run InsertMarksheet1.java which will insert image(blob) file of each semester.
then run DisplaySGPA1.java Which can show SGPA Of Any Semester.
then tun Metadata1.java To show information about database like vendor name, number of row present in database.
