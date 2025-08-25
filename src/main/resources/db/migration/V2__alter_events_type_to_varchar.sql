-- V2__alter_events_type_to_varchar.sql

ALTER TABLE events
    ADD COLUMN type_temp VARCHAR(255);

UPDATE events
SET type_temp = type::text;

ALTER TABLE events
    DROP COLUMN type;

ALTER TABLE events
    RENAME COLUMN type_temp TO type;

DROP TYPE IF EXISTS event_type;