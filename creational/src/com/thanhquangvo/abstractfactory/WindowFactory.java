package com.thanhquangvo.abstractfactory;

public class WindowFactory implements OSFactory {
    @Override
    public String provideBrowser() {
        return "Microsoft Edge";
    }

    @Override
    public String provideShell() {
        return "cmd";
    }
}
