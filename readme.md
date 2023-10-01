# Conversor de Divisas en Java

Este es un programa simple en Java que te permite convertir una cantidad de dinero de una moneda a otra utilizando las tasas de cambio en tiempo real proporcionadas por exchangerate-api.com. La aplicación ofrece una interfaz de usuario simple con cuadros de diálogo que guían al usuario a través del proceso de conversión.

## Requisitos

Asegúrate de tener los siguientes requisitos antes de ejecutar la aplicación:

- Java Development Kit (JDK) instalado en tu computadora.
- Acceso a Internet para obtener tasas de cambio en tiempo real.
- Una clave API válida de exchangerate-api.com.

## Cómo usar la aplicación

1. Ejecución del programa:

   - Abre una terminal o línea de comandos.
   - Navega al directorio donde se encuentra el archivo `.jar` o `.class`.
   - Ejecuta el programa con el siguiente comando:

   java CurrencyConverterApp

2. Menú Principal:

   - Al iniciar el programa, se mostrará un menú principal con dos opciones:
     - "Convertir moneda": Permite al usuario realizar una conversión de moneda.
     - "Salir": Cierra la aplicación.

3. Conversión de Moneda:

   - Selecciona "Convertir moneda" en el menú principal.
   - Elige la moneda de destino de la lista desplegable.
   - Ingresa la cantidad de dinero que deseas convertir.
   - Se mostrará el resultado de la conversión.

4. Continuar o Salir:
   - Después de realizar una conversión, se te preguntará si deseas continuar utilizando el programa.
   - Puedes seleccionar "Sí" para volver al menú principal y realizar más conversiones.
   - Si seleccionas "No" o "Cancelar", el programa se cerrará con un mensaje de despedida.

## Manejo de Errores

- Si ingresas un valor no válido o no numérico, se mostrará un mensaje de error y se te pedirá que ingreses nuevamente la cantidad.

## Dependencias

El proyecto utiliza las siguientes dependencias:

- [Apache HttpClient](https://hc.apache.org/httpcomponents-client-5.1.x/): Para realizar solicitudes HTTP a la API de tasas de cambio.
- [JSON-java](https://github.com/stleary/JSON-java): Para analizar y manipular los datos JSON de la respuesta de la API.
- [JOptionPane](https://docs.oracle.com/en/java/javase/14/docs/api/javax/swing/JOptionPane.html): Para mostrar cuadros de diálogo en la interfaz de usuario.

## Créditos

- Este programa fue creado por Darío Guerrero.
- Utiliza datos de tasas de cambio en tiempo real proporcionados por exchangerate-api.com.

## Licencia

Este programa se distribuye bajo la licencia DG. Puedes encontrar más detalles en el archivo LICENSE.
