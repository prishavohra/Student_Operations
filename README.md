# Student_Operations
Java assignment to understand the concepts of classes, array of objects, instance members, and constructors.

## List of Variables

| Name     | Data Type         | Use                         |
|----------|------------------|-----------------------------|
| `name`   | `String`         | Stores the student's name  |
| `prn`    | `long`           | Stores the student's PRN   |
| `dob`    | `String`         | Stores the date of birth   |
| `marks`  | `double`         | Stores the student's marks |
| `students` | `ArrayList<Student>` | Stores the list of students |

## List of Functions

| Name                | Return Type  | Use                                  |
|---------------------|-------------|--------------------------------------|
| `Student(String, long, String, double)` | Constructor | Initializes student attributes |
| `getName()`        | `String`     | Returns student's name              |
| `getPRN()`         | `long`       | Returns student's PRN               |
| `getDoB()`         | `String`     | Returns student's date of birth     |
| `getMarks()`       | `double`     | Returns student's marks             |
| `setName(String)`  | `void`       | Updates student's name              |
| `setPRN(long)`     | `void`       | Updates student's PRN               |
| `setDoB(String)`   | `void`       | Updates student's date of birth     |
| `setMarks(double)` | `void`       | Updates student's marks             |
| `toString()`       | `String`     | Returns formatted student details   |
| `addStudent(Student)` | `void`    | Adds a student to the list          |
| `displayStudents()` | `void`      | Displays all students               |
| `searchByPRN(long)` | `Student`   | Searches student by PRN             |
| `searchByName(String)` | `Student` | Searches student by name            |
| `searchByPosition(int)` | `Student` | Searches student by position        |
| `updateStudent(long, String, String, double)` | `boolean` | Updates student details |
| `deleteStudent(long)` | `boolean` | Deletes a student by PRN            |
