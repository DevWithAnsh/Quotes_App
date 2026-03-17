import java.io.*;
import java.util.*;
import com.sun.net.httpserver.*;

public class Code {
    public static void main(String[] args) throws Exception {
        List<String> tasks = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) tasks.add(line);
        }
        reader.close();

        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8000), 0);
        server.createContext("/", exchange -> {
            Random random = new Random();
            String task = tasks.get(random.nextInt(tasks.size()));
            String response = "<h1>Your Task for Today:</h1><p>" + task + "</p>";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.start();
        System.out.println("Server running on http://localhost:8000/");
    }
}
