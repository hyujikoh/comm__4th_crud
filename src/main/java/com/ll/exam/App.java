package com.ll.exam;

public class App {
    public static final String BASE_PACKAGE_PATH = "com.ll.exam";
    /*public static final String DB_HOST = "localhost";
    public static final int DB_PORT = 3306;
    public static final String DB_ID = "root";
    public static final String DB_PASSWORD = "";
    public static final String DB_NAME = "blog_08_04";*/


    public static String DB_HOST = "localhost";
    public static int DB_PORT = 3306;
    public static String DB_ID = "root";
    public static String DB_PASSWORD = "";
    public static String DB_NAME = "blog_08_04";
    public static boolean isProd = false;

    static {
        String profilesActive = System.getenv("SPRING_PROFILES_ACTIVE");

        if (profilesActive != null && profilesActive.equals("production")) {
            isProd = true;
        }

        if (isProd) {
            DB_HOST = "172.17.0.1";
            DB_PORT = 3306;
            DB_ID = "tigershrimp";
            DB_PASSWORD = "270227";
            DB_NAME = "site1";
        }
    }
}
