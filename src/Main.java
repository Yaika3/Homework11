public class Main {
    public static void main(String[] args) {
        String phone = "800+555-35 35";
        phone = phone.replace ("-" , "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = "+7" + phone;
        }else if (phone.length() > 11){
            throw new RuntimeException("Телефон слишком длинный");
        }else if (phone.length()< 10){
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '8') {
            throw new RuntimeException("среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "+78005553535";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

        //task 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника "+fullName);
        //task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //task 3
        String name3 = "Иванов Семён Семёнович";
        name3 = name3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + name3);

    }


}