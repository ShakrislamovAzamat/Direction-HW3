package Directions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            GetData.getData();
        }catch (EmptyStringException e){
            System.out.println(e.getMessage());
        } catch (ArrayCountElementException e) {
            System.out.println(e.getMessage());
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
