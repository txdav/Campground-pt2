
# Campground Explorer — Lab 5, Part 2

## About the Project

Campground Explorer is an Android application that retrieves campground information from the National Park Service (NPS) API. This version implements offline data storage using Room, allowing previously retrieved campground information to remain accessible when an internet connection is unavailable.

## Demo

![Campground Explorer Lab 5 Demo](https://i.postimg.cc/X7td6Bdy/Lab4-1pt2.gif)

## Features

- **Campground Listings:** Retrieve and display campground information from the National Park Service API.
- **Offline Data Storage:** Save campground information locally using Room.
- **Local Database:** Store campground names, descriptions, location coordinates, and image URLs.
- **Automatic Data Updates:** Refresh locally stored campground information when new API data is successfully retrieved.
- **Network Error Handling:** Preserve previously saved campground data when a network request fails.

## Technologies Used

- Kotlin
- Android Studio
- Android Jetpack
- Room Persistence Library
- Kotlin Coroutines and Flow
- AsyncHttpClient
- National Park Service API
- RecyclerView

## Database Implementation

Room provides local persistence through three primary components:

- `CampgroundEntity.kt` — Defines the campground information stored locally.
- `CampgroundDao.kt` — Provides database operations to retrieve, insert, and delete campground records.
- `AppDatabase.kt` — Creates and manages the Room database instance.

The application observes locally stored campground information and updates the displayed list when the database changes.

## API Integration

The application retrieves campground information using the National Park Service API.

**API endpoint:** https://developer.nps.gov/api/v1/campgrounds

An API key is required to access the service. The key should remain in local configuration and must not be committed to a public repository.

## Offline Functionality

Once campground information has been successfully saved to the local database, the application can display the stored data without an internet connection. When connectivity returns, the application can retrieve updated information from the API.

## Implementation Challenges

During implementation, I encountered issues uploading and displaying the demonstration GIF in the README. Troubleshooting required checking the image URL and updating the Markdown image reference to use a different hosting service.

Network connectivity and DNS resolution issues also temporarily affected API requests during testing. Restarting the emulator helped restore the campground display.

These challenges emphasized the importance of troubleshooting file paths, verifying network connectivity, and testing offline functionality separately from API retrieval.

## Getting Started

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Configure the National Park Service API key using the project's existing configuration.
4. Allow Gradle to sync and build the project.
5. Run the application on an Android emulator or compatible Android device.
6. Connect to the internet to retrieve and save campground information.
7. Enable Airplane Mode and reopen the application to test access to previously saved data.

## Project Goal

The goal of this project is to improve the reliability of an Android application by implementing local database persistence, asynchronous data operations, and offline access to previously retrieved campground information.

---

**Project:** Campground Explorer — Lab 5, Part 2

**Repository:** [Campground-pt2](https://github.com/txdav/Campground-pt2)
