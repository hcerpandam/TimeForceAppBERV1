INSERT INTO `timeforceapp`.`rol` (`id_rol`, `nombre_rol`) VALUES ('1', 'ROLE_USER');
INSERT INTO `timeforceapp`.`rol` (`id_rol`, `nombre_rol`) VALUES ('2', 'ROLE_ADMIN');
INSERT INTO `timeforceapp`.`rol` (`id_rol`, `nombre_rol`) VALUES ('3', 'ROLE_SADMIN');

INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('1', 'Cervera Panella', '2', b'0', '41005', 'A', '1981/09/02', 'Sevilla', 'h@gmail.com', 'Héctor', 'Alcántara', '1', '12345678', 'Sevilla', '1', '637111111', 'Calle', '45302175H', '1');
INSERT INTO `timeforceapp`.`usuario` (`id_usuario`, `apellidos`, `balance`, `baneado`, `codigo_pos`, `escalera`, `fecha_nac`, `localidad`, `mail`, `nombre_usu`, `nombre_via`, `numero_por`, `password`, `provincia`, `puerta`, `telefono`, `tipo_via`, `username`, `rol_id`) VALUES ('2', 'Castro García', '2', b'0', '41001', 'A', '1987/08/03', 'Bormujos', 'a@gmail.com', 'Alejandra', 'de Montaña', '4', '12345678', 'Sevilla', '1', '637111112', 'Plaza', '12345678F', '1');

INSERT INTO `timeforceapp`.`servicio` (`id_servicio`, `cancelado`, `categoria`, `descripcion_ser`, `fecha_hora`, `localizacion_acor`, `precio`, `consumidor_id`, `ofertante_id`) VALUES ('1', b'0', 'Clases', 'Clases de guitarra', '2019-02-12T00:00:00.000', '1', '2', '1', '2');

SELECT id_servicio, categoria, fecha_hora, consumidor_id, valoracion, localizacion_acor, cancelado FROM servicio WHERE ofertante_id=2