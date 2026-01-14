# Outfit Planner

**Outfit Planner** es una solución integral de gestión de guardarropa diseñada para optimizar la toma de decisiones diaria mediante la digitalización de prendas, la planificación de atuendos y el uso de Inteligencia Artificial para la clasificación automatizada de inventario.

El proyecto resuelve el problema de la fatiga de decisión y la gestión ineficiente del tiempo mediante un sistema de calendario programable y un motor de procesamiento de imágenes que automatiza la entrada de datos.

---

## 🚀 Características Principales

* **Gestión de Inventario Digital:** Registro y categorización de prendas (pantalones, chaquetas, calzado, etc.) con metadatos técnicos.
* **Clasificación mediante IA (Computer Vision):** Integración con modelos de procesamiento de imágenes para identificar automáticamente el tipo de prenda y su color primario a partir de una fotografía.
* **Generador de Outfits:** Motor de lógica para combinar objetos del guardarropa y crear conjuntos completos (pintas).
* **Planificador de Calendario:** Programación de atuendos por fecha, permitiendo al usuario delegar la decisión diaria al dispositivo.
* **Arquitectura Desacoplada:** Backend robusto para el procesamiento pesado y almacenamiento persistente de datos.

## 🛠️ Stack Tecnológico

### Frontend (Mobile)
| Componente | Tecnología | Versión |
| :--- | :--- | :--- |
| **Lenguaje** | Java | JDK 17 (LTS) |
| **IDE** | Android Studio | Ladybug 2024.2.1 |
| **SDK** | Android SDK | Target API 34 (Android 14) |
| **Networking** | Retrofit / OkHttp | 2.9.0 |

### Backend & Data
| Componente | Tecnología | Versión |
| :--- | :--- | :--- |
| **Framework** | Django (REST Framework) | 4.2.7 (LTS) |
| **Lenguaje** | Python | 3.10.12 |
| **Base de Datos** | PostgreSQL | 15.4 |
| **Servidor WSGI** | Gunicorn | 21.2.0 |

### Inteligencia Artificial
| Componente | Tecnología | Versión |
| :--- | :--- | :--- |
| **Inferencia** | Hugging Face API | Transformers 4.35 |
| **Procesamiento** | Pillow / OpenCV | 10.1.0 |
| **Modelo** | ViT (Vision Transformer) | Pre-trained for Classification |

---

## 🏗️ Arquitectura del Sistema

El sistema implementa una arquitectura **Cliente-Servidor** con comunicación síncrona mediante una API RESTful.

1.  **Capa de Presentación:** Aplicación Android nativa que gestiona la interacción del usuario y la captura de imágenes.
2.  **Capa de Servicio (Backend):** API construida en Django que orquestra la lógica de negocio y la validación de datos.
3.  **Capa de Inferencia (AI):** El backend actúa como proxy hacia la infraestructura de **Hugging Face**, enviando los buffers de imagen y recibiendo etiquetas de clasificación mediante modelos de Deep Learning.
4.  **Capa de Persistencia:** PostgreSQL gestiona la integridad referencial de los usuarios, sus prendas y la programación del calendario.

## ⚙️ Configuración del Entorno

### Backend
1.  Clonar el repositorio:
    ```bash
    git clone [https://github.com/tu-usuario/outfit-planner-backend.git](https://github.com/tu-usuario/outfit-planner-backend.git)
    ```
2.  Configurar entorno virtual y dependencias:
    ```bash
    python -m venv venv
    source venv/bin/activate
    pip install -r requirements.txt
    ```
3.  Establecer variables de entorno en un archivo `.env`:
    * `DATABASE_URL`
    * `HF_API_TOKEN` (Hugging Face)
    * `DJANGO_SECRET_KEY`
4.  Ejecutar migraciones:
    ```bash
    python manage.py migrate
    python manage.py runserver
    ```

### Frontend (Android)
1.  Importar el proyecto en Android Studio.
2.  Asegurar que el `JAVA_HOME` apunte a JDK 17.
3.  Configurar la URL base de la API en `Constants.java` o `build.gradle`.
4.  Compilar y ejecutar mediante el Gradle Wrapper:
    ```bash
    ./gradlew installDebug
    ```

## 📊 Flujo de Datos: Registro con IA

1.  **Captura:** La app captura una imagen -> Conversión a Base64/Multipart.
2.  **Transmisión:** Petición POST al endpoint `/api/v1/process-image/`.
3.  **Procesamiento:** Django envía el payload a la API de Hugging Face.
4.  **Respuesta:** El modelo retorna un JSON con la categoría (ej. `apparel_type: jacket`) y confianza.
5.  **Persistencia:** Tras la validación del usuario, el registro se almacena en PostgreSQL.

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulte el archivo `LICENSE` para más información.

**Desarrollado por [Tu Nombre/Javi] - Data Engineering & Mobile Development.**
