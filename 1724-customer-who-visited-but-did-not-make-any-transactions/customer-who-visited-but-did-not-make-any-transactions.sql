# Write your MySQL query statement below

select A.customer_id, count(*) as count_no_trans from Visits as A 
left join 
Transactions as B
on A.visit_id = B.visit_id
where  B.Transaction_id is null
group by A.customer_id
;