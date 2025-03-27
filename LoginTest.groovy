import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open the browser and navigate to the login page
WebUI.openBrowser('https://www.example.com/login')

// Maximize the browser window
WebUI.maximizeWindow()

// Set the username and password fields (Replace with actual credentials)
WebUI.setText(findTestObject('Object Repository/Login/username_field'), 'your_username')
WebUI.setText(findTestObject('Object Repository/Login/password_field'), 'your_password')

// Click the login button
WebUI.click(findTestObject('Object Repository/Login/login_button'))

// Wait for the dashboard to load (you can adjust the wait time as needed)
WebUI.waitForPageLoad(10)

// Verify if the welcome message is displayed (you can replace this with an actual element on your site)
WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/welcome_message'), 10)

// Print a success message in the logs
WebUI.comment('Login Test Passed')

// Close the browser
WebUI.closeBrowser()
