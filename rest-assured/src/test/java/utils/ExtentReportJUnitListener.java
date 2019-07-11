package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class ExtentReportJUnitListener extends RunListener {
    private static ExtentReports extent = new ExtentReports();
    private static ExtentTest test;
    private static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/todo-extent-report.html");

    static{
        System.out.println(":::::::::Initiailizing Extent Reports.:::::::::::");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("TODO Verifier");
        htmlReporter.config().setReportName("TODO Verificator");
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);

        htmlReporter.start();
        System.out.println("Attaching HTML report to main reporter");
        extent.attachReporter(htmlReporter);
    }


    public void testStarted(Description description) {
        test = extent.createTest(description.getMethodName());
        test.assignCategory(description.getClassName());
        System.out.println("\n\n\nStarting .... " + description.getMethodName());
    }

    public void testFinished(Description description) {
        test.pass(description.getClassName());
        System.out.println("Finished .... " + description.getMethodName());
    }

    /**
     * Called when an atomic test fails.
     */
    public void testFailure(Failure failure) throws java.lang.Exception {
        test.fail(failure.getException().getLocalizedMessage());

        System.out.println("Execution of test case failed : " + failure.getMessage());
    }

    /**
     * Called when a test will not be run, generally because a test method is annotated with Ignore.
     */
    public void testIgnored(Description description) throws java.lang.Exception {
        test.skip(description.getDisplayName());
        System.out.println("Execution of test case ignored : " + description.getMethodName());
    }

    public void testRunFinished(Result result) {

        extent.flush();

    }
}