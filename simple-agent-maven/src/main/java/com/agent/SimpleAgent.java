package com.agent;

import java.lang.instrument.Instrumentation;

public class SimpleAgent {

    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation ins) {
        System.out.println("Agent works!");
        instrumentation = ins;
    }

}
