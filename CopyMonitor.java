public class CopyMonitor
{
    private boolean tonerLevel = false;
    private boolean pageCount = false;

    public boolean isTonerLevel()
    {
        return tonerLevel;
    }

    public void setTonerLevel(boolean tonerLevel)
    {
        this.tonerLevel = tonerLevel;
    }

    public boolean isPageCount()
    {
        return pageCount;
    }

    public void setPageCount(boolean pageCount)
    {
        this.pageCount = pageCount;
    }

    public String ServiceStatus()
    {
        if(tonerLevel || pageCount)
        {
            return "Service Needed";
        }
        return "Service not needed";

    }

    public static void main(String[] args)
    {
        CopyMonitor copyMonitor = new CopyMonitor();
        copyMonitor.setTonerLevel(true);
        copyMonitor.setPageCount(true);
        System.out.println("Service Status : " + copyMonitor.ServiceStatus());
    }
}
