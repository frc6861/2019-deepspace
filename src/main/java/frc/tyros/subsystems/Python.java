package frc.tyros.subsystems;

import java.io.*;
//import java.util.Arrays;

public class Python {

    /**
     * 
     * @param args
     * 
     */
    public static void main(String[] args){
        try{
            String pythonCode = "C:/Robotics/PythonProgramming/Add.py";
            //String pythonExe = "C:/Users/Festus/AppData/Local/Programs/Python/Python37-32/python.exe";
            ProcessBuilder pb = new ProcessBuilder("python ", pythonCode);
            Process p = pb.start();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            System.out.println("Running Python starts: " + line);
            int exitCode = p.waitFor();
            System.out.println("Exit Code : "+exitCode);
            line = bfr.readLine();
            System.out.println("First Line: " + line);
            while ((line = bfr.readLine()) != null){
                System.out.println("Python Output: " + line);


            }

        }catch(Exception e){System.out.println(e);}
    }

}