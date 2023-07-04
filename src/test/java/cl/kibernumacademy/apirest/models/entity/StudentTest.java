package cl.kibernumacademy.apirest.models.entity;  // Paquete de la entidad

// Importaciones necesarias para la prueba

import org.junit.jupiter.api.BeforeEach;  // Para anotar métodos que deben ejecutarse antes de cada prueba
import org.junit.jupiter.api.Test;  // Para anotar métodos que son pruebas

import static org.junit.jupiter.api.Assertions.*;  // Para importar métodos de aserción

public class StudentTest {  // Clase de prueba para Student

    private Student student;  // Variable de instancia para el objeto Student a probar

    // Método que se ejecuta antes de cada prueba
    @BeforeEach
    public void setUp() {
        student = new Student("Nombre", "Apellido", "correo@ejemplo.com");  // Crea un objeto Student para la prueba
    }

    // Prueba para el constructor
    @Test
    public void testConstructor() {
        assertNotNull(student);  // Verifica que el objeto Student no sea null
        assertEquals("Nombre", student.getName());  // Verifica que el nombre sea el esperado
        assertEquals("Apellido", student.getLastname());  // Verifica que el apellido sea el esperado
        assertEquals("correo@ejemplo.com", student.getEmail());  // Verifica que el correo electrónico sea el esperado
    }

    // Prueba para el método setId
    @Test
    public void testSetId() {
        student.setId(1L);  // Establece el ID del estudiante
        assertEquals(1L, student.getId());  // Verifica que el ID sea el esperado
    }

    // Prueba para el método setName
    @Test
    public void testSetName() {
        student.setName("NuevoNombre");  // Establece el nombre del estudiante
        assertEquals("NuevoNombre", student.getName());  // Verifica que el nombre sea el esperado
    }

    // Prueba para el método setLastName
    @Test
    public void testSetLastName() {
        student.setLastname("NuevoApellido");  // Establece el apellido del estudiante
        assertEquals("NuevoApellido", student.getLastname());  // Verifica que el apellido sea el esperado
    }

    // Prueba para el método setEmail
    @Test
    public void testSetEmail() {
        student.setEmail("nuevo@correo.com");  // Establece el correo electrónico del estudiante
        assertEquals("nuevo@correo.com", student.getEmail());  // Verifica que el correo electrónico sea el esperado
    }

    // Prueba para el método toString
    @Test
    public void testToString() {
        String expected = "Estudiante{" +
                "id=" + student.getId() +
                ", name='Nombre'" +
                ", lastname='Apellido'" +
                ", email='correo@ejemplo.com'" +
                '}';
        assertEquals(expected, student.toString());  // Verifica que la cadena sea la esperada
    }
}
