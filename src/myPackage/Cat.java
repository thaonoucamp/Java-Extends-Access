package myPackage;

import javax.xml.namespace.QName;

public class Cat extends Animal{
    public void info() {
//        name = "Cat"; (private) chi truy cap trong Class super;
        age = 13;
        index = "Ha noi";
        add = "Tay Ho";
    }
// Override cac ham cung package; implement body;
    @Override
    protected void run() {
        this.run();
    }

    @Override
    void play() {
        this.play();
    }
}
