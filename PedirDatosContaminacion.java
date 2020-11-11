/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocontaminacionretrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author FPMananaA
 */
public class PedirDatosContaminacion {
    private  Actualizar d;

    public PedirDatosContaminacion(Actualizar d) {
        this.d = d;
    }
    
  public  void pedirDatos()
  {
         Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("http://datos.comunidad.madrid/").addConverterFactory(GsonConverterFactory.create())
    .build();

    ServicioContaminacion service = retrofit.create(ServicioContaminacion.class);
    Call<Datos> datos=service.recuperarDatos();
    datos.enqueue(new Callback<Datos>() {
             @Override
             public void onResponse(Call<Datos> call, Response<Datos> rspns) {
               d.actualizarDatos(rspns.body());
               //ClasePrincipal.actualizar(rspns.body());
             }

             @Override
             public void onFailure(Call<Datos> call, Throwable thrwbl) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
    });
    
  }
  public interface Actualizar
  {
      public void actualizarDatos(Datos d);
  }
}
