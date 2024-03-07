package task1.runner;

import task1.path.WorkWithFiles;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        try {
            WorkWithFiles.strings();
        } catch (IOException ignored) {

        }
    }
}
