-- having的用法
-- having字句可以让我们筛选成组后的各种数据，where字句在聚合前先筛选记录
-- 也就是说作用在group by和having字句前。
-- 而 having子句在聚合后对组记录进行筛选。

select Email from Person
GROUP BY Email
having count(1) > 1