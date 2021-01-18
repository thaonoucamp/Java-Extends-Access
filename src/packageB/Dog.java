package packageB;

import myPackage.Animal;

public class Dog extends Animal {
    public void info() {
//        name = "DOg"; (private)
        age = 11;
        index = "Da nang";
//        add = "Long Bien"; (default) (package) // Ko the truy cap khac package;
    }

// Override cac ham khac package; implement body;
    @Override
    protected void run() {
        this.run();
    }
}
