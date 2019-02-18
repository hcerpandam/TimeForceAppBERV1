INSERT INTO `timeforceapp`.`rol` (`id_rol`, `nombre_rol`) VALUES ('1', 'ROLE_USER');
INSERT INTO `timeforceapp`.`rol` (`id_rol`, `nombre_rol`) VALUES ('2', 'ROLE_ADMIN');

INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('1', 'Cervera Panella', '2', b'0', '41001', 'A', '1981/09/02', 'Madrid', 'c@gmail.com', 'Héctor', 'Alcántara', '1', '12345678', 'Madrid', '1', '637111111', 'Calle', '12345670A', '1');
INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('2', 'Estebánez García', '4', b'0', '41002', 'A', '1987/08/03', 'Bormujos', 'e@gmail.com', 'Alejandra', 'de Montaña', '4', '12345678', 'Sevilla', '1', '637111112', 'Plaza', '12345671B', '1');
INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('3', 'Alonso Verdeguer', '2', b'0', '41003', 'A', '1990/01/01', 'Valencia', 'a@gmail.com', 'Mario', 'Moraleja', '1', '12345678', 'Sevilla', '1', '637111113', 'Callejón', '12345672C', '2');
INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('4', 'Bermúdez Martínez', '2', b'0', '41004', 'A', '1981/09/02', 'Madrid', 'b@gmail.com', 'Emiliano', 'Rosaleda', '1', '12345678', 'Madrid', '1', '637111114', 'Avenida', '12345670D', '2');
INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('5', 'Damiel García', '8', b'0', '41005', 'A', '1981/09/02', 'Madrid', 'd@gmail.com', 'Sonsoles', 'Matahacas', '1', '12345678', 'Madrid', '1', '637111115', 'Calle', '12345670E', '1');
INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('6', 'Fernández Montes', '0', b'0', '41006', 'A', '1981/09/02', 'Madrid', 'f@gmail.com', 'Nuria', 'San Esteban', '1', '12345678', 'Madrid', '1', '637111116', 'Calle', '12345670F', '1');


INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `valoracion`, `consumidor_id`, `ofertante_id`) VALUES ('1', b'0', 'Clases', 'Clases de guitarra', '2019-02-12T11:00:00.000', '1', '2', '10', '2', '1');
INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `consumidor_id`, `ofertante_id`) VALUES ('2', b'0', 'Acompañamiento', 'Acompañamiento de personas mayores de 65 años el lunes de 10:00-14:00', '2019-02-12T10:00:00.000', '2', '4', '2', '1');
INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `consumidor_id`, `ofertante_id`) VALUES ('3', b'0', 'Reparaciones', 'Servicios de fontanería el miércoles de 10:00-12:00', '2019-02-20T10:00:00.000', '2', '4', '5', '2');
INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `consumidor_id`, `ofertante_id`) VALUES ('4', b'0', 'Mudanzas', 'Mudanzas de hasta tres viajes en furgoneta mediana el jueves de 12:00-14:00', '2019-02-21T12:00:00.000', '2', '4', '5', '2');
INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `consumidor_id`, `ofertante_id`) VALUES ('5', b'0', 'Conversación', 'Conversación en inglés con australiano el viernes de 10:00 a 11:00', '2019-02-22T11:00:00.000', '2', '4', '5', '6');
INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `consumidor_id`, `ofertante_id`) VALUES ('6', b'0', 'Clases', 'Clases de baile el sábado de 10:00-12:00', '2019-02-23T10:00:00.000', '2', '4', '5', '6');


