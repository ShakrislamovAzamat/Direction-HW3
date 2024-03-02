package Directions;

import java.io.IOException;
import java.util.Scanner;

public class GetData {
    public static void getData() throws InvalidValueException, EmptyStringException,
                                        ArrayCountElementException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные, разделенные пробелом в формате: \n"+
                            "<Фамилия> <Имя> <Отчество> <Дата рождения> <Телефон> <Пол>\n"+
                            "Фамилия, Имя, Отчество - латиницей\n"+
                            "Дата рождения в формате - dd.mm.yyyy\n"+
                            "Телефон - целое число без спецсимволов\n"+
                            "Пол - 'm' или 'f': ");
        String inputData;
        inputData = scanner.nextLine();
        if (inputData.isEmpty()){
            throw new EmptyStringException ("Данные не введены.");
        }
        inputData = inputData.replaceAll("\\s+", " ");
        inputData = inputData.trim();
        String[] bufferArray = inputData.split(" ");
        if (bufferArray.length == 6){
            Checking.checkDate(bufferArray[3]);
            Checking.checkPhoneNumber(bufferArray[4]);
            Checking.checkGender(bufferArray[5]);
            DataWrite.createFile(bufferArray);
        } else {
            throw new ArrayCountElementException ("Вы ввели не все данные, либо не соблюден формат ввода данных.");
        }
    }
}
