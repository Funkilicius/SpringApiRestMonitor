package cl.kibernumacademy.apirest.controllers;

import cl.kibernumacademy.apirest.models.entity.Student;
import cl.kibernumacademy.apirest.models.services.IStudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class StudentRestControllerTest {

    @Mock
    private IStudentService studentService;

    @InjectMocks
    private StudentRestController studentRestController;

    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(studentRestController).build();
    }

    @Test
    public void testGetAllStudents() throws Exception {
        when(studentService.findAll()).thenReturn(Arrays.asList(new Student(), new Student()));
        mockMvc.perform(get("/api/students"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        verify(studentService, times(1)).findAll();
    }

    @Test
    public void testGetStudentById() throws Exception {
        Student student = new Student();
        student.setId(1L);
        when(studentService.findById(1L)).thenReturn(Optional.of(student));
        mockMvc.perform(get("/api/student/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        verify(studentService, times(1)).findById(1L);
    }

//   @Test
// public void testGetStudentByIdNotFound() throws Exception {
//     when(studentService.findById(1L)).thenReturn(Optional.empty());
//     mockMvc.perform(get("/api/student/1"))
//             .andExpect(status().isNotFound());
//     verify(studentService, times(1)).findById(1L);
// }

    // Continuar con pruebas para los métodos POST, PUT y DELETE.
}
