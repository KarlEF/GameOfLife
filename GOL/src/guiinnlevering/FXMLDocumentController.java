/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinnlevering;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



/**
 *
 * @author Eier
 */
public class FXMLDocumentController implements Initializable{
    @FXML private Canvas gridCanvas;
    public GraphicsContext gc;
    
    @FXML private void drawGrid(ActionEvent event){
        gc.setFill(Color.BLACK);
        gc.fillRect(10,10,100,100);
        
        
    }

    
    
    @Override
    public void initialize(URL location, ResourceBundle resources){
        gc = gridCanvas.getGraphicsContext2D();
        
        //Grid Tegnes
        
        int cellSize = 10;
        for (int i = 0; i <= 400; i++) {
            gc.strokeLine(i * cellSize, 0, i * cellSize, 400 * cellSize);
            if (i <= 400)
                gc.strokeLine(0, i * cellSize, 400 * cellSize, i * cellSize);
        }

    }
    
    public void actionButtonStart(ActionEvent event){
        final GraphicsContext gc = gridCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, gridCanvas.getWidth(), gridCanvas.getHeight());
        
        gc.setFill(Color.BLACK);
        
        gc.strokeRect(10, 10, 10, 10);
    }
}




