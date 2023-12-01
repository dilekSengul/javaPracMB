package day06;

import java.util.ArrayList;
import java.util.List;

public class P05_List {
    /*
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {

       List<String> isimList=new ArrayList<>();
       isimList.add("Ali");
       isimList.add("Veli");
       isimList.add("Ayse");
       isimList.add("Fatma");
       isimList.add("Omer");
        System.out.println(isimList);
        List<String> newList=new ArrayList<>();
        for (String a:isimList){
         if (!a.toLowerCase().contains("a")){
             newList.add(a);
         }
    }
        System.out.println("Yeni Oluşan Liste: "+newList);

}}

