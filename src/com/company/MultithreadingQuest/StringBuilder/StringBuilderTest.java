package com.company.MultithreadingQuest.StringBuilder;

import java.util.HashMap;
import java.util.Map;

public class StringBuilderTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", null);
        map.put("country", null);
        map.put("city", null);
        map.put("age", null);
        //резыльтат метода должен быть: name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


        System.out.println(getQuery(map));
        /*StringBuilder sb = new StringBuilder("String for tests");
        String replaseMethod = sb.replace(1, 3, "REPLACEMENT_PART").toString();
        System.out.println(replaseMethod);

        sb.setCharAt(1, 'g');

        System.out.println(sb.toString());*/
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder("");

        for (Map.Entry entry : params.entrySet()
        ) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            if (value != null) {
                sb.append(key).append(" = '").append(value).append("' and ");
            }
        }
        if (sb.length() > 0) sb.delete(sb.lastIndexOf(" and"), sb.length());
        return sb.toString();
    }
}
