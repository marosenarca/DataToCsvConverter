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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MaRose
 */
public class DataToCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Tuple> table = new ArrayList<>();
        ArrayList<String> filenames = new ArrayList<>();

        try (InputStream is = DataToCsv.class.getResourceAsStream("/resources/filenames.txt");
                BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
            String fname;
            while ((fname = r.readLine()) != null) {
                filenames.add(fname);
            }

        } catch (IOException e) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, e);
        }

        for (String fn : filenames) {
            table.addAll(Utils.readFile(fn));
        }
    }

}
