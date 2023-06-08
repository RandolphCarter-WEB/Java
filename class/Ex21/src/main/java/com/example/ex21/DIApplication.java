package com.example.ex21;

import com.example.ex21.service.IMemberService;
import com.example.ex21.service.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(DIApplication.class, args);
        MemberService service1 = cac.getBean("service1", MemberService.class);
        service1.saveMember();

        IMemberService service2 = cac.getBean("service2", IMemberService.class);
        service2.saveMember();

        IMemberService service3 = cac.getBean("service2", IMemberService.class);
        service3.saveMember();

        System.out.println("Service1 >> " + service1);
        System.out.println("Service2 >> " + service2);
        System.out.println("Service3 >> " + service3);

        service2.plusNum();
        service3.plusNum();
        service3.plusNum();

        System.out.println("Service2 Value  >> " + service2.getNum());
        System.out.println("Service3 Value >> " + service3.getNum());
    }
}
