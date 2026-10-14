# Sistema de Agenda de Contactos en Java

## Descripción del Proyecto

Este proyecto consiste en una aplicación de consola desarrollada en equipo utilizando el lenguaje Java bajo el paradigma de la Programación Orientada a Objetos. Su propósito principal es gestionar una agenda telefónica digital que permite almacenar, organizar y validar la información de distintos contactos de manera eficiente y estructurada.

## Características Principales
- Creación de agendas con tamaño predeterminado de 10 contactos o con capacidad personalizada.
- Registro de nuevos contactos con nombre, apellido y número telefónico.
- Validación automática para prevenir el registro de nombres vacíos o contactos duplicados.
- Verificación del estado de almacenamiento de la agenda (espacios disponibles o agenda llena).
- Interfaz interactiva y guiada mediante un menú en consola.

## Estructura de Clases, Constructores y Métodos
Contiene tres clases principales que interactúan entre sí:

### 1. Clase Contacto (`Contacto.java`)

* **Atributos:** Define variables privadas para el almacenamiento de datos personales: `nombre`, `apellido` y `telefono`.
* **Constructor:** Cuenta con un constructor principal que recibe los tres parámetros (`nombre`, `apellido`, `telefono`) para inicializar el objeto de forma inmediata.
* **Métodos principales:** Incluye métodos `getter` y `setter` para acceder y modificar de forma segura los atributos encapsulados. Asimismo, sobrescribe los métodos `equals` y `hashCode` para garantizar que dos contactos se consideren idénticos si comparten el mismo nombre y apellido, omitiendo diferencias entre mayúsculas y minúsculas. El método `toString` facilita la representación en texto del contacto.

### 2. Clase Agenda (`Agenda.java`)

* **Atributos:** Utiliza un arreglo estático de tipo `Contacto` llamado `contactos` y una variable entera `contador` para llevar el registro de elementos almacenados.
* **Constructores:** Ofrece dos opciones de inicialización: un constructor por defecto que establece un tamaño predeterminado de 10 contactos, y un constructor sobrecargado que recibe un parámetro numérico para definir un tamaño máximo personalizado.
* **Métodos principales:** 
  - `AddContacto(Contacto contactoNuevo)`: Valida que los campos obligatorios no estén vacíos, comprueba que la agenda no esté llena y verifica que el contacto no exista previamente antes de agregarlo al arreglo.
  - `agendaLlena()` y `espacioAgenda()`: Comprueban de manera rápida el estado actual de almacenamiento y los espacios disponibles.
  - `existeContacto(Contacto contactoNuevo)`: Recorre el arreglo para buscar coincidencias exactas mediante la validación de igualdad previamente configurada.

### 3. Clase Principal (`Main.java`)
Es la encargada de coordinar la ejecución del programa y la interacción directa con el usuario.
* **Método principal (`main`):** Configura la entrada de datos mediante la clase `Scanner`, inicializa el objeto `Agenda` según la preferencia del usuario (tamaño fijo o personalizado) y ejecuta un bucle iterativo `do-while` controlado por un menú numérico de opciones. Mediante una estructura de control `switch`, procesa las solicitudes de adición, verificación de espacio y consulta del sistema.


### Instrucciones para compilar y ejecutar:

1. Compilar los archivos fuente desde la terminal:
   `javac Main.java Agenda.java Contacto.java`

2. Ejecutar la aplicación:
   `java Main`

3. Seguir las indicaciones del menú interactivo que aparecerá en pantalla.