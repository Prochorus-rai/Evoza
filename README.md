
# <img src="src/main/resources/images/icons/logo.png" alt="Evoza Logo" width="40" height="40"> Evoza Web Browser 

## Overview

Evoza Web Browser is a project developed for the LED2 course in the 2nd semester at our college. This application is designed to provide a simple and efficient web browsing experience with a custom user interface. The project is developed by a team of five members, with [Your Name] serving as the Scrum Master.

## Team Members

- Biplov Gautam (Scrum Master)
- Sabin Raj Pokhreal
- Kalina Shrestha
- Rohit shah
- Prochorus Rai

## Features

- Custom title bar with minimize, maximize, and close buttons
- Customizable dark theme
- Guest mode to save bookmarks and browsing histories without logging in!
- private / incognito mode to browse without saving data
- Modular design with separate UI components

## Project Structure

```
Evoza/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── evoza/
│   │   │   │   │   ├── browser/
│   │   │   │   │   │   ├── BrowserController.java
│   │   │   │   │   │   ├── GuestMode.java
│   │   │   │   │   │   ├── ProfileMode.java
│   │   │   │   │   ├── profile/
│   │   │   │   │   │   ├── ProfileManager.java
│   │   │   │   │   │   ├── Profile.java
│   │   │   │   │   ├── ui/
│   │   │   │   │   │   ├── LandingPageUI.java
│   │   │   │   │   │   ├── CreateProfileUI.java
│   │   │   │   │   │   ├── BrowserUI.java
│   │   │   │   │   ├── utils/
│   │   │   │   │   │   ├── DatabaseHelper.java
│   │   ├── resources/
│   │   │   ├── fxml/
│   │   │   │   ├── LandingPage.fxml
│   │   │   │   ├── CreateProfile.fxml
│   │   │   │   ├── Browser.fxml
│   │   │   ├── images/
│   │   │   │   ├── avatars/
│   │   │   │   └── icons/
│   │   │   ├── css/
│   │   │   │   ├── app.css
│   │   │   │   ├── styles.css
├── test/
│   ├── java/
│   │   ├── com/
│   │   │   ├── evoza/
│   │   │   │   ├── browser/
│   │   │   │   ├── profile/
├── lib/
├── config/
│   ├── browser.properties
├── build.gradle
├── pom.xml
├── README.md
└── .gitignore
```

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-repo/evoza-web-browser.git
   cd evoza-web-browser
   ```

2. **Build the project**:
   ```bash
   gradle build
   ```

3. **Run the application**:
   ```bash
   gradle run
   ```

## Technologies Used

- Java
- JavaFX
- Gradle

## Custom Title Bar

The custom title bar includes the application logo, title, and window control buttons (minimize, maximize, close). It is implemented in the `CustomTitleBar.java` file.

## Dark Theme

The application uses a dark theme defined in the `app.css` file. The theme includes a gradient background and styled buttons.

## Contributions

All team members contributed to the development of the Evoza Web Browser. Special thanks to [Your Name] for leading the team as the Scrum Master.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
