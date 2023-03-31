-- Part 1: Test it with SQL
CREATE TABLE jobs (
    name VARCHAR(255),
    employer VARCHAR(255),
    location VARCHAR(255),
    positionType VARCHAR(255),
    coreCompetency VARCHAR(255)
);
-- Part 2: Test it with SQL

SELECT name
FROM employer
WHERE location = "St. Louis City"

-- Part 3: Test it with SQL

DROP TABLE job

-- Part 4: Test it with SQL

SELECT *
FROM skill
LEFT JOIN job_skills ON skills_id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC

