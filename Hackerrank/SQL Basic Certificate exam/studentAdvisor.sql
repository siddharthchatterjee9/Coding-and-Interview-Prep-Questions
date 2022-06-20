select roll_number,name
from student_information a
         inner join faculty_information b
                    on a.advisor = b.employee_ID
where (b.gender = 'M' and b.salary>15000) or (b.gender = 'F' and b.salary>20000)