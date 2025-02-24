# Proyecto Aso

### Acerca del proyecto
El objetivo principal es gestionar simulaciones de contrataciones de tarjetas de crédito para un cliente a través de un servicio que acepta peticiones POST con datos en formato JSON.

### Tecnologías utilizadas
- Intellig IDEA 
- Postman
- Docker

#### Instalación
1. Clonar el repositorio o descargar el zip
2. Tener el contenedor en docker encendido
3. Importar el proyecto al IDE
4. Buscar el pom y agregar como maven
5. Hacer Clean, Install
6. Habilitar el disco :S
7. Buscar dentro del proyecto la carpeta Tarjet y abrir una terminar (Ejecutar estos comandos).
8. aso-cli deploy helloWorld.jar asoContainer --reload=false
9. aso-cli deploy helloWorld-facade.jar asoContainer --reload=false
10. aso-cli deploy helloWorld-sn.jar asoContainer --reload=true
11. Por ultimo abrir postaman y agregar esta ruta (http://localhost:7500/TechArchitecture/helloWorld/v0/simulations/12345)

#### JSON entrada (Request del servicio ASO QueryParam)

- {
 - "details": {
  -  "offerType": "CARD_HOLDER",
   - "limitAmount": {
    -  "amount": 200000,
     - "currency": "EUR"
   - },
   - "product": {
    -  "id": "TDC",
     - "subproduct": {
      -  "id": "AV"
     - }
   - }
 - }
- }

#### JSON salida
- {
-    "data": {
- "nuip": "1234",
- "details": {
-   "offerType": "CARD_HOLDER",
-    "limitAmount": {
-    "currency": "EUR",
-    "amount": 200000
-    },
-    "product": {
-  "subproduct": {
-   "id": "AV"
-    },
-    "id": "TDC"
-    },
-  "minimumAmount": {
-   "currency": "EUR",
-    "amount": 180000
-   },
-   "maximumAmount": {
-   "currency": "EUR",
-   "amount": 210000
-   }
-    },
-   "id": "b0548fb03e"
-    }
- }

###### Notas adicionales
Mapeo con Mapstruct,
Clases Dtoin y DtOut para entrada y salida de datos,
@Valid para validaciones en los atributos
****
