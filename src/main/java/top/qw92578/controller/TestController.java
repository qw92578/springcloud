package top.qw92578.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: comg.qgf.springcloud.controller
 * @ClassName: TestController
 * @Author: fgq
 * @Description:
 * @Date: 2019/9/6 15:20
 */
@RestController
@RequestMapping("index")
public class TestController {

    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}
