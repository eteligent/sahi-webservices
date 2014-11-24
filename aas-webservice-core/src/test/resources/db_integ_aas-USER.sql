CREATE DATABASE IF NOT EXISTS  db_integ_aas;
CREATE USER 'db_integ_aas'@'localhost' IDENTIFIED BY 'db_integ_aas';
CREATE USER 'db_integ_aas'@'*' IDENTIFIED BY 'db_integ_aas';

GRANT ALL PRIVILEGES ON db_integ_aas.* TO 'db_integ_aas'@'localhost';
GRANT ALL PRIVILEGES ON db_integ_aas.* TO 'db_integ_aas'@'*';

FLUSH PRIVILEGES;

COMMIT;