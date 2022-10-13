import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.BeforeSuite;

public class Base {
    @BeforeSuite
    public void initialize(){
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//MyReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Test One");
        test.log(Status.PASS, "This is a Pass Message");
        test.log(Status.FAIL, "This is a Fail Message");
        test.log(Status.INFO, "This is a Info Message");
        test.log(Status.WARNING, "This is a Warning Message");
        extent.flush();



    }
}
