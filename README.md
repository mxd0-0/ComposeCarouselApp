# MyApplication

## Overview

MyApplication is an Android application built using Kotlin and Jetpack Compose. The app features a carousel of images and a custom top app bar.

## Features

- Custom `CenterAlignedTopAppBar` with a title and icons.
- Two types of carousels: `HorizontalMultiBrowseCarousel` and `HorizontalUncontainedCarousel`.
- Edge-to-edge support.

## Project Structure

- **MainActivity.kt**: The main entry point of the application.
- **ui/theme/Color.kt**: Defines the color palette used in the app.
- **build.gradle.kts**: Gradle build script for configuring the project.

## Dependencies

The project uses the following dependencies:

- AndroidX Core
- AndroidX Lifecycle
- AndroidX Activity Compose
- Jetpack Compose Material3
- JUnit
- Espresso

## Setup

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Run the application on an emulator or a physical device.

## Usage

The main screen displays a custom top app bar and two carousels. The top app bar includes a title and can be customized with icons. The carousels display a list of images.

## Customization

- **Top App Bar**: Modify the `Top` composable in `MainActivity.kt` to change the title, icons, or colors.
- **Carousels**: Modify the `items` list in the `App` composable to change the images displayed in the carousels.

## License

This project is licensed under the MIT License.
