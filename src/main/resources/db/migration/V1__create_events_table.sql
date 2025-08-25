-- V1__create_events_table.sql
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TYPE event_type AS ENUM (
    'CONCERT',
    'MOVIE',
    'MUSICAL',
    'OTHER'
);

CREATE TABLE events (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    initial_date TIMESTAMP NOT NULL,
    final_date TIMESTAMP NOT NULL,
    location VARCHAR(255) NOT NULL,
    capacity INTEGER NOT NULL,
    type event_type NOT NULL,
    identifier VARCHAR(255) NOT NULL,
    organizer VARCHAR(255) NOT NULL
);