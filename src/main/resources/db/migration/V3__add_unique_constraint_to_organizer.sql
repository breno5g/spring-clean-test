-- V3__add_unique_constraint_to_organizer.sql
ALTER TABLE events
    ADD CONSTRAINT unique_organizer UNIQUE (organizer);
