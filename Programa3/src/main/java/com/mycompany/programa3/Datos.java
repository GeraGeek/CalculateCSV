/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa3;

/**
 *
 * @author gsero
 */
class Datos {
    
    public float CalcularPromedio(float[] conjunto){
       float suma = 0f;
       int cantidad = conjunto.length;
       for(int i=0; i<cantidad; i++){
          suma = suma+conjunto[i]; 
       }
       float promedio = suma/cantidad;
       
       return promedio;
   } 
   public float calcularSumaXY(float[] conjuntoX, float[] conjuntoY){
       float sumaXY=0f;
       int cantidadX=conjuntoX.length;
       int cantidadY=conjuntoY.length;
       for(int i=0; i<cantidadX && i<cantidadY; i++){
           float mul = conjuntoX[i] * conjuntoY[i];
           sumaXY = sumaXY + mul;
       }
       return sumaXY;
   }
   
   public float calcularSumaX2(float[] conjuntox){
       float sumaX2=0f;
       for (int i = 0; i < conjuntox.length; i++) {
             sumaX2 += conjuntox[i] * conjuntox[i];
         }
         return sumaX2;
   }
   
   public float calcularnXavgYavg(float n, float Xavg, float Yavg){
       float nXavgYavg = 0f;
       nXavgYavg = n * Xavg * Yavg;
       return nXavgYavg;  
   }
   
  public float calcularnXavgXavg(float n, float Xavg){
      float nXavgXavg=0f;
      
      nXavgXavg= n *(Xavg * Xavg);
      return nXavgXavg;
      
  }
  public float calcularBeta1(float sumaXY, float nXavgYavg, float sumaX2, float nXavgXavg){
      float beta1 = 0f;
      beta1 = (sumaXY - nXavgYavg) / (sumaX2-nXavgXavg);
      return beta1;
  }
  public float calcularBeta0(float Yavg, float beta1, float Xavg){
      float beta0 = 0f;
      beta0 = Yavg - (beta1 * Xavg);
      return beta0;
      
  }
  public float calcularEstimatedYk(float beta0, float beta1){
      float estimatedYk= 0f;
      
      estimatedYk = beta0 + (beta1*386);
      
      return estimatedYk;
  }
    
}

