/*Primera consulta*/
select distinct e.*, m.activo
from Estudiantes e
join MateriasEstudiantes me on e.idEstudiante = me.idEstudiante
join Materias m on m.idMateria = me.idMateria
Where e.activo = "S" and m.activo = "S";

/*Segunda consulta*/
select distinct *
from Estudiantes 
where activo = "S" and email like "%GMAIL%";

/*Tercera consulta*/
select *
from Estudiantes
where activo = "N" and edad > 18 and Estudiantes.identificacion like "1%";
