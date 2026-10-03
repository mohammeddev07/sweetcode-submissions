select e.student_id, min(e.exam_id) as exam_id, e.score
from exam_results e
join (
    select student_id, max(score) as max_score from exam_results group by student_id
) m
on e.student_id = m.student_id and 
    e.score = m.max_score
group by e.student_id, e.score
order by e.student_id
