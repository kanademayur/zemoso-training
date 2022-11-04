package isp;

public class NoObeyIsp implements MasterInterface {
    /* We have 2 classes and one Class only want to implements some of the method from the master interface
    and another one class want to implements all the methods from the master interface

    here the violation of Interface Segregation Principle
     */


    public static void main(String[] args) {



    }

    @Override
    public void creditCard() {

    }

    @Override
    public void debitcard() {

    }

    @Override
    public void netbanking() {

    }
}