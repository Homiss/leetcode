select l.score,
r.rank
from l_178 l,
(
select s.score, (@rank:=@rank + 1) as rank from (select DISTINCT score from l_178 order by score desc) s,(select @rank:=0) init
) r
where l.score = r.score
order by l.score desc