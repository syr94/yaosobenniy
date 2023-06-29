# Children Education Management System

A brief description of your project.

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies](#technologies)
- [Contributing](#contributing)
- [License](#license)

## Description

The Children Education Management System is a web-based application designed to facilitate the management of children with disabilities and their education. The system allows parents, teachers, and fund employees to collaborate and track the educational progress of the children.

## Features

- User Roles:
    - Parents: Parents can access their personal account to view information about their child's educational activities, including the days and times the child was taught by specific teachers.
    - Teachers: Teachers have their own personal accounts where they can view their teaching schedules and the specific children they worked with on particular days and times.
    - Fund Employees: Fund employees have access to information on both parents and children, allowing them to monitor the overall progress and performance of the children.
- Lesson Management:
    - Teachers can create and manage lessons, assigning them to specific children.
    - Lessons include information about the teacher, child, address, and company.
- Data Storage and Retrieval:
    - The system utilizes a Java-based backend with PostgreSQL as the database to store and retrieve data.
- User Interface:
    - The frontend of the application is developed using Vue.js, providing an intuitive and user-friendly interface for all user roles.


## Installation

- Prerequisites: Java, PostgreSQL, Vue.js
- Clone the repository: `git clone https://github.com/your-repo.git`
- Backend Setup:
    1. Navigate to the backend directory: `cd backend`
    2. Install dependencies: `npm install`
    3. Start the backend server: `npm start`
- Frontend Setup:
    1. Navigate to the frontend directory: `cd frontend`
    2. Install dependencies: `npm install`
    3. Start the frontend development server: `npm run serve`

## Usage

- Access the application through your web browser at `http://localhost:8080`
- Login using your assigned credentials based on your user role (parent, teacher, or fund employee)
- Navigate through the different sections of the application to view and manage educational information based on your role.

## Technologies

- Java
- PostgreSQL
- Vue.js
- Docker-compose

## Contributing

I welcome contributions from the community! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

© 2023 Syropyatov Mikhail
