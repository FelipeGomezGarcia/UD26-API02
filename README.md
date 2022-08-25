# UD26-API02

Para utilizar los endpoint es necesario hacer login atraves del body a la siguiente URL. Esta te devolvera un token en los headers con el que podras hacer cualquier otra consulta.

## URL de la API

https://ud2702.herokuapp.com/login

### Endpoints de ASIGNADOS

  1- Obtener una lista de las asignaciones
  - GET /api/asignados
  
  2- Obtener un asignacion por su id
  - GET /api/asignados/{id}
  
  3- Insertar un asignacion nuevo desde un request body
  - POST /api/asignados
  
  4- Actualizar un asignacion indicando su id y sus campos en el body
  - PUT /api/asignados/{id}
  
  5- Borrar un asignacion por su id 
  - DELETE /api/asignados/{id}

### Endpoints de CIENTIFICOS

  1- Obtener una lista de los cientificos
  - GET /api/cientificos
  
  2- Obtener un cientifico por su dni
  - GET /api/cientificos/{dni}
  
  3- Insertar un cientifico nuevo desde un request body
  - POST /api/cientificos
  
  4- Actualizar un cientifico indicando su dni y sus campos en el body
  - PUT /api/cientificos/{dni}
  
  5- Borrar un cientifico por su dni 
  - DELETE /api/cientificos/{dni}
  
### Endpoints de PROYECTOS

  1- Obtener una lista de los proyectos
  - GET /api/proyectos
  
  2- Obtener un proyecto por su id
  - GET /api/proyectos/{id}
  
  3- Insertar un proyecto nuevo desde un request body
  - POST /api/proyectos
  
  4- Actualizar un proyecto indicando su id y sus campos en el body
  - PUT /api/proyectos/{id}
  
  5- Borrar un proyecto por su id 
  - DELETE /api/proyectos/{id}
