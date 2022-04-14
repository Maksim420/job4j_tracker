package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{" + ln + "\t\"name\" : \"" + name + "\"," + ln
                + "\t\"body\" : \"" + body + "\"" + ln + "}";
    }

    public static void main(String[] args) {
        JSONReport rep = new JSONReport();
        System.out.println(rep.generate("123", "34"));
    }
}
