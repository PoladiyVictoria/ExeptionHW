package data;

import java.util.Scanner;

import exeption.LengthNameExeption;

public class contact {
    public String[] createContact() throws LengthNameExeption{
        String string;
        String[] contact = new String[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < contact.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Введите фамилию");
                    string = in.next();
                    if (string.length() == 0 | string.length() < 2) {
                        throw new LengthNameExeption("Фамилия введена некорректно!!");
                    }else{
                        contact[i] = string;
                    }
                    break;
                
                case 1:
                    System.out.println("Введите Имя");
                    string = in.next();
                    if (string.length() == 0 | string.length() < 2) {
                        throw new LengthNameExeption("Имя введено некорректно!!");
                    }else{
                        contact[i] = string;
                    }
                    break;

                case 2:
                    System.out.println("Введите Отчество");
                    string = in.next();
                    if (string.length() == 0 | string.length() < 5) {
                        throw new LengthNameExeption("Отчество введено некорректно!!");
                    }else{
                        contact[i] = string;
                    }
                    break;
                
                case 3:
                    System.out.println("Введите дату рождения в формате dd.mm.yyyy");
                    string = in.next();
                    if (string.length() == 0 | string.length() < 10) {
                        throw new LengthNameExeption("Дата введена некорректно!!");
                    }else{
                        contact[i] = string;
                    }
                    break;
                
                case 4:
                    System.out.println("Введите номер телефона");
                    string = in.next();
                    if (string.length() == 0 | string.length() < 10) {
                        throw new LengthNameExeption("Номер телефона введен некорректно!!");
                    }else{
                        contact[i] = string;
                    }
                    break;

                case 5:
                    System.out.println("Введите пол m или w");
                    string = in.next();
                    if (string.length() != 1 ) {
                        throw new LengthNameExeption("Пол введен некорректно!!");
                    }else{
                        contact[i] = string;
                    }
                    break;
            
                default:
                    break;
            }
        }
        return contact;
    }
}
