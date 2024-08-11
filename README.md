# PruebaIlana Automation Project

Este proyecto contiene pruebas automatizadas utilizando Serenity BDD, Selenium, y JUnit.

## Tecnologías Utilizadas

- **Serenity BDD**: 3.9.0
- **JUnit**: 4.13.2
- **WebDriverManager**: 5.0.1
- **Selenium**: 4.10.0
- **Maven**: Para la gestión de dependencias y la construcción del proyecto.

## Estructura del Proyecto

- **src/main/java**: Contiene el código fuente principal del proyecto.
- **src/test/java**: Contiene las pruebas automatizadas escritas en Java utilizando Serenity y JUnit.
- **pom.xml**: Archivo de configuración de Maven, donde se encuentran definidas las dependencias y plugins necesarios para la ejecución del proyecto.

## Compilación y Ejecución

Para compilar y ejecutar las pruebas automatizadas, sigue los siguientes pasos:

1. **Clona el repositorio**:
    ```bash
    git clone <url-del-repositorio>
    cd <nombre-del-repositorio>
    ```

2. **Compila el proyecto**:
    ```bash
    mvn clean install
    ```

3. **Ejecución de pruebas**:
    ```bash
    mvn verify
    ```

## Consideraciones

- **Captcha**: Durante las pruebas en el sitio Despegar.com.co, se ha identificado la aparición de un Captcha que impide la ejecución completa de las pruebas automatizadas. Es posible que se requiera intervención manual o ajustes adicionales para sortear esta validación.

## Cómo Contribuir

Si deseas contribuir a este proyecto, realiza un fork del repositorio y envía un pull request con tus cambios.
