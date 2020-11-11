/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocontaminacionretrofit;

import java.util.List;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author FPMananaA
 */
public class ClasePrincipal extends Application implements PedirDatosContaminacion.Actualizar{
    Stage ventana=null;
    public static void main(String[] args) {
       launch();
    }

    @Override
    public void actualizarDatos(Datos d) {
        //En este método ya con losdatos, crearé la ventana
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                VBox v=new VBox(20);
                Button b=new Button("Boton");
                v.getChildren().add(b);
                List<Estacion> lista_estaciones=d.getData();
                for(Estacion e:lista_estaciones)
                {
                    Label l=new Label(e.toString());
                    l.setMinWidth(150);
                    l.setWrapText(true);
                    v.getChildren().add(l);

                }
                Scene s=new Scene(v, 500, 300);
                ventana.setScene(s);
                ventana.show();
            }
        });
        
                
    }

    public static void actualizar(Datos d)
    {
        System.out.println("DATOS: "+d);
    }

    @Override
    public void start(Stage stage) throws Exception {
       ventana=stage;
      // ClasePrincipal p=new ClasePrincipal();
       PedirDatosContaminacion pedirdatos=new PedirDatosContaminacion(this);
       pedirdatos.pedirDatos();
    }
    
    

  
}
