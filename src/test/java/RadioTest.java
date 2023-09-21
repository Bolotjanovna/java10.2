import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {
    @Test
    public void testingRadioStationNext() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingRadioStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(0);

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingRadioVolume() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(0);

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingRadioPrev() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(8);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingRadioNextA() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(6);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingRadioPrevB() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(3);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testingNextStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(0);

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testingNewRadioStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(0);

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testingNewRadio() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(0);

        radio.setCurrentStation(10);
        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testingNewRadioA() {
        Radio radio = new Radio(9);
        radio.setCurrentVolume(0);

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testingNewRadioB() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testingNewRadioC() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
