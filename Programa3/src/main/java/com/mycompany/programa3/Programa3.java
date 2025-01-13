/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
Nombre del programa: Programa3
Autor: Cristian Flores Aguero
Fecha: 12/May/2023
*/

package com.mycompany.programa3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gsero
 */
public class Programa3 {

    public static void main(String[] args) throws IOException{
        File archivo = new File("C:\\Users\\gsero\\OneDrive\\Documents\\NetBeansProjects\\Programa3\\src\\main\\java\\com\\mycompany\\programa3\\betas3b.csv");
        FileReader fileReader = new FileReader(archivo);
    
        String lectorlinea;
       
        try {
            BufferedReader br = new BufferedReader(fileReader);
            lectorlinea = br.readLine();
            
            int n = 0;
            while (br.readLine() != null) {
                n++;
            }
            br.close();
            fileReader = new FileReader(archivo);
            br = new BufferedReader(fileReader);
             lectorlinea = br.readLine();
            
            float[] X1 = new float[n];
            float[] Y1 = new float[n];
            
            float[] X2 = new float[n];
            float[] Y2 = new float[n];
            
            float[] X3 = new float[n];
            float[] Y3 = new float[n];
            
            float[] X4 = new float[n];
            float[] Y4 = new float[n];
            int cont =0;
            
            
            String pr = null;
           
            lectorlinea = br.readLine();
            while (lectorlinea != null){
                String datos[] = lectorlinea.split(",");
              
                X1[cont] = Float.parseFloat(datos[1]);
                Y1[cont] = Float.parseFloat(datos[3]);
                
                X2[cont] = Float.parseFloat(datos[1]);
                Y2[cont] = Float.parseFloat(datos[4]);
                
                X3[cont] = Float.parseFloat(datos[2]);
                Y3[cont] = Float.parseFloat(datos[3]);
                
                X4[cont] = Float.parseFloat(datos[2]);
                Y4[cont] = Float.parseFloat(datos[4]);
                
                
                cont = cont+1;
                
                lectorlinea = br.readLine();
                
            }
            Datos operaciones = new Datos();
            
            float Xavg_par1=operaciones.CalcularPromedio(X1);
            float Yavg_par1=operaciones.CalcularPromedio(Y1);
            float sumaXY_par1= operaciones.calcularSumaXY(X1, Y1);
            float sumaX2_par1 = operaciones.calcularSumaX2(X1);
            float nXavgYavg_par1 = operaciones.calcularnXavgYavg(n, Xavg_par1, Yavg_par1);
            float nXavgXavg_par1= operaciones.calcularnXavgXavg(n, Xavg_par1);
            float beta1_par1 = operaciones.calcularBeta1(sumaXY_par1, nXavgYavg_par1, sumaX2_par1, nXavgXavg_par1);
            float beta0_par1 = operaciones.calcularBeta0(Yavg_par1, beta1_par1, Xavg_par1);
            float estimatedYk_par1 = operaciones.calcularEstimatedYk(beta0_par1, beta1_par1);
            
            float Xavg_par2=operaciones.CalcularPromedio(X2);
            float Yavg_par2=operaciones.CalcularPromedio(Y2);
            float sumaXY_par2= operaciones.calcularSumaXY(X2, Y2);
            float sumaX2_par2 = operaciones.calcularSumaX2(X2);
            float nXavgYavg_par2 = operaciones.calcularnXavgYavg(n, Xavg_par2, Yavg_par2);
            float nXavgXavg_par2= operaciones.calcularnXavgXavg(n, Xavg_par2);
            float beta1_par2 = operaciones.calcularBeta1(sumaXY_par2, nXavgYavg_par2, sumaX2_par2, nXavgXavg_par2);
            float beta0_par2 = operaciones.calcularBeta0(Yavg_par2, beta1_par2, Xavg_par2);
            float estimatedYk_par2 = operaciones.calcularEstimatedYk(beta0_par2, beta1_par2);
            
            float Xavg_par3=operaciones.CalcularPromedio(X3);
            float Yavg_par3=operaciones.CalcularPromedio(Y3);
            float sumaXY_par3= operaciones.calcularSumaXY(X3, Y3);
            float sumaX2_par3 = operaciones.calcularSumaX2(X3);
            float nXavgYavg_par3 = operaciones.calcularnXavgYavg(n, Xavg_par3, Yavg_par3);
            float nXavgXavg_par3= operaciones.calcularnXavgXavg(n, Xavg_par3);
            float beta1_par3 = operaciones.calcularBeta1(sumaXY_par3, nXavgYavg_par3, sumaX2_par3, nXavgXavg_par3);
            float beta0_par3 = operaciones.calcularBeta0(Yavg_par3, beta1_par3, Xavg_par3);
            float estimatedYk_par3 = operaciones.calcularEstimatedYk(beta0_par3, beta1_par3);
            
            float Xavg_par4=operaciones.CalcularPromedio(X4);
            float Yavg_par4=operaciones.CalcularPromedio(Y4);
            float sumaXY_par4= operaciones.calcularSumaXY(X4, Y4);
            float sumaX2_par4 = operaciones.calcularSumaX2(X4);
            float nXavgYavg_par4 = operaciones.calcularnXavgYavg(n, Xavg_par4, Yavg_par4);
            float nXavgXavg_par4= operaciones.calcularnXavgXavg(n, Xavg_par4);
            float beta1_par4 = operaciones.calcularBeta1(sumaXY_par4, nXavgYavg_par4, sumaX2_par4, nXavgXavg_par4);
            float beta0_par4 = operaciones.calcularBeta0(Yavg_par4, beta1_par4, Xavg_par4);
            float estimatedYk_par4 = operaciones.calcularEstimatedYk(beta0_par4, beta1_par4);
            
           
            System.out.println("Par 1:     Beta0: " + beta0_par1 + "     beta1: " + beta1_par1 + "     EstimatedYk: " + estimatedYk_par1);
            System.out.println("Par 2:     Beta0: " + beta0_par2 + "     beta1: " + beta1_par2 + "     EstimatedYk: " + estimatedYk_par2);
            System.out.println("Par 3:     Beta0: " + beta0_par3 + "     beta1: " + beta1_par3 + "     EstimatedYk: " + estimatedYk_par3);
            System.out.println("Par 4:     Beta0: " + beta0_par4 + "     beta1: " + beta1_par4 + "     EstimatedYk: " + estimatedYk_par4);
            
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Programa3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}