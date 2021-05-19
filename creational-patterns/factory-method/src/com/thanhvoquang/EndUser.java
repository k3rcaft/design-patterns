package com.thanhvoquang;

public class EndUser {

    OSFactory osFactory;

    public static void main(String[] args) {
        EndUser endUser = new EndUser();
        endUser.buyMacBook();
        endUser.buySurface();
    }

    void buyMacBook() {
        osFactory = new MacOSFactory();
        System.out.println(osFactory.provideBrowser());
        System.out.println(osFactory.provideShell());
    }

    void buySurface() {
        osFactory = new WindowFactory();
        System.out.println(osFactory.provideBrowser());
        System.out.println(osFactory.provideShell());
    }
}
