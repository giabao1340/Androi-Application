package com.example.qlsanbong;

import java.util.ArrayList;
import java.util.List;

public class DSKhungGio {
    public static List<KhungGio> getKhungGio( ) {
        KhungGio time1 = new KhungGio(1,"7h - 9h");
        KhungGio time2 = new KhungGio(2,"10h - 12h");
        KhungGio time3 = new KhungGio(3,"13h - 15h");
        KhungGio time4 = new KhungGio(4,"16h - 18h");
        KhungGio time5 = new KhungGio(5, "19h -21h");

        List<KhungGio> list = new ArrayList<KhungGio>();
        list.add(time1);
        list.add(time2);
        list.add(time3);
        list.add(time4);
        list.add(time5);
        return list;
    }
}