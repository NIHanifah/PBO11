/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayProcessing {
    
    
    int[] dataBil = new int[100];
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data: ");
        this.n = input.nextInt();
        dataBil = new int[n];
        for(int i=0; i<this.n; i++){
            System.out.print("Masukkan bil ke-" + (i+1) +": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for (int i =0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMax(int[] data){
        int max = dataBil[0];
        for(int i=0; i<dataBil.length; i++){
            if (dataBil[i] > max){
                max = dataBil[i];
            }
        }
        return max;
    }
    
    int cariMin(int[] data){
        int min = dataBil[0];
        for(int i=0; i<this.n; i++){
            if (dataBil[i] < min){
                min = dataBil[i];
            }
        }
        return min;
    }
    void output(){
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Max: " + this.cariMax(this.dataBil));
        System.out.println("Nilai Min: " + this.cariMin(this.dataBil));
        System.out.print("Urutan: " );
        System.out.println(Arrays.toString(this.urutkan(this.dataBil)));
        
    }
    
    
    int[] urutkan(int[] data){
        for(int i = 0; i<this.n; i++){
            for(int j = 0; j<this.n-1-i; j++){
                if (data[j] > data[j+1]){
                    int a = data[j];
                    data[j] = data[j+1];
                    data[j+1] = a;
                }
            }
        }
        return data;
    }
    
}
