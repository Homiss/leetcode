select p1.Name as Employee from Person p1, Person p2
where p1.managerId = p2.id
and p1.Salary > p2.Salary