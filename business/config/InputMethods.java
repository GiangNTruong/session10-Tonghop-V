package BaitapVeNhaTongHop.business.config;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * <p><b><u}>Description detail</u></b> </p>
 * <p>getString()       ==>> Return a string value from the user.</p>
 * <p>getChar()         ==>> Return a character value from the user</p>
 * <p>getBoolean()	    ==>> Return a boolean value from the user.</p>
 * <p>getByte()	        ==>> Return a byte value from the user.</p>
 * <p>getShort()	    ==>> Return a short value from the user.</p>
 * <p>getInteger()	    ==>> Return a integer value from the user.</p>
 * <p>getLong()	        ==>> Return a long value from the user.</p>
 * <p>getFloat()	    ==>> Return a float value from the user.</p>
 * <p>getDouble()	    ==>> Return a double value from the user.</p>
 */
public final class InputMethods {
    private static final String INPUT_ALERT_NUMBEREMPLOYEE = "+++ Nhập thêm số nhan viên  :";
    private static final String INPUT_ALERT_NAMEEMPLOYEE = "Nhập tên nhân viên muốn thêm  :  ";
    private static final String INPUT_ALERT_BIRTH = "Nhập ngày sinh nhân vien : ";
    private static final String INPUT_ALERT_ADDRESSEMPLOYEE = "Nhập địa chỉ nhân viên :";
    private  static final String INPUT_ALERT_PHONEEMPLOYEE = "Nhập số điện thoại" ;
    private static final String INPUT_ALERT_SALARYEMPLOYEE = "Nhập lương nhân viên :";
    private static final String INPUT_ALERT_KPIEMPLOYEE = "Nhập KPI";

    private static final String ERROR_ALERT = "===>> Định dạng không hợp lệ, hoặc ngoài phạm vi! Vui lòng thử lại....";
    private static final String ERROR_DATE = "===>> Định dạng không hợp lệ (dd/MM/yyyy)! Vui lòng thử lại....";
    private static final String EMPTY_ALERT = "===>> Trường nhập vào không thể để trống! Vui lòng thử lại....";
    /*========================================Input Method Start========================================*/

    public static byte getNumberEmployee(){
        System.out.println(INPUT_ALERT_NUMBEREMPLOYEE);
        return getByte();
    }
    public static Date getBirthEmployee(){
        System.out.println(INPUT_ALERT_BIRTH);
        return getDate();
    }
    public static String getAddressEmployee(){
        System.out.println(INPUT_ALERT_ADDRESSEMPLOYEE);
        return getString();
    }
    public static String getPhoneEmployee(){
        System.out.println(INPUT_ALERT_PHONEEMPLOYEE);
        return getString();
    }
    public static double getSalaryEmployee(){
        System.out.println(INPUT_ALERT_SALARYEMPLOYEE);
        return getDouble();
    }
    public static double getKPIEmployee(){
        System.out.println(INPUT_ALERT_KPIEMPLOYEE);
        return getDouble();
    }

    public static String getNameEmployee(){
        System.out.println(INPUT_ALERT_NAMEEMPLOYEE);
        return getString();
    }
    /**
     * getString()  Return a String value from the user.
     */
    public static String getString() {
        while (true) {
            String result = getInput();
            if (result.equals("")) {
                System.err.println(EMPTY_ALERT);
                continue;
            }
            return result;
        }
    }

    /**
     * getChar()  Return a Character value from the user.
     */
    public static char getChar() {
        return getString().charAt(0);
    }

    /**
     * getBoolean()  Return a Boolean value from the user.
     */
    public static boolean getBoolean() {
        String result = getString();
        return result.equalsIgnoreCase("true");
    }

    /**
     * getByte()  Return a Byte value from the user.
     */
    public static byte getByte() {
        while (true) {
            try {
                return Byte.parseByte(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getShort()  Return a Short value from the user.
     */
    public static short getShort() {
        while (true) {
            try {
                return Short.parseShort(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getInteger()  Return a Integer value from the user.
     */
    public static int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getLong()  Return a Long value from the user.
     */
    public static long getLong() {
        while (true) {
            try {
                return Long.parseLong(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getFloat()  Return a Float value from the user.
     */
    public static float getFloat() {
        while (true) {
            try {
                return Float.parseFloat(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }

    /**
     * getDouble()  Return a Double value from the user.
     */
    public static double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException errException) {
                System.err.println(ERROR_ALERT);
            }
        }
    }
    /*========================================Input Method End========================================*/

    /**
     * getInput()  Return any String value from the user.
     */
    private static String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Nhap ngay thang : dd/MM/yyyy
     */
    public static Date getDate(){

        while (true) {
            try {
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                return sf.parse(getInput());
            } catch (ParseException errException) {
                System.err.println(ERROR_DATE);
            }
        }
    }

    /**
     * pressAnyKey()  Press any key to continue....
     */
    public static void pressAnyKey() {
        getInput();
    }
    /*========================================Other Method========================================*/
}