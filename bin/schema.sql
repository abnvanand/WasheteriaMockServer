CREATE TYPE STATUS AS ENUM ('vacant', 'occupied', 'malfunctioned');
CREATE TABLE users
(
    username   VARCHAR(50) PRIMARY KEY,
    token      VARCHAR(16) NOT NULL UNIQUE,
    expires_at TIMESTAMP
);

CREATE TABLE locations
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(64)
);


CREATE TABLE machines
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(30),
    location_id BIGINT NOT NULL,
    status      STATUS
);

CREATE TABLE events
(
    id          BIGSERIAL PRIMARY KEY,
    starts_at   TIMESTAMP,
    ends_at     TIMESTAMP,
    modified_at TIMESTAMP,
    cancelled   BOOLEAN,
    machine_id  BIGINT,
    creator  VARCHAR(50)
);

ALTER TABLE machines
    ADD FOREIGN KEY(location_id) REFERENCES locations(id);
ALTER TABLE events
    ADD FOREIGN KEY(machine_id) REFERENCES machines(id);
ALTER TABLE events
    ADD FOREIGN KEY(created_by) REFERENCES users(username);

CREATE INDEX IDX_MODIFIED_DATE_ ON events (modified_at);