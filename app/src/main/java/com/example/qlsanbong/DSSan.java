package com.example.qlsanbong;
import java.util.ArrayList;
import java.util.List;
public class DSSan {
    public static List<San> getSan( ) {
        San sanA = new San(1,"Sân A");
        San sanB = new San(2,"Sân B");
        San sanC = new San(3,"Sân C");
        San sanD = new San(4,"Sân D");
        San sanE = new San(5, "Sân E");

        List<San> list = new ArrayList<San>();
        list.add(sanA);
        list.add(sanB);
        list.add(sanC);
        list.add(sanD);
        list.add(sanE);
        return list;
    }
}
