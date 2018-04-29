package com.thelittlefireman.appkillermanager.utils;

public enum Manufacturer {
    XIAOMI("xiaomi"),
    SAMSUNG("samsung"),
    OPPO("oppo"),
    HUAWEI("huawei"),
    MEIZU("meizu"),
    VIVO("vivo");

    private final String name;

    private Manufacturer(String device){
        name = device;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
