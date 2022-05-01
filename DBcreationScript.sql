CREATE
DATABASE ITicket;

USE
ITicket;

CREATE TABLE `Event`
(
    `EventID`    int         NOT NULL,
    `Name`       VARCHAR(50) NOT NULL,
    `Cost`       int         NOT NULL,
    `Date`       Date        NOT NULL,
    `LocationID` int         NOT NULL,
    `ArtisID`    int         NOT NULL,
    PRIMARY KEY (
                 `EventID`
        )
);

CREATE TABLE `Location`
(
    `LocationID`       int NOT NULL,
    `MaximumOccupancy` int NOT NULL,
    `Address`          VARCHAR(50) NULL,
    PRIMARY KEY (
                 `LocationID`
        )
);

CREATE TABLE `Artis`
(
    `ArtisID`     int         NOT NULL,
    `StageName`   VARCHAR(50) NOT NULL,
    `FirstName`   VARCHAR(50) NULL,
    `LastName`    VARCHAR(50) NULL,
    `PhoneNumber` VARCHAR(50) NULL,
    PRIMARY KEY (
                 `ArtisID`
        )
);

ALTER TABLE `Event`
    ADD CONSTRAINT `fk_Event_LocationID` FOREIGN KEY (`LocationID`)
        REFERENCES `Location` (`LocationID`);

ALTER TABLE `Event`
    ADD CONSTRAINT `fk_Event_ArtisID` FOREIGN KEY (`ArtisID`)
        REFERENCES `Artis` (`ArtisID`);
