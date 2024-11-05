package cn.shenghuo2.homework6;

import java.util.Scanner;

// Step 1: Define the IMobileStorage interface
interface IMobileStorage {
    void read();
    void write();
}

// Step 2: Implement the FlashDisk class
class FlashDisk implements IMobileStorage {
    @Override
    public void read() {
        System.out.println("Reading from FlashDisk");
    }

    @Override
    public void write() {
        System.out.println("Writing to FlashDisk");
    }
}

// Step 3: Implement the MobileHardDisk class
class MobileHardDisk implements IMobileStorage {
    @Override
    public void read() {
        System.out.println("Reading from MobileHardDisk");
    }

    @Override
    public void write() {
        System.out.println("Writing to MobileHardDisk");
    }
}

// Step 4: Implement the MP3Player class
class MP3Player implements IMobileStorage {
    @Override
    public void read() {
        System.out.println("Reading from MP3Player");
    }

    @Override
    public void write() {
        System.out.println("Writing to MP3Player");
    }
}

// Step 5: Implement the Computer class
class Computer {
    private IMobileStorage storageDevice;

    public void setStorageDevice(IMobileStorage storageDevice) {
        this.storageDevice = storageDevice;
    }

    public void readData() {
        storageDevice.read();
    }

    public void writeData() {
        storageDevice.write();
    }
}

// Step 6: Implement the Test class
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Computer computer = new Computer();

        switch (input) {
            case "fd":
                computer.setStorageDevice(new FlashDisk());
                break;
            case "mhd":
                computer.setStorageDevice(new MobileHardDisk());
                break;
            case "mp3":
                computer.setStorageDevice(new MP3Player());
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        computer.readData();
        computer.writeData();
    }
}

