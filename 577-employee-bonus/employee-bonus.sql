# Write your MySQL query statement below
select A.name, B.bonus from Employee as A
left join Bonus as B 
on 
A.empid = B.empid
where B.bonus<1000 or B.bonus is null;
;