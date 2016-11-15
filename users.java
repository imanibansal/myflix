package movierec;

/**
 *
 * @author Imani
 */

import java.util.*;

public class Users {
    
   static FileIO reader = new FileIO();
   
  static String[][] users = Utils.stringData2Array(reader.load("C:\\Users\\Imani\\Desktop\\ratings1.csv"));

  
  public static String getGender(int userID)
  {
    String[] user = users[userID - 1];
    return user[2];
  }
}
