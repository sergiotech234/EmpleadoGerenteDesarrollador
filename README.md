# Empleados y herencia

## Descripción
Ejercicio de herencia en Java utilizando atributos privados y getters para acceder a ellos desde las subclases.

## Funcionamiento
- `Empleado` contiene nombre, salario y departamento como atributos privados, además de sus getters.
- `Gerente` hereda de `Empleado`, añade un bono y calcula el salario total sumándolo al salario base.
- `Desarrollador` hereda de `Empleado` y añade el lenguaje de programación.
- Cada clase implementa `mostrarInformacion()`. Las subclases utilizan `super.mostrarInformacion()` para mostrar los datos heredados.

## Prueba
La clase `TestEmpleado` crea objetos de tipo `Gerente` y `Desarrollador` y muestra su información.

## Concepto importante
Al ser los atributos privados, las subclases deben acceder a ellos mediante getters. Si fueran `protected`, `Gerente` podría acceder directamente a ellos sin necesidad de utilizar esos métodos.

## Conclusión
El ejercicio permite comprender la herencia, el uso de `super` y las diferencias entre los modificadores de acceso `private` y `protected`.
