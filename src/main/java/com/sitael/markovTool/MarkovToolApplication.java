package com.sitael.markovTool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJit;

@SpringBootApplication
public class MarkovToolApplication {

	public static void main(String[] args) {

        try (Lua L = new LuaJit()) {
            L.set("message", "Hello World from LuaJava");
            L.run("java.import('java.lang.System').out:println(message)");
            System.out.println("lua init");
        }

        SpringApplication.run(MarkovToolApplication.class, args);
	}

}
