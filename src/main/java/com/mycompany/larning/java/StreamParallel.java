package com.mycompany.larning.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamParallel {
    public static void main(String[] args) throws IOException {
        colecaoStrem();
        colecacoParallelStream();
    }

    //2s
    private static void colecacoParallelStream() {

        List<String> valores = new ArrayList<>();

        int max = 1_000_000;
        for (int i = 0; i < max; i++) {
            valores.add("=>" + i);
        }

        long t0 = System.currentTimeMillis();
        valores.parallelStream().forEach(System.out::println);
        long t1 = System.currentTimeMillis();
        System.out.println("Tempo total: " + (t1 - t0) / 1000.0 + " segundos ");

    }
    //1s
    private static void colecaoStrem() {
        List<String> valores = new ArrayList<>();

        int max = 1_000_000;
        for (int i = 0; i < max; i++) {
            valores.add("=>" + i);
        }

        long t0 = System.currentTimeMillis();
        valores.stream().forEach(System.out::println);
        long t1 = System.currentTimeMillis();
        System.out.println("Tempo total: " + (t1 - t0) / 1000.0 + " segundos ");
    }

    //3s
    public static void testBufferedPrint() throws IOException {
        long temiInit = System.currentTimeMillis();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        IntStream.range(0, 10_000_000).forEach(i -> {
            try {
                writer.write(i + "\n");  // Armazena na memória antes de imprimir
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.flush();  // Escreve tudo de uma vez no console

        long temiFinal = System.currentTimeMillis();
        System.out.println("Tempo total: " + (temiFinal - temiInit) / 1000.0 + " segundos ");
    }
    //4s
    public static void testStringBuilder() {
        long temiInit = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 10_000_000).forEach(i -> sb.append(i).append("\n"));

        System.out.print(sb.toString()); // Imprime tudo de uma vez

        long temiFinal = System.currentTimeMillis();
        System.out.println("Tempo total: " + (temiFinal - temiInit) / 1000.0 + " segundos ");
    }
    //9s
    public static void test() {
        List<Integer> integers = new ArrayList<>();
        long temiInit = System.currentTimeMillis();
        System.out.println("Tempo inicial: " + temiInit);
       for(int i = 0; i < 10_000_000; i++) {
           integers.add(i);
       }

         for(Integer i : integers) {
              System.out.println(i);

         }

        long temiFinal = System.currentTimeMillis();

        System.out.println("Tempo final: " + temiFinal);
        System.out.println("Tempo total: " + (temiFinal - temiInit)/1000 + " segundos ");
    }
    //9s
    public static void testParallel() {
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());

        long temiInit = System.currentTimeMillis();

        IntStream.range(0, 10000000).parallel().forEach(i -> integers.add(i));

        integers.forEach(System.out::println);
        long temiFinal = System.currentTimeMillis();

        System.out.println("Tempo total: " + (temiFinal - temiInit)/1000 + " segundos ");
    }
}
