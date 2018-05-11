package eu.mvmo.tacodb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Test {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 22522);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        out.write("get id=1\n");
        out.flush();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String r;
        while ((r = in.readLine()) != null) {
            System.out.println(r);
        }
    }

}
