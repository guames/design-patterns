package patterns.structural.adapter;

import patterns.structural.adapter.interfaces.PayD;
import patterns.structural.adapter.interfaces.Xpay;
import patterns.structural.adapter.model.XpayImpl;
import patterns.structural.adapter.model.XpayToPayDAdapter;

public class RunAdapter {

    /**
     * The problem that arises here is that the site is attached to the Xpay payment gateway which takes an Xpay type of object. The
     * new vendor, PayD, only allows the PayD type of objects to allow the process. Max doesn’t want to change the whole set of 100
     * of classes which have reference to an object of type XPay. This also raises the risk on the project, which is already running on the
     * production. Neither he can change the 3rd party tool of the payment gateway. The problem has occurred due to the incompatible
     * interfaces between the two different parts of the code. In order to get the process work, Max needs to find a way to make the
     * code compatible with the vendor’s provided API.
     * @param args
     */
    public static void main(String[] args) {

        // Object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}