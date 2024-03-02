package Directions;

public class Checking {

    public static void checkDate(String date) throws InvalidValueException {
        char[] checkDate = date.toCharArray();
        if (checkDate.length == 10 && (checkDate[2] == '.' && checkDate[5] == '.')) {
        } else {
            throw new InvalidValueException("Неверный формат даты.");
        }
    }

    public static void checkPhoneNumber(String phoneNumber) throws InvalidValueException {
        if (phoneNumber.contains("+")) {
            throw new InvalidValueException("Неверный формат номера телефона");
        }
        try {
            long check = Long.parseLong(phoneNumber);
        } catch (InvalidValueException e) {
            throw new InvalidValueException("Неверный формат номера телефона");
        }
    }

    public static void checkGender(String gender) throws InvalidValueException {
        gender = gender.toLowerCase();
        if (gender.length() == 1 && (gender.equals("m") || gender.equals("f"))) {
            char[] charArray = gender.toCharArray();
            char convertedGender = charArray[0];
        } else {
            throw new InvalidValueException("Неверно введен пол");
        }

    }

}
