public class OnlineShoppingSite{

    public void myAccountName()
    {
        System.out.println("Account Name : My Account");
    }

    public void cataLog()
    {
        System.out.println("Catalog : My Cat");
    }

    public void orderse()
    {
        System.out.println("Orderse : My Orderse");
    }

    public void myWishList()
    {
        System.out.println("Wish List : My Wish List");
    }

    public static void main(String [] args)
    {
        OnlineShoppingSite Info = new OnlineShoppingSite();

        Info.myAccountName();
        Info.cataLog();
        Info.orderse();
        Info.myWishList();
    }
    
}

