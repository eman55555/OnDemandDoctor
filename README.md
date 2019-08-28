OnDemanDoctor

this app helps the patients to contact , meet and chat with doctors who are appropriate to their sick status and geographical area if they will meet over the world.
General idea

an application helps patients communicate with doctors to diagnose their illnesses , conversations and follow up their cases continuously and it is possible to meet personally if necessary according to the appropriate place for both in any place in the world This application will be useful especially in places where there is a shortage of doctors or when someone sick late It is difficult to meet a doctor. The patient information that is shown in the app is:

    name , phone
    Symptoms
    location -make profile
    information to book
    information to chatbot
    records

The app consists of: -app intro (fragments) to show what the app presents

    main view that ask for name and phone
    build acomplete profile
    tab host that allows to:
        switch between choices: home, records ,book ,appointment, profile
        choose what are you want to do from them -list view that allow to :
        switch between choices: chatbot, visit aclinic ,online consultation ,house calls
        choose the service that are you want to do from them *and follow the instructions

The big round button on the main screen allows to complete your profile to accomplish your wanted service. The hamburger button in top bar allows to change to settings view.
API

The API that will be used is an open API available here for expermintation: https://my-json-server.typicode.com/typicode/demo/posts
Design documentation

Activities -AppIntro

    MainActivity
    LogIn
    Start
    Home
    Profile
    Records
    Book
    Appointment

ContentProvider

It will manage access to patient and doctor and forecast data that will be stored on the device. It will also allow access to stored settings (city and Specialization).

Service

    WeatherService - it will be a bound service that will allow for making http requests and contact with available doctor who is and forecast. The data will be requested only in fixed intervals and kept stored until new update come.

BroadcastReceiver

It will watch for new doctor updates and show a notification to the patient that new doctor forecast is available in the list.
Tests

Junit will be used to prepare unit and integration tests.