INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('user', '$2a$10$GOk2QTNdsP9JBb6KPnI96eXl7r0oBujQ2d0909Ozp.YzjimUvuHR2', 1, 'User', 'user', 'emailuser@email.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$p89fJBZHTFuKYFut83xDK.Cua9wc60etsEXOLjuTwbcrOEGn9gzSu', 1, 'Admin', 'admin', 'emailAdmin@email.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);