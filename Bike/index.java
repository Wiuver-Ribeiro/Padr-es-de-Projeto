package Bike;

public // Classe cliente
public class Cliente {
    private AbstractFactoryBike factoryBike;
    private AbstractSpeed abstractSpeed;

    public Cliente(AbstractFactoryBike factoryBike, AbstractSpeed abstractSpeed) {
        this.factoryBike = factoryBike;
        this.abstractSpeed = abstractSpeed;
    }

    public void comprarBike() {
        AbstractMountainBike mountainBike = factoryBike.criarMountainBike();
        AbstractSpeed speed = abstractSpeed.criarSpeed();
        mountainBike.setSpeed(speed);
        mountainBike.printInfo();
    }
}

// Classe AbstractFactoryBike
public abstract class AbstractFactoryBike {
    public abstract AbstractMountainBike criarMountainBike();
}

// Classe AbstractSpeed
public abstract class AbstractSpeed {
    public abstract void imprimirVelocidade();

    public abstract AbstractSpeed criarSpeed();
}

// Classe Monark
public class Monark extends AbstractMountainBike {
    public void printInfo() {
        System.out.println("Bicicleta Monark com velocidade: " + getSpeed());
    }
}

// Classe Caloi
public class Caloi extends AbstractMountainBike {
    public void printInfo() {
        System.out.println("Bicicleta Caloi com velocidade: " + getSpeed());
    }
}

// Classe Monark10
public class Monark10 extends AbstractSpeed {
    public void imprimirVelocidade() {
        System.out.println("Velocidade da Monark 10");
    }

    public AbstractSpeed criarSpeed() {
        return new Monark10();
    }
}

// Classe Caloi10
public class Caloi10 extends AbstractSpeed {
    public void imprimirVelocidade() {
        System.out.println("Velocidade da Caloi 10");
    }

    public AbstractSpeed criarSpeed() {
        return new Caloi10();
    }
}

// Classe AbstractMountainBike
public abstract class AbstractMountainBike {
    private AbstractSpeed speed;

    public void setSpeed(AbstractSpeed speed) {
        this.speed = speed;
    }

    public AbstractSpeed getSpeed() {
        return speed;
    }

    public abstract void printInfo();
}

// Classe CaloiBike
public class CaloiBike extends AbstractFactoryBike {
    public AbstractMountainBike criarMountainBike() {
        return new Caloi();
    }
}

// Classe MonarkBike
public class MonarkBike extends AbstractFactoryBike {
    public AbstractMountainBike criarMountainBike() {
        return new Monark();
    }
}