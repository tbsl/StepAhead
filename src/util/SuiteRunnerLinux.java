package util;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class SuiteRunnerLinux {

public static void main(String[] args) {

// Create object of TestNG Class
TestNG runner=new TestNG();

// Create a list of String 
List<String> suitefiles=new ArrayList<String>();

// Add xml file which you have to execute
//suitefiles.add("//root//Desktop//data//testingautomation//TestNG.xml");

//suitefiles.add("//root//automation//testingautomation//TestNG.xml");
suitefiles.add("C:\\devNew\\workspace\\StepAhead\\TestNG.xml");
// now set xml file for execution
runner.setTestSuites(suitefiles);

// finally execute the runner using run method
runner.run();
}

}