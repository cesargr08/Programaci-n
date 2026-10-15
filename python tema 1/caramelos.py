#Ejercicio 11

Caramelos = int(input("¿Cuantos caramelos tienes?:"))
Alumnos = int(input("¿Cuantos alumnos hay?:"))

print("---ENTONCES---")
print("Cantidad de caramelos:",Caramelos)
print("Cantidad de alumnos:",Alumnos)
print("Cada alumno recibe:", Caramelos // Alumnos,"caramelos")
print("Sobran:",Caramelos % Alumnos,"caramelos")
