package takesScreenShotDynamically_C2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustumListner extends BaseTest implements ITestListener {
// right click on that go to source click on override/impliments method select only itestListner
//click on ok button  all 8 method clear/empty

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String nameOffailedmethod = result.getMethod().getMethodName();
		failed(nameOffailedmethod);
		Reporter.log("screenshots is taken with "+nameOffailedmethod+" ",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}	
}
