🎯 Event Data Generator 1.5

A modular Java-based event data generator that simulates realistic user and device activity across various neighborhoods in Atlanta. Built with extensibility in mind, this project is ideal for data engineering pipelines, real-time analytics simulations, and cloud ingestion testing.

📌 Project Purpose

This generator is designed to provide high-quality, schema-consistent synthetic data for downstream processes like:

✅ Stream processing (Kafka, Kinesis)

✅ Batch ETL jobs

✅ Data warehouse testing (BigQuery, Snowflake, Redshift)

✅ Business intelligence dashboards (Looker, Tableau)

🏗 Features

🧑‍🤝‍🧑 Consistent User Generation

Random but validated user profiles

Unique userId per user (now fixed for reuse)

Attributes include name, email, age, gender, language

💻 Device Generation

Each user is assigned a consistent device (one-to-one)

Device includes ID, type, model, OS, manufacturer

📍 Location + Event Metadata

Covers locations across Atlanta (e.g., Grant Park, Summerhill)

Event types include networking, nightlife, pop-up shops, tech panels

💰 Profit Simulation

PingEvent_Profit now simulates economic impact per event

Ranges from $20.00 - $150.00 per event

🧾 Export System (CLI-Driven)

Export as .json or .csv via an intuitive CLI

Strategy pattern used for clean file-type handling

🧑‍💻 Tech Stack

Component---

Stack
Language
Java 17

Design
Interface-driven, modular, OOP

CLI
Java Scanner-based menu loop

Data Serialization
Gson (with custom adapters for LocalDate & LocalDateTime)

Cloud Ready--
AWS S3 integration (coming soon)

🧱 Data Model

Each record is a PingEvent:

PingEvent {
  user: User,
  device: Device,
  deviceType: DeviceType,
  location: AtlantaLocation,
  eventType: EventType,
  timestamp: LocalDateTime,
  PingEvent_Profit: double
}

Example Output:

{
  "user": {
    "userId": "56e557d6-...",
    "username": "LexNova",
    "email": "lexnova890@example.com"
  },
  "device": {
    "deviceId": "Device-abc123",
    "deviceType": "MOBILE",
    "model": "iPhone 14"
  },
  "location": "GRANT_PARK",
  "eventType": "TECH_PANEL",
  "timestamp": "2025-06-25T10:40:16",
  "PingEvent_Profit": 110.78
}

🧪 How to Run------------------

# Clone the repo
https://github.com/Goodbyefrog/event-data-generator.git

# Compile
javac -d out src/org/Data_Generator/**/*.java

# Run the CLI
java -cp out org.Data_Generator.App

You'll see a menu like:

[1] Generate Ping Events
[2] View Generated Events
[3] Export Events to Local File
[4] Upload Events to S3 (coming soon)
[5] Exit

🧭 Coming Soon -------------

☁️ AWS S3 Upload Support

🌀 Kafka Stream Integration

🗂️ Automatic MySQL / BigQuery table population

📊 Dashboard-ready export templates

🤝 Contributing------------------

Fork the repo, submit a pull request, or suggest enhancements via issues!

👤 Author--------

Tristan R.
Open-source learner and aspiring data engineer.
Follow for more real-world tech capstone builds.

