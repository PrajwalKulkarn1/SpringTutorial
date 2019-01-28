package in.moneyview;
import javafx.beans.property.Property;

import java.util.*;

public class HelloWorld {
    Set addressSet;
    List addressList;
    Map addressMap;
    Properties address;

    public Set getAddressSet() {
        System.out.println("Address set: "+addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public List getAddressList() {
        System.out.println("Address List: "+addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Map getAddressMap() {
        System.out.println("Address Map: "+addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddress() {
        return address;
    }

    public void setAddress(Properties address) {
        System.out.println("Address Property: "+address);
        this.address=address;
    }
}
