package com.devops;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("   DEVOPS CI/CD PIPELINE DEMO");
        System.out.println("===================================");

        System.out.println("Application Name : DevOps Demo App");
        System.out.println("Build Tool       : Maven");
        System.out.println("CI Server        : Jenkins");
        System.out.println("Repository       : GitHub");

        System.out.println("-----------------------------------");

        System.out.println("Build Status     : SUCCESS");
        System.out.println("Build Time       : " + LocalDateTime.now());

        System.out.println("-----------------------------------");
        System.out.println("Pipeline Flow:");

        System.out.println("1️⃣ Developer pushes code to GitHub");
        System.out.println("2️⃣ Jenkins pulls latest code");
        System.out.println("3️⃣ Maven compiles the project");
        System.out.println("4️⃣ Application deployed successfully");

        System.out.println("===================================");
        System.out.println(" CI/CD PIPELINE EXECUTED SUCCESS ");
        System.out.println("===================================");

    }
}
