select e.left_operand, e.operator, e.right_operand, 
    case 
        when e.operator = '>' then v1.value > v2.value
        when e.operator = '<' then v1.value < v2.value
        when e.operator = '=' then v1.value = v2.value
        end as value

    from expressions e
    join variables v1 on e.left_operand = v1.name
    join variables v2 on e.right_operand = v2.name
