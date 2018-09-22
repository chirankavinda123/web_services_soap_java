/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author udawalah_im13057
 */
public class DbTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DatabaseConnect dbc = new DatabaseConnect();
        try {
            dbc.getData("fd", "fde", "sdd");
        } catch (SQLException ex) {
            Logger.getLogger(DbTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
