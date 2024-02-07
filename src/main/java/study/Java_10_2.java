package study;

abstract class Device{
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

class UsbPort1 extends Device{

    public UsbPort1() {
    }
    public UsbPort1(int num) {
        this.deviceId=num;
    }

    @Override
    void deviceInfo() {
        System.out.println("UsbPort1.deviceInfo");
    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}

class WiFi extends Device{
    public WiFi() {
    }
    public WiFi(int num) {
        this.deviceId=num;
    }

    @Override
    void deviceInfo() {
        System.out.println("id =" +this.deviceId);
    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}



public class Java_10_2 {
    public static void main(String[] args) {
        //Test code
        UsbPort1 usb1= new UsbPort1(1);
        WiFi wiFi= new WiFi(0);

    }
}