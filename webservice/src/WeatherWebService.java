import example.webxml.WeatherWS;
import example.webxml.WeatherWSSoap;

import java.util.List;
import java.util.Scanner;

public class WeatherWebService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        WeatherWS weatherWS = new WeatherWS();
        WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
        System.out.println("欢迎使用天气预报系统！");
        List<String> provinceList = weatherWSSoap.getRegionProvince().getString();
        for (int i = 0; i < provinceList.size(); i ++) {
            System.out.println(i + 1 + "." + provinceList.get(i).split(",")[0]);
        }
        String provinceCode;
        while (true) {
            System.out.println("请选择省份编号：");
            num = sc.nextInt();
            if (num < 1 || num > provinceList.size()) {
                System.out.println("不合法的输入，请重新输入...");
            } else {
                provinceCode = provinceList.get(num - 1).split(",")[1];
                break;
            }
        }
        List<String> cityList = weatherWSSoap.getSupportCityString(provinceCode).getString();
        for (int i = 0; i < cityList.size(); i ++) {
            System.out.println(i + 1 + "." + cityList.get(i).split(",")[0]);
        }
        String cityCode;
        while (true) {
            System.out.println("请选择城市编号：");
            num = sc.nextInt();
            if (num < 1 || num > cityList.size()) {
                System.out.println("不合法的输入，请重新输入...");
            } else {
                cityCode = cityList.get(num - 1).split(",")[1];
                break;
            }
        }
        List<String> weatherInfo = weatherWSSoap.getWeather(cityCode, "").getString();
        System.out.println("查询成功！");
        System.out.println("————————————————————");
        for (String info : weatherInfo) {
            System.out.println(info);
        }
        System.out.println("————————————————————");
        sc.close();
    }
}
