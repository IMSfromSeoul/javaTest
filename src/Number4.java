SELECT stage, ROUND(AVG(student_num)) AS students_per_school, ROUND(SUM(student_num) DIV SUM(teacher_num),1) AS students_per_teacher
        FROM SCHOOLS
        GROUP BY stage;