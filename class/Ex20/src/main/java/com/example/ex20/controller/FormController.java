package com.example.ex20.controller;

import com.example.ex20.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/form")
public class FormController {

    @GetMapping("/test-object")
    public String testObject(Model md) {
        UserDTO2 bean = new UserDTO2();

        bean.setUserName("Stone.Cat");
        bean.setUserID("stonecat");
        bean.setUserPW("tmd3587");
        bean.setUserPostcode("35745");
        bean.setUserAddress1("Korea");
        bean.setUserAddress2("Deajeon");

        md.addAttribute("user00", bean);
        md.addAttribute("action", "/form/result1");

        return "/form/01-object";
    }

    @PostMapping("/result1")
    public String testResult(UserDTO2 dto) {
        System.out.println(dto.getUserID());

        return "form/result";
    }

    @GetMapping("/test-check")
    public String testCheck(Model md) {
        UserDTO3 bean = new UserDTO3();

        bean.setUserName("Stone.Cat");
        bean.setUserID("stonecat");
        bean.setUserPW("tmd3587");
        bean.setUserPostcode("35745");
        bean.setUserAddress1("Korea");
        bean.setUserAddress2("Deajeon");
        bean.setUserCheck(false);

        md.addAttribute("user00", bean);
        md.addAttribute("action", "/form/result2");

        return "/form/02-check";
    }

    @PostMapping("/result2")
    public String testResult2(UserDTO3 dto) {
        System.out.println(dto.getUserID());
        System.out.println(dto.getUserCheck());

        return "form/result";
    }

    @GetMapping("/test-checks")
    public String testChecks(Model md) {
        UserDTO4 bean = new UserDTO4();

        bean.setUserName("Stone.Cat");
        bean.setUserID("stonecat");
        bean.setUserPW("tmd3587");
        bean.setUserPostcode("35745");
        bean.setUserAddress1("Korea");
        bean.setUserAddress2("Deajeon");

        List<String> list = new ArrayList<>();
        list.add("SEOUL");
        list.add("JEJU");
        bean.setStates(list);

        Map<String, String> regions = new LinkedHashMap<>();
        regions.put("SEOUL", "서울");
        regions.put("JEJU", "제주");
        regions.put("BUSAN", "부산");

        md.addAttribute("regions", regions);
        md.addAttribute("user00", bean);
        md.addAttribute("action", "/form/result3");

        return "form/03-checks";
    }

    @PostMapping("/result3")
    public String testResult3(UserDTO4 dto) {
        System.out.println(dto.getUserID());
        System.out.println(dto.getStates());

        return "form/result";
    }

    @GetMapping("/test-radio")
    public String testRadio(Model md) {
        UserDTO5 bean = new UserDTO5();

        bean.setUserName("Stone.Cat");
        bean.setUserID("stonecat");
        bean.setUserPW("tmd3587");
        bean.setUserPostcode("35745");
        bean.setUserAddress1("Korea");
        bean.setUserAddress2("Deajeon");
        bean.setState(Region.JEJU);

        md.addAttribute("stateType", Region.values());
        md.addAttribute("user00", bean);
        md.addAttribute("action", "/form/result4");

        return "form/04-radio";
    }

    @PostMapping("/result4")
    public String testResult4(UserDTO5 dto) {
        System.out.println(dto.getUserID());
        System.out.println(dto.getState());

        return "form/result";
    }

    @GetMapping("/test-select")
    public String testSelect(Model md) {
        UserDTO6 bean = new UserDTO6();

        bean.setUserName("Stone.Cat");
        bean.setUserID("stonecat");
        bean.setUserPW("tmd3587");
        bean.setUserPostcode("35745");
        bean.setUserAddress1("Korea");
        bean.setUserAddress2("deajeon");
        bean.setDeliveryCode("FAST");

        List<DeliveryCode> list = Arrays.asList(
                new DeliveryCode("FAST", "빠른 배송"),
                new DeliveryCode("NORMAL", "일반 배송"),
                new DeliveryCode("SLOW", "느린 배송")
        );

        md.addAttribute("deliveryCodes", list);
        md.addAttribute("user00", bean);
        md.addAttribute("action", "/form/result5");

        return "form/05-result";
    }

    @PostMapping("result5")
    public String testResult5(UserDTO6 dto) {
        System.out.println(dto.getUserID());
        System.out.println(dto.getDeliveryCode());

        return "form/result";
    }
}
