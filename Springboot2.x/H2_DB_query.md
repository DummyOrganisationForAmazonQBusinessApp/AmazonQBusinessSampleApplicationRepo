CREATE TABLE asset (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    location VARCHAR(255),
    description TEXT,
    class VARCHAR(255)
);

INSERT INTO asset (name, location, description, class) VALUES
('Smart Meter Reading', 'Residential Home', 'A smart meter at a home sends electricity usage data to the utility company.', 'Energy Management'),
('Solar Power Monitoring', 'Solar Power Plant', 'Solar panels at a plant generate electricity and send performance data to a central system.', 'Renewable Energy'),
('Wind Turbine Maintenance', 'Wind Farm', 'Wind turbines at a farm send operational data to a central system.', 'Renewable Energy'),
('Water Usage Monitoring', 'City Water Supply System', 'Sensors in a city''s water system send usage data to a central system.', 'Water Management'),
('Power Grid Management', 'Power Grid Control Center', 'Sensors in a power grid send supply and demand data to a control center.', 'Energy Management'),
('Traffic Management', 'City Traffic Control', 'Sensors in traffic lights send traffic flow data to a control center.', 'Traffic Management'),
('Waste Management', 'City Waste Management System', 'Sensors in waste bins send fill-level data to a central system.', 'Waste Management'),
('Air Quality Monitoring', 'City Environmental Department', 'Sensors around the city send air quality data to a central system.', 'Environmental Management'),
('Public Transport Management', 'City Transport Department', 'Sensors in buses send location and occupancy data to a control center.', 'Transport Management'),
('Building Energy Management', 'Commercial Building', 'Sensors in a building send energy usage data to a management system.', 'Energy Management');

SELECT * FROM asset;