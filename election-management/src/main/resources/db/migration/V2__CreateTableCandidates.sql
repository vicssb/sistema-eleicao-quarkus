CREATE TABLE elections(
    id VARCHAR(40) NOT NULL,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id));

CREATE TABLE election_candidate(
    election_id VARCHAR(40) NOT NULL,
    candidate_id VARCHAR(40) NOT NULL,
    votes INTEGER DEFAULT 0,
    PRIMARY KEY (election_id, candidate_id));

-- Created with Copilot.
INSERT INTO Candidatos (id, photo, givenName, familyName, email, phone, jobTitle)
VALUES
    ('1', NULL, 'João', 'Silva', 'joao@email.com', NULL, 'Prefeito'),
    ('2', NULL, 'Maria', 'Santos', 'maria@email.com', NULL, 'Vereadora'),
    ('3', NULL, 'Pedro', 'Oliveira', 'pedro@email.com', NULL, 'Vereador'),
    ('4', NULL, 'Ana', 'Pereira', 'ana@email.com', NULL, 'Prefeita'),
    ('5', NULL, 'Carlos', 'Rodrigues', 'carlos@email.com', NULL, 'Vereador'),
    ('6', NULL, 'Laura', 'Mendes', 'laura@email.com', NULL, 'Prefeita'),
    ('7', NULL, 'Fernando', 'Costa', 'fernando@email.com', NULL, 'Vereador'),
    ('8', NULL, 'Isabela', 'Almeida', 'isabela@email.com', NULL, 'Prefeita'),
    ('9', NULL, 'Rafael', 'Souza', 'rafael@email.com', NULL, 'Vereador'),
    ('10', NULL, 'Lúcia', 'Lima', 'lucia@email.com', NULL, 'Prefeita');

