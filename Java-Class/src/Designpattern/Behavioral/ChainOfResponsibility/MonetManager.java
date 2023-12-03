package Designpattern.Behavioral.ChainOfResponsibility;

// Base Interface

public class MonetManager {
    public static void main(String[] args) {
        System.out.println();
    }
}

interface MoneyDistributor {
    void setNextChain(MoneyDistributor nextChain);

    void distribute(Currency currency);
}

class Dollar50 implements MoneyDistributor {
    private MoneyDistributor chain;

    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void distribute(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;

            System.out.println("Distributing " + num + " 50$ note");

            if (remainder != 0) {
                this.chain.distribute(new Currency(remainder));
            }

        } else {
            this.chain.distribute(currency);
        }

    }
}

class Dollar20 implements MoneyDistributor {
    private MoneyDistributor chain;

    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void distribute(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;

            System.out.println("Distributing " + num + " 20$ note");

            if (remainder != 0) {
                this.chain.distribute(new Currency(remainder));
            }

        } else {
            this.chain.distribute(currency);
        }

    }
}

class Dollar10 implements MoneyDistributor {

    private MoneyDistributor chain;

    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void distribute(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;

            System.out.println("Distributing " + num + " 10$ note");

            if (remainder != 0) {
                this.chain.distribute(new Currency(remainder));
            }

        } else {
            System.out.println("No bills less than 10 dollars!");
        }

    }
}

class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}