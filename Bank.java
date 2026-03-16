//Sub Class
public abstract class Bank {
    
    abstract void salary();
    abstract void saving();
    abstract void current();
    abstract void joint();
    public void branchDetails()
    {
        System.out.println("Branch : Indore");
    }
}

//Super class
 class AxisBank extends Bank{

    public void salary()
    {
        System.out.println("Salary : Every Month");
    }

    public void saving()
    {
        System.out.println("Savign : regulerly");
    }

    public void current()
    {
        System.out.println("Current : Current Account");
    }

    public void joint()
    {
        System.out.println("joint : joint account");
    }

    public static void main(String [] args)
    {
        AxisBank Info = new AxisBank();

        Info.branchDetails();
        Info.saving();
        Info.salary();
        Info.current();
        Info.joint();
    }
}
