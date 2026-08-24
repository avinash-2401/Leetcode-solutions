# Write your MySQL query statement below
select    person.email as Email
from person
group by email
having count(email) >1;
