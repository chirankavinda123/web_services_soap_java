package com.wijesekara.carsalesoap;
import com.wijesekara.carsalesoap.DatabaseConnect;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chiran
 */
@WebService(serviceName = "carWebService")
public class carWebService {


    @WebMethod(operationName = "carAvailability")
    public String carAvailability(@WebParam(name = "brand") String brand, @WebParam(name = "model") String model, @WebParam(name = "year") String year) throws ClassNotFoundException {
               
        String reply="";
        
        DatabaseConnect dbCon = new DatabaseConnect();
        
        try {
            reply = dbCon.getData(brand, model, year);
            
        } catch (SQLException ex) {
            Logger.getLogger(carWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return reply;
    }
}
