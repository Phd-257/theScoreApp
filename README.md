# theScore Mobile App Automation Challenge

This repository contains my solution to the automation challenge provided by theScore. The purpose of this challenge is to demonstrate my abilities to automate tests on a native mobile application.

## Overview

The challenge required automating a test scenario on the theScore mobile app. The test scenario involves opening a league, team, or player page, tapping on a sub-tab, verifying the correctness of the displayed data, and ensuring back navigation functions correctly.

## Test Scenario

1. **Open Page**: Open a league, team, or player page of choice.
2. **Verify Page**: Verify that the expected page opens correctly.
3. **Tap Sub-Tab**: Tap on a sub-tab such as league table, standings, leaders, or stats tab.
4. **Verify Data**: Verify that the correct tab is opened and the displayed data corresponds to the selected league, team, or player.
5. **Back Navigation**: Verify that back navigation returns to the previous page correctly.

## Prerequisites

- Java 19
- Maven 3.8.1
- Cucumber 7.17
- Appium 2

## Running the Submission

To run the submission from the command line on a macOS or Unix/Linux environment, follow these steps:

1. Clone the repository: `git clone https://github.com/Phd-257/theScoreApp.git`
2. Navigate to the project directory: `cd theScoreApp`
3. Install dependencies: `mvn install`
4. Ensure the APK file is present in your device : [Download](https://apkpure.com/thescore-sports-news-scores/com.fivemobile.thescore)

## Contact

For any questions or inquiries, please contact me at phd25798@gmail.com

## Credits

- theScore for providing the automation challenge.
- [Apkpure](https://apkpure.com/) for providing the APK file of the theScore app.

## Where I could be better
**Dynamic Data Management** : Could implement a data management system using JSON files to store test data.

**Configuration Properties** : Could Enhance the project's configurability by introducing a config.properties file. This file could contain platform-specific capabilities, allowing the automation suite to seamlessly switch between Android and iOS platforms without modifying the code.

**Continuous Integration/Continuous Deployment (CI/CD)** : Could Integrate the automation suite with a CI/CD pipeline, such as Jenkins. This would automate the testing process, enabling regular builds, tests, and deployments.
