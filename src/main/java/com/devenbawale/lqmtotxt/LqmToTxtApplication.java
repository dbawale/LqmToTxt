package com.devenbawale.lqmtotxt;

public class LqmToTxtApplication {

    public static void main(String[] args) {

        if (args.length != 1 || args[0] == null) {
            System.out.println("Incorrect number of arguments\n. Usage: lqmtotxtapplication <filename.lqm>");
            return;
        }

        if(!args[0].split("\\.")[1].equals("lqm")) {
            System.out.println("Incorrect file extension. The application can only read .lqm files");
            return;
        }

        System.out.println("Test");
    }

}
