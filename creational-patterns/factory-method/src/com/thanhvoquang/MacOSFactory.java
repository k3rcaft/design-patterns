package com.thanhvoquang;

public class MacOSFactory implements OSFactory{
    @Override
    public String provideBrowser() {
        return "Safari";
    }

    @Override
    public String provideShell() {
        return "bash";
    }
}
