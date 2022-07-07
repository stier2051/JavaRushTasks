package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String countryName = null;
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if (pair.getKey().equals(data.getCountryCode())) {
                    countryName = pair.getValue();
                    break;
                }
            }
            return countryName;
        }

        @Override
        public String getName() {
            return data.getContactLastName() +", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {

            int phone = data.getPhoneNumber();
            StringBuilder wholeNumber = new StringBuilder(Integer.toString(phone));
            if (wholeNumber.length() < 10) {
                while (wholeNumber.length() < 10) {
                    wholeNumber.insert(0, "0");
                }
            }

            String phoneCode = wholeNumber.substring(0, 3);
            String phonePart1 = wholeNumber.substring(3, 6);
            String phonePart2 = wholeNumber.substring(6, 8);
            String phonePart3 = wholeNumber.substring(8, 10);

            return "+" + data.getCountryPhoneCode() + "(" + phoneCode + ")" + phonePart1 + "-" + phonePart2 + "-" + phonePart3;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}