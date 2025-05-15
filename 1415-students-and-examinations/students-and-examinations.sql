# Write your MySQL query statement below

select A.student_id, A.student_name, B.subject_name, count(E.subject_name) as attended_exams from Students as A
cross join Subjects as B

left join Examinations as E 
on A.student_id = E.student_id and B.subject_name = E.subject_name
group by A.student_id, A.student_name, B.subject_name


order by A.student_id, B.subject_name ;

