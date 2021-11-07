# Carbon-Android
The Test was set up on eclipse IDE and written in java, It Uses appium java client jar files and selenium library jars as the build artifacts.
In it i have a a package that contains the Testbase Class extended to every test class, which serve as a configuration layer for every test.
Also i created a testcase package that houses the 3 tests.
Included as well is the application of TestNg.xml file to enable  test run parllel and serially.
Login Test method was called in the two other classs methods
Also embedded, is the the test output folser for cummulative test results.
The scripts were ran on emulator. At the end the app thows an error, indicating user has exceeded daily limits both for irtime purchase and funding of wallet.



To run the test,
1. Clone the repository
2. Attach an emulator to your PC
3. Change the UDID of the emulator to yours in testbase class
4. Also Change the device name and and platform version
5. Ensure TestNG is available on your IDE
6. Right click a test class, then run as testNG test

NOTE. You would need to have logged into the app manually, before yuo would start running the script. Also, with the steps above, i already assume the environment et up has been done for a device to run a mobile automated test





