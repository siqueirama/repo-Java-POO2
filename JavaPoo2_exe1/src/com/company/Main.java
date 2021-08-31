package com.company;

public class Main {

    public static void main(String[] args) {

            String city[] = new String[10];
            city[0] = "Londres";
            city[1] = "Madrid";
            city[2] = "Nova York";
            city[3] = "Buenos Aires";
            city[4] = "Assuncion";
            city[5] = "Sao Paulo";
            city[6] = "Lima";
            city[7] = "Santiago de Chile";
            city[8] = "Lisboa";
            city[9] = "Tokio";

            int temp[][] = {
                    {-02, 33},
                    {-03, 32},
                    {-07, 27},
                    { 04, 37},
                    { 06, 42},
                    { 05, 43},
                    { 00, 39},
                    {-07, 26},
                    {-01, 31},
                    {-10, 35}
            };

            int tempMax = temp[0][0], tempMin = temp[0][0];
            int posmin = 0, posmax = 0;

            for (int i = 0; i < 10; i++){
                if (temp[i][0] < tempMin){
                    tempMin = temp[i][0];
                    posmin = i;
                }
            }

            for (int j = 0; j < 10; j++){
                if (temp[j][1] > tempMax){
                    tempMax = temp[j][1];
                    posmax = j;
                }
            }

            System.out.println("A cidade mais fria: " + city[posmin]);
            System.out.println("A cidade mais quente: " + city[posmax]);
        }
    }

