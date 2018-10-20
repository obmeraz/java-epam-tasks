package com.company;


public class Main {

    public static void main(String[] args) {
        int age = UserInput.inputValue();
        int resultHeads = DragonLogic.calculateHeads(age);
        int resultEyes = DragonLogic.calculateEyes(resultHeads);
        Output.print(resultHeads);
        Output.print(resultEyes);
    }
}
