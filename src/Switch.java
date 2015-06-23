import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by ITHILLEL6 on 23.06.2015.
 */
public class Switch {
    public static void main(String[] args) {
        int d = 3;
        switch (d){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Other day");
                break;

        }
        //System.out.println("End");
    }
}
