INSERT INTO users(username, token, expires_at)
VALUES ('abhinav.anand@students.iiit.ac.in', '23ewhcudw', '2020-12-12');
INSERT INTO users(username, token, expires_at)
VALUES ('neeraj.barthwal@students.iiit.ac.in', '32u09c4309jr3', '2020-10-12');
INSERT INTO users(username, token, expires_at)
VALUES ('lokesh.singh@students.iiit.ac.in', 'few094irfm', '2020-12-10');

INSERT INTO locations (name)
VALUES ('OBH');
INSERT INTO locations (name)
VALUES ('NBH');
INSERT INTO locations (name)
VALUES ('Parijat');

INSERT INTO machines(name, location_id, status)
VALUES ('OBH1', (SELECT id FROM locations WHERE name = 'OBH'), 'vacant');
INSERT INTO machines(name, location_id, status)
VALUES ('OBH2', (SELECT id FROM locations WHERE name = 'OBH'), 'occupied');
INSERT INTO machines(name, location_id, status)
VALUES ('OBH3', (SELECT id FROM locations WHERE name = 'OBH'), 'vacant');
INSERT INTO machines(name, location_id, status)
VALUES ('OBH4', (SELECT id FROM locations WHERE name = 'OBH'), 'malfunctioned');

INSERT INTO machines(name, location_id, status)
VALUES ('NBH1', (SELECT id FROM locations WHERE name = 'NBH'), 'vacant');
INSERT INTO machines(name, location_id, status)
VALUES ('NBH2', (SELECT id FROM locations WHERE name = 'NBH'), 'occupied');
INSERT INTO machines(name, location_id, status)
VALUES ('NBH3', (SELECT id FROM locations WHERE name = 'NBH'), 'occupied');
INSERT INTO machines(name, location_id, status)
VALUES ('NBH4', (SELECT id FROM locations WHERE name = 'NBH'), 'malfunctioned');

INSERT INTO machines(name, location_id, status)
VALUES ('Parijat1', (SELECT id FROM locations WHERE name = 'Parijat'), 'vacant');
INSERT INTO machines(name, location_id, status)
VALUES ('Parijat2', (SELECT id FROM locations WHERE name = 'Parijat'), 'occupied');
INSERT INTO machines(name, location_id, status)
VALUES ('Parijat3', (SELECT id FROM locations WHERE name = 'Parijat'), 'malfunctioned');
INSERT INTO machines(name, location_id, status)
VALUES ('Parijat4', (SELECT id FROM locations WHERE name = 'Parijat'), 'vacant');



INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES (now(),
        (NOW() + interval '1 hour'),
        now(),
        false, (SELECT id from machines WHERE name = 'OBH1'),
        'abhinav.anand@students.iiit.ac.in');

INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ((NOW() + interval '3 hour'),
        (NOW() + interval '4 hour'),
        NOW(),
        false,
        (SELECT id from machines WHERE name = 'OBH2'),
        'abhinav.anand@students.iiit.ac.in');

INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ((NOW() - interval '1 hour 50 minutes'),
        (NOW() + interval '1 hour 30 minutes'),
        (NOW() - interval '1 hour 50 minutes'), false,
        (SELECT id from machines WHERE name = 'OBH1'),
        'abhinav.anand@students.iiit.ac.in');

INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ((NOW() + interval '1 day'),
        (NOW() + interval '1 day 1 hour'),
        NOW(),
        false,
        (SELECT id from machines WHERE name = 'OBH1'),
        'abhinav.anand@students.iiit.ac.in');

INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ((NOW() + interval '2 day'),
        (NOW() + interval '2 day 50 minutes'),
        (NOW()), false,
        (SELECT id from machines WHERE name = 'OBH1'),
        'neeraj.barthwal@students.iiit.ac.in');

INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ('2020-05-28T11:24:00', '2020-05-28T12:24:00', '2020-05-28T11:24:00', false,
        (SELECT id from machines WHERE name = 'OBH1'),
        'abhinav.anand@students.iiit.ac.in');
INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ('2020-05-28T11:24:00', '2020-05-28T12:24:00', '2020-05-28T11:24:00', false,
        (SELECT id from machines WHERE name = 'OBH1'),
        'abhinav.anand@students.iiit.ac.in');
INSERT INTO events(starts_at, ends_at, modified_at, cancelled, machine_id, creator)
VALUES ('2020-05-28T11:24:00', '2020-05-28T12:24:00', '2020-05-28T11:24:00', false,
        (SELECT id from machines WHERE name = 'OBH1'),
        'abhinav.anand@students.iiit.ac.in');
