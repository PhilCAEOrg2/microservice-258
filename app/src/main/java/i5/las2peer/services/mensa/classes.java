package i5.las2peer.services.mensa;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class Rating {

    public Rating() {}
    
    private String user;

    public void setuser(String setValue) {
        this.user = setValue;
    }

    public String getuser() {
        return this.user;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("user", this.user); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.user = (String) jsonObject.get("user"); 

    }

}

    
}
