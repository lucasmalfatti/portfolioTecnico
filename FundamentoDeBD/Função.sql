create function minimo (valor1 decimal(3,1), valor2 decimal(3,1)) returns decimal (3,1) as $$
declare
	minimo decimal(3,1);
begin
	if valor1 < valor2 then
	minimo = valor1;
	elsif valor1 = valor2 then
	minimo = valor2;
	else
	minimo = valor2;
	end if;
	return minimo;
	
end; $$
language plpgsql;

select minimo(5,2)
