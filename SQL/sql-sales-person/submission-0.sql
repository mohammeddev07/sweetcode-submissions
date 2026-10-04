select s.name from sales_person s 
where s.sales_id not in (
    select o.sales_id from orders o where o.com_id in (
        select c.com_id from company c where c.name = 'CRIMSON'
    )
)