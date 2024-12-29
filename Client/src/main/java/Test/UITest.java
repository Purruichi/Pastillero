package Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import ui.mainWindow.mainWindow;

class UITest {

    @Mock
    private JButton mockButton;

    @Mock
    private JLabel mockLabel;

    private mainWindow mainWindow;  // Suponiendo que la clase principal de la UI es 'MainWindow'

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mainWindow = new mainWindow();  // Suponiendo que el constructor de MainWindow inicializa todo
    }

    @Test
    void testButtonClick() {
        // Simula el clic en un botón
        ActionEvent actionEvent = mock(ActionEvent.class);

        // Suponiendo que el botón en el UI cambia el texto del JLabel
        mainWindow.someButtonAction(actionEvent);  // Método que maneja el clic en el botón

        verify(mockLabel).setText("New Text after Button Click");  // Verifica si el JLabel fue actualizado correctamente
    }

    @Test
    void testWindowVisibility() {
        mainWindow.setVisible(true);  // Hacer visible la ventana
        assertTrue(mainWindow.isVisible());  // Verificar que la ventana es visible

        mainWindow.setVisible(false);  // Hacer invisible la ventana
        assertFalse(mainWindow.isVisible());  // Verificar que la ventana es invisible
    }


}

