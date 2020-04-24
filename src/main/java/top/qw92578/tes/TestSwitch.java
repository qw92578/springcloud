package top.qw92578.tes;

/**
 * @Package: com.qgf.springcloud.tes
 * @ClassName: TestSwitch
 * @Author: fgq
 * @Description:
 * @Date: 2019/9/9 14:24
 */
public class TestSwitch {

    /**
     * 测试switch 的String
     * @param args
     */
    public static void main(String[] args) {
        String s = "aaa";

        switch (s) {
            case "aaa":
                System.err.println("dsjadghsajd");
                break;
            default:
                System.err.println("hello world");
        }
    }

}
