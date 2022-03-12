# prueba_cliente_factura


La presenta Prueba contiene microservicios Rest realizados en lenguaje Java implementando el Framework SpringBoot usando Maven, en el apartado de código contiene 4 paquetes llamados controllers, services, respositories y models.

El proyecto cuenta con 2 dependencias importantes que son: MySql Driver y JPA driver, la primera para realizar la conexión a la base de datos creada en Mysql y la segunda para poder manipular la base de datos a partir de los servicios

El repositorio también contiene un archivollamado pruebas_postman.json, es una colección que se carga en la aplicación postman y contiene las diferentes pruebas realizadas de los diferentes servicios creados.

En el paquete models se encuentran mapeadas todas las tablas generadas en la base de datos con sus respectivas relaciones

En el paquete repositories se encuentran las interfaces que extienden CrudRepository, permitiendo implementar metodos crud a los servicios.

En el paquete services se encuentra la lógica de los servicios creados.

En el paquete controllers se encuentran los puntos de entrada de la aplicación y la invocación de los servicios CRUD.

aunque el software fue construido bajo la filosofía database first, se configuro el application properties para que se generen las tablas a partir de la compilación del código, también cabe resaltar que se debe configurar la conexión a la base de datos así:

spring.datasource.url=jdbc:mysql://localhost/nombre_de_la_bd
spring.datasource.username=usuario
spring.datasource.password=contrasenia
spring.jpa.hibernate.ddl-auto=update

se debe crear una base de datos vacías y realizar la conexión en este apartado para que al compilar la aplicación se mapeen las tablas correctamente

Se cumplió con los servicios CRUD para las tablas Client(cliente) y Product(productos), Los servicios para Bill(facturas) quedaron incompletos, sin embargo se puede observar en el archivo BillService.java la lógica que se construyó para este apartado

Por último se adjunta una carpta llamada IMG con pantallazos tomados de postman realizando los servicios CRUD
