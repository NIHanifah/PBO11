/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class DataList {
    
    ArrayList<Integer> dataBil = new ArrayList<Integer>();
    
    void input(){      
        Scanner input = new Scanner(System.in);
        Scanner cari = new Scanner(System.in);
        Scanner hapus = new Scanner(System.in);
        int x = 0;
        while(x == 0){
            System.out.println("Menu data ArrayList :");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih nomor berapa :");
            int bil = input.nextInt();
            switch(bil){
                case 1:
                    System.out.print("Masukkan data Integer : ");
                    this.dataBil.add(input.nextInt());
                    System.out.print("Daftar string dalam array list: "+ this.dataBil);
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                case 2:
                    System.out.print("String yang mau dicari:  ");
                    int diCari = cari.nextInt();
                    if(this.dataBil.contains(diCari)){
                        System.out.println("String " + diCari +  " ada di index ke " + dataBil.indexOf(diCari) + " di dalam data");
                        try{System.in.read();}
                        catch(IOException e){}
                    } else{
                        System.out.println("String "+ diCari +" tidak ada dalam data");
                        try{System.in.read();}
                        catch(IOException e){}
                    }
                    break;
                case 3:
                    System.out.print("String yang mau dihapus: ");
                    int diHapus = hapus.nextInt();
                    if(this.dataBil.contains(diHapus)){
                        dataBil.remove(new Integer(diHapus));
                        System.out.println("String " + diHapus + " sudah dihapus di dalam data");
                    } else{
                        System.out.println("String " + diHapus + " tidak ada dalam data");
                    }
                    System.out.print("Daftar string dalam array list: "+ this.dataBil);
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                case 4:
                    System.out.print("Daftar string dalam array list: "+this.dataBil);
                    try{System.in.read();}
                    catch(IOException e){}
                    break;
                case 5:
                    x = 1;
                    break;
                default:
                    x=1;
                    break;
            }
        }
    }
    
    double hitung(ArrayList<Integer> data){
        double sum = 0;
        for (Integer item: data){
            sum += item;
        }
        double rerata = sum/data.size();
        return rerata;
    }
    
 
}
