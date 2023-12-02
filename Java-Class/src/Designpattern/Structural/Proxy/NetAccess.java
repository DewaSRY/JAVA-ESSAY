package Designpattern.Structural.Proxy;

public class NetAccess {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyNetAccess(2);
        access.grantInternetAccess();
    }
}

interface OfficeInternetAccess {
    void grantInternetAccess();
}

class ProxyNetAccess implements OfficeInternetAccess {

    private int employeeRank;
    private RealNetAccess realNetAccess;

    public ProxyNetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }

    @Override
    public void grantInternetAccess() {
        // Restrict the Access
        if (employeeRank >= 5) {
            // Grant Internet Access
            realNetAccess = new RealNetAccess(employeeRank);
            realNetAccess.grantInternetAccess();
        } else {
            System.out.println("Internet Access Denied, Job Level < 5");
        }
    }
}

class RealNetAccess implements OfficeInternetAccess {

    private int employeeRank;

    public RealNetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access Granted! - Employee Rank " + employeeRank);

    }
}
