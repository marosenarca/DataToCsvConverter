/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MaRose
 */
public class Utils {

    public static ArrayList<Tuple> readFile(String fname) {
        ArrayList<Tuple> table = new ArrayList<>();

        try (InputStream is = Utils.class.getResourceAsStream("/resources/2011_Jan-Dec.txt");
        BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
            String line;
            DateFormat df = new SimpleDateFormat("dd MMMM yyyy - HH:mm");

            while ((line = r.readLine()) != null) {
                String[] ln = line.split(";");
                Date dt = df.parse(ln[0]);
                double lat = Double.valueOf(ln[1]);
                double lon = Double.valueOf(ln[2]);
                double dp =  Double.valueOf(ln[3]);
                double mg = Double.valueOf(ln[4]);
                String loc = ln[5];
                
                System.out.println(dt);
                table.add(new Tuple(dt, lat, lon, dp, mg, loc));
            }
        } catch (IOException | ParseException e) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, e);
        }
        return table;
    }

//    public static void main(String[] args) {
//        ArrayList<Tuple> tab = readFile("2011_Jan-Dec.txt");
//        for(Tuple t: tab) {
//            System.out.println(t.getDate());
//        }
//    }
}
