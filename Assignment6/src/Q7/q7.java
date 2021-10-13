package Q7;

import java.io.IOException;

public class q7 {
    public void finalize() {
        System.out.println("garbage collection done!");
    }
    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        q7 obj = new q7();
        obj = null;
        System.gc();
        try {
            r1.exec("notepad");//will open a new notepad
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            r1.exec("C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\powershell.exe New-Item ./mythread.java");//will create mythread.java
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
