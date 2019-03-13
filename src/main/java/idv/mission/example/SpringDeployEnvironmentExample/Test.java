package idv.mission.example.SpringDeployEnvironmentExample;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        HttpService service = context.getBean(HttpService.class);
        service.connect();
        System.out.println("End");
        context.close();
    }
}