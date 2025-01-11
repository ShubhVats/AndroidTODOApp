# Android TODO App

A simple Android application for managing to-do items. Built with Jetpack Compose, Room, and Kotlin Coroutines.

## Features

* Add new to-do items.
* View a list of all to-do items.
* Delete to-do items.

## Screenshots

<img src="https://github.com/user-attachments/assets/799ee7c9-2e05-4d43-a238-05f5509a2d83" alt="Screenshot_20250110_155308_Android Weather App" width="200">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/user-attachments/assets/d4ba545f-ec55-41ac-91d7-4e39f592cb0c" alt="Screenshot_20250110_155251_Android Weather App" width="200">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/user-attachments/assets/287599ec-41e4-4840-8098-13a13d6ae2c2" alt="Screenshot_20250110_155251_Android Weather App" width="200">

## Architecture

This app follows the MVVM (Model-View-ViewModel) architectural pattern.

* **Model:** `Todo` data class represents a to-do item. Room is used for data persistence.
* **View:** Jetpack Compose is used to build the UI, displaying the list of to-do items and allowing user interactions.
* **ViewModel:** `TodoViewModel` manages the data and exposes it to the View. It handles adding and deleting to-do items using coroutines for asynchronous operations.

## Dependencies

* Jetpack Compose (UI)
* Kotlin Coroutines (Asynchronous operations)
* Room (Data persistence)
* AndroidX Lifecycle (ViewModel)
* Hilt (Dependency injection - assumed, not explicitly seen in the code)

## Getting Started

1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Contributing

Contributions are welcome! Please see the [CONTRIBUTING.md](CONTRIBUTING.md) file for guidelines.

## License

This project is licensed under the [MIT License](LICENSE).
