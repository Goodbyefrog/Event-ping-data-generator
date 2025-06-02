# 🎯 Event Data Generator

A modular Java-based event data generator that simulates realistic user and device activity across various locations in Atlanta. Designed for use in data engineering pipelines, testing, and prototyping.

---

## 📌 Project Purpose

 focuses on generating high-quality, synthetic data to power downstream processes like:

- Stream processing pipelines
- ETL systems
- Data warehousing simulations
- Real-time dashboards

---

## 🏗 Features

- Generates **randomized user profiles** with attributes like username, age, gender, language, and email.
- Simulates **device interactions** (phones, tablets, desktops, wearables, etc.).
- Captures **event metadata** including:
  - Event type (e.g. coffee, dancing, networking)
  - Location (e.g. Grant Park, Castleberry Hill, etc.)
  - Device type/model
  - Timestamps

---

## 📦 Data Model

Each record is a `PingEvent` object:

```java
PingEvent {
  user: User,
  userId: UUID,
  device: Device,
  deviceType: DeviceType,
  location: AtlantaLocation,
  lat: double,
  lon: double,
  eventType: EventType,
  timestamp: LocalDateTime
}


Tech Stack
----------
Language: Java 17
Design: Modular, Object-Oriented
Structure: Interface-driven services
Tools: Custom validators, timestamp logic, and enum-driven randomization


Getting Started
----------------
Clone this repository:
git clone https://github.com/YOUR_USERNAME/event-data-generator.git
cd event-data-generator

Build and run with your favorite IDE or:
javac Main.java
java Main

🧪 Sample Output
PingEvent{user=EchoKnight, userId=..., device=DESKTOP (iMac), location=Castleberry Hill, eventType=DANCING, timestamp=2025-05-11T17:43:41}
PingEvent{user=AriWave, device=TABLET (iPad Pro), location=Edgewood, eventType=COFFEE, timestamp=2025-05-22T23:55:17}

Coming Soon
 integration for streaming

Real-time data simulation pipeline

Bridge to MySQL / BigQuery



🤝 Contributing
Contributions welcome! Fork the repo, make changes, and submit a PR.



👤 Author
Tristan R.
Follow more projects in this series.




