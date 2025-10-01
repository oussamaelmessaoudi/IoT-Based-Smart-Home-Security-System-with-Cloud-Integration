# IoT-Based Smart Home Security with Cloud Integration

This project is a Spring Boot-based IoT smart home platform tgat connects devices like motion sensors, smart locks, and ESP32 simulators (via Wokwià to secure cloud backend.

it integrates MQTT, Kafka, gRPC, PostgreSQL, TimescaleDB, and Redis to handle telemetry, commands, and alerts in real time.

## Context
There is no specific context, it's just my major related topic and i want to go wild on it.

## System Architecture
![System Architecture Overview](docs/assets/System-design.jpg)

### Component Responsibilities
#### Device Registry Service
- Device provisioning & lifecycle
- Certificate management
- Device metadata & status
- Authorization policies

#### Telemetry Ingestor
- Real-time data ingestion
- Deduplication & validation
- Time-series storage
- Aggregation pipelines

#### Command Controller
- Device command dispatch
- Idempontency handling
- Command acknowledgment
- Retry & fallback logic

## Project Structure
```
IoT-Based-Smart-Home-Security-System-with-Cloud-Integration/
├── backend/
│   ├── src/main/java/com/iot/smarthome/
│   │   ├── controller/
│   │   │   ├── 
│   │   │   └── 
│   │   ├── service/
│   │   │   ├── 
│   │   │   ├── 
│   │   │   └── 
│   │   ├── repository/
│   │   │   ├── 
│   │   │   └── 
│   │   ├── model/
│   │   │   ├── 
│   │   │   ├── 
│   │   │   └── 
│   │   ├── dto/
│   │   │   ├── 
│   │   │   ├── 
│   │   │   └── 
│   │   ├── config/
│   │   │   ├── 
│   │   │   ├── 
│   │   │   └── 
│   │   └── exception/
│   │       ├── 
│   │       └── 
│   ├── src/main/proto/
│   │   └── device_service.proto
│   └── pom.xml
├── telemetry-ingestor-service/
├── command-controller-service/
├── alert-service/
├── ota-service/
└── user-management-service/
```
