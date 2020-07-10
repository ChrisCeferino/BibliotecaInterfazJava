-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 11-07-2019 a las 06:11:08
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arriendo`
--

DROP TABLE IF EXISTS `arriendo`;
CREATE TABLE IF NOT EXISTS `arriendo` (
  `id` int(11) NOT NULL,
  `CostoTotal` int(11) DEFAULT NULL,
  `FechaArr` varchar(25) DEFAULT NULL,
  `FechaDevEntrega` varchar(25) DEFAULT NULL,
  `FechaDevReal` varchar(25) DEFAULT NULL,
  `DiasRetraso` int(11) DEFAULT NULL,
  `Multa` int(11) DEFAULT NULL,
  `Iva` int(11) DEFAULT NULL,
  `TipoPago_id` int(11) NOT NULL,
  `Trabajador_Rut` int(11) NOT NULL,
  `Cliente_rut` int(11) NOT NULL,
  PRIMARY KEY (`id`,`Trabajador_Rut`,`Cliente_rut`),
  KEY `fk_Arriendo_TipoPago1` (`TipoPago_id`),
  KEY `fk_Arriendo_Trabajador1` (`Trabajador_Rut`),
  KEY `fk_Arriendo_Cliente1` (`Cliente_rut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `arriendo`
--

INSERT INTO `arriendo` (`id`, `CostoTotal`, `FechaArr`, `FechaDevEntrega`, `FechaDevReal`, `DiasRetraso`, `Multa`, `Iva`, `TipoPago_id`, `Trabajador_Rut`, `Cliente_rut`) VALUES
(3123, 212000, '23/01/2019', '23/01/2019', '23/01/2019', 32, 71, 19, 2, 1, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

DROP TABLE IF EXISTS `autor`;
CREATE TABLE IF NOT EXISTS `autor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `ApellidoMaterno` varchar(45) DEFAULT NULL,
  `ApellidoPaterno` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `Eliminado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`id`, `Nombre`, `ApellidoMaterno`, `ApellidoPaterno`, `Estado`, `Eliminado`) VALUES
(1, 'Jose', 'Marso', 'Luigues', 'Activo', NULL),
(2, 'mario', 'cascadas', 'fuentes', 'Activo', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autorlibro`
--

DROP TABLE IF EXISTS `autorlibro`;
CREATE TABLE IF NOT EXISTS `autorlibro` (
  `Autor_id` int(11) NOT NULL,
  `Libro_Serie` int(11) NOT NULL,
  PRIMARY KEY (`Autor_id`,`Libro_Serie`),
  KEY `fk_Autor_has_Libro_Libro1` (`Libro_Serie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `autorlibro`
--

INSERT INTO `autorlibro` (`Autor_id`, `Libro_Serie`) VALUES
(2, 12),
(1, 321),
(2, 12345);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

DROP TABLE IF EXISTS `boleta`;
CREATE TABLE IF NOT EXISTS `boleta` (
  `folio` int(11) NOT NULL,
  `PrecioNeto` int(11) DEFAULT NULL,
  `PrecioIva` int(11) DEFAULT NULL,
  `CostoIva` int(11) DEFAULT NULL,
  `FechaVenta` varchar(25) DEFAULT NULL,
  `HoraVenta` varchar(10) DEFAULT NULL,
  `Iva` int(11) DEFAULT NULL,
  `TipoPago_id` int(11) NOT NULL,
  PRIMARY KEY (`folio`),
  KEY `fk_Boleta_TipoPago1` (`TipoPago_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `boleta`
--

INSERT INTO `boleta` (`folio`, `PrecioNeto`, `PrecioIva`, `CostoIva`, `FechaVenta`, `HoraVenta`, `Iva`, `TipoPago_id`) VALUES
(1, 14000, 16660, 2660, '12/03/19', '12:08', 19, 1),
(13, 123, 146, 23, '123', '312', 19, 3),
(123, 12000, 14280, 2280, '12/03/2019', '15:02', 19, 3),
(124, 15000000, 17850000, 2850000, '12/02', '12:02', 19, 1),
(125, 123, 146, 23, '12/06', '2:02', 19, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE IF NOT EXISTS `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `Nombre`, `Descripcion`, `Estado`) VALUES
(1, 'Niños', 'Pequeños', 'activo'),
(2, 'Adultos', 'Mediana Edad', 'activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `rut` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `ApellidoMaterno` varchar(45) DEFAULT NULL,
  `ApellidoPaterno` varchar(45) DEFAULT NULL,
  `FechaNac` varchar(25) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`rut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`rut`, `Nombre`, `ApellidoMaterno`, `ApellidoPaterno`, `FechaNac`, `Estado`) VALUES
(0, 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguno'),
(12, 'Francisco', 'Caiseo', 'IndioPicaro', '12/12/1998', 'Soltebrio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

DROP TABLE IF EXISTS `compra`;
CREATE TABLE IF NOT EXISTS `compra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Distribuidor_rut` int(11) NOT NULL,
  `Trabajador_Rut` int(11) NOT NULL,
  `Factura_folio` int(11) NOT NULL,
  PRIMARY KEY (`id`,`Factura_folio`),
  KEY `fk_Compra_Distribuidor1` (`Distribuidor_rut`),
  KEY `fk_Compra_Trabajador1` (`Trabajador_Rut`),
  KEY `fk_Compra_Factura1` (`Factura_folio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`id`, `Distribuidor_rut`, `Trabajador_Rut`, `Factura_folio`) VALUES
(1, 0, 1, 1),
(3, 0, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `correo`
--

DROP TABLE IF EXISTS `correo`;
CREATE TABLE IF NOT EXISTS `correo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Cliente_rut` int(11) DEFAULT NULL,
  `Trabajador_Rut` int(11) DEFAULT NULL,
  `Distribuidor_rut` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Correo_Cliente1` (`Cliente_rut`),
  KEY `fk_Correo_Trabajador1` (`Trabajador_Rut`),
  KEY `fk_Correo_Distribuidor1` (`Distribuidor_rut`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `correo`
--

INSERT INTO `correo` (`id`, `Nombre`, `Cliente_rut`, `Trabajador_Rut`, `Distribuidor_rut`) VALUES
(1, 'profe@alumno.cl', 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallearr`
--

DROP TABLE IF EXISTS `detallearr`;
CREATE TABLE IF NOT EXISTS `detallearr` (
  `libro_serie` int(12) NOT NULL,
  `arriendo_id` int(12) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detallearr`
--

INSERT INTO `detallearr` (`libro_serie`, `arriendo_id`) VALUES
(12345, 123),
(12, 3123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

DROP TABLE IF EXISTS `direccion`;
CREATE TABLE IF NOT EXISTS `direccion` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`id`, `Nombre`) VALUES
(1, 'asd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccioncliente`
--

DROP TABLE IF EXISTS `direccioncliente`;
CREATE TABLE IF NOT EXISTS `direccioncliente` (
  `Direccion_id` int(11) NOT NULL,
  `Cliente_rut` int(11) NOT NULL,
  PRIMARY KEY (`Direccion_id`,`Cliente_rut`),
  KEY `fk_Direccion_has_Cliente_Cliente1` (`Cliente_rut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direcciontrabajador`
--

DROP TABLE IF EXISTS `direcciontrabajador`;
CREATE TABLE IF NOT EXISTS `direcciontrabajador` (
  `Direccion_id` int(11) NOT NULL,
  `Trabajador_Rut` int(11) NOT NULL,
  PRIMARY KEY (`Direccion_id`,`Trabajador_Rut`),
  KEY `fk_Direccion_has_Trabajador_Trabajador1` (`Trabajador_Rut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribuidor`
--

DROP TABLE IF EXISTS `distribuidor`;
CREATE TABLE IF NOT EXISTS `distribuidor` (
  `rut` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `añoIn` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `Direccion_id` int(11) NOT NULL,
  PRIMARY KEY (`rut`),
  KEY `fk_Distribuidor_Direccion1` (`Direccion_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `distribuidor`
--

INSERT INTO `distribuidor` (`rut`, `Nombre`, `añoIn`, `Estado`, `Direccion_id`) VALUES
(0, 'Ninguno', 'Ninguno', 'Ninguno', 1),
(1, 'ElRinconDelVago', '2005', 'Activo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `editorial`
--

DROP TABLE IF EXISTS `editorial`;
CREATE TABLE IF NOT EXISTS `editorial` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `Eliminado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `editorial`
--

INSERT INTO `editorial` (`id`, `Nombre`, `Descripcion`, `Estado`, `Eliminado`) VALUES
(1, 'LaKK', 'KK', 'Disponible', NULL),
(2, 'CKL', 'CKLenguaje', 'Disponible', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE IF NOT EXISTS `factura` (
  `folio` int(11) NOT NULL,
  `PrecioNeto` int(11) DEFAULT NULL,
  `PrecioTotal` int(11) DEFAULT NULL,
  `CostoIva` int(11) DEFAULT NULL,
  `fechaCompra` varchar(25) NOT NULL,
  `HoraCompra` varchar(45) DEFAULT NULL,
  `Iva` int(11) DEFAULT NULL,
  `TipoPago_id` int(11) NOT NULL,
  PRIMARY KEY (`folio`),
  KEY `fk_Factura_TipoPago1` (`TipoPago_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`folio`, `PrecioNeto`, `PrecioTotal`, `CostoIva`, `fechaCompra`, `HoraCompra`, `Iva`, `TipoPago_id`) VALUES
(1, 12000, 14280, 2280, '12/03/2016', '12:08', 19, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idioma`
--

DROP TABLE IF EXISTS `idioma`;
CREATE TABLE IF NOT EXISTS `idioma` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `idioma`
--

INSERT INTO `idioma` (`id`, `Nombre`, `Descripcion`, `Estado`) VALUES
(1, 'Ingles', 'English', 'activo'),
(2, 'Español', 'España', 'activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idiomalibro`
--

DROP TABLE IF EXISTS `idiomalibro`;
CREATE TABLE IF NOT EXISTS `idiomalibro` (
  `Idioma_id` int(11) NOT NULL,
  `Libro_Serie` int(11) NOT NULL,
  PRIMARY KEY (`Idioma_id`,`Libro_Serie`),
  KEY `fk_IdiomaLibro_Libro1` (`Libro_Serie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `idiomalibro`
--

INSERT INTO `idiomalibro` (`Idioma_id`, `Libro_Serie`) VALUES
(2, 12),
(1, 321),
(2, 12345);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

DROP TABLE IF EXISTS `libro`;
CREATE TABLE IF NOT EXISTS `libro` (
  `Serie` int(11) NOT NULL,
  `ISBN` varchar(45) NOT NULL,
  `Titulo` varchar(45) DEFAULT NULL,
  `NPag` int(11) DEFAULT NULL,
  `Precio` int(11) DEFAULT NULL,
  `Anio` int(11) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `Editorial_id` int(11) NOT NULL,
  PRIMARY KEY (`Serie`),
  KEY `fk_Libro_Editorial1` (`Editorial_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`Serie`, `ISBN`, `Titulo`, `NPag`, `Precio`, `Anio`, `Estado`, `Editorial_id`) VALUES
(12, '1231', 'ewq', 12, 123, 1298, 'BuenEstado', 2),
(321, '3214', 'Doraemon', 150, 15000000, 2020, 'Buenisimo', 1),
(12345, '2345', 'Principito 2', 150, 20000, 2010, 'Buen Estado', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `librocategoria`
--

DROP TABLE IF EXISTS `librocategoria`;
CREATE TABLE IF NOT EXISTS `librocategoria` (
  `Libro_Serie` int(11) NOT NULL,
  `Categoria_id` int(11) NOT NULL,
  PRIMARY KEY (`Libro_Serie`,`Categoria_id`),
  KEY `fk_Libro_has_Categoria_Categoria1` (`Categoria_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `librocategoria`
--

INSERT INTO `librocategoria` (`Libro_Serie`, `Categoria_id`) VALUES
(12, 2),
(321, 2),
(12345, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `librocompra`
--

DROP TABLE IF EXISTS `librocompra`;
CREATE TABLE IF NOT EXISTS `librocompra` (
  `libro_serie` int(11) NOT NULL,
  `compra_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `librocompra`
--

INSERT INTO `librocompra` (`libro_serie`, `compra_id`) VALUES
(321, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libroventa`
--

DROP TABLE IF EXISTS `libroventa`;
CREATE TABLE IF NOT EXISTS `libroventa` (
  `libro_serie` int(12) NOT NULL,
  `venta_id` int(12) NOT NULL,
  PRIMARY KEY (`venta_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `libroventa`
--

INSERT INTO `libroventa` (`libro_serie`, `venta_id`) VALUES
(321, 12),
(321, 2),
(12, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

DROP TABLE IF EXISTS `telefono`;
CREATE TABLE IF NOT EXISTS `telefono` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Numero` int(11) DEFAULT NULL,
  `Eliminado` varchar(45) DEFAULT NULL,
  `Trabajador_Rut` int(11) DEFAULT NULL,
  `Distribuidor_rut` int(11) DEFAULT NULL,
  `Cliente_rut` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Telefono_Trabajador1` (`Trabajador_Rut`),
  KEY `fk_Telefono_Distribuidor1` (`Distribuidor_rut`),
  KEY `fk_Telefono_Cliente1` (`Cliente_rut`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `telefono`
--

INSERT INTO `telefono` (`id`, `Numero`, `Eliminado`, `Trabajador_Rut`, `Distribuidor_rut`, `Cliente_rut`) VALUES
(1, 12345, NULL, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopago`
--

DROP TABLE IF EXISTS `tipopago`;
CREATE TABLE IF NOT EXISTS `tipopago` (
  `id` int(11) NOT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipopago`
--

INSERT INTO `tipopago` (`id`, `Descripcion`) VALUES
(1, 'Efectivo'),
(2, 'Debito'),
(3, 'Credito/Visa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipotrabaj`
--

DROP TABLE IF EXISTS `tipotrabaj`;
CREATE TABLE IF NOT EXISTS `tipotrabaj` (
  `id` int(11) NOT NULL,
  `TipoTrabaj` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipotrabaj`
--

INSERT INTO `tipotrabaj` (`id`, `TipoTrabaj`) VALUES
(2, 'Martillero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

DROP TABLE IF EXISTS `trabajador`;
CREATE TABLE IF NOT EXISTS `trabajador` (
  `Rut` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `ApellidoMaterno` varchar(45) DEFAULT NULL,
  `ApellidoPaterno` varchar(45) DEFAULT NULL,
  `FechaContrato` varchar(25) DEFAULT NULL,
  `TipoTrabaj_id` int(11) NOT NULL,
  PRIMARY KEY (`Rut`),
  KEY `fk_Trabajador_TipoTrabaj1` (`TipoTrabaj_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`Rut`, `Nombre`, `ApellidoMaterno`, `ApellidoPaterno`, `FechaContrato`, `TipoTrabaj_id`) VALUES
(0, 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguno', 2),
(1, 'Mario', 'Luigi', 'Bros', '1/3/98', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

DROP TABLE IF EXISTS `venta`;
CREATE TABLE IF NOT EXISTS `venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Boleta_folio` int(11) NOT NULL,
  `Cliente_rut` int(11) NOT NULL,
  `Trabajador_Rut` int(11) NOT NULL,
  PRIMARY KEY (`id`,`Boleta_folio`,`Cliente_rut`,`Trabajador_Rut`),
  KEY `fk_Venta_Boleta1` (`Boleta_folio`),
  KEY `fk_Venta_Cliente1` (`Cliente_rut`),
  KEY `fk_Venta_Trabajador1` (`Trabajador_Rut`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id`, `Boleta_folio`, `Cliente_rut`, `Trabajador_Rut`) VALUES
(1, 123, 12, 1),
(2, 124, 12, 1),
(3, 125, 12, 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD CONSTRAINT `fk_Arriendo_Cliente1` FOREIGN KEY (`Cliente_rut`) REFERENCES `cliente` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Arriendo_TipoPago1` FOREIGN KEY (`TipoPago_id`) REFERENCES `tipopago` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Arriendo_Trabajador1` FOREIGN KEY (`Trabajador_Rut`) REFERENCES `trabajador` (`Rut`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `autorlibro`
--
ALTER TABLE `autorlibro`
  ADD CONSTRAINT `fk_Autor_has_Libro_Autor` FOREIGN KEY (`Autor_id`) REFERENCES `autor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Autor_has_Libro_Libro1` FOREIGN KEY (`Libro_Serie`) REFERENCES `libro` (`Serie`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `fk_Boleta_TipoPago1` FOREIGN KEY (`TipoPago_id`) REFERENCES `tipopago` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `fk_Compra_Distribuidor1` FOREIGN KEY (`Distribuidor_rut`) REFERENCES `distribuidor` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Compra_Factura1` FOREIGN KEY (`Factura_folio`) REFERENCES `factura` (`folio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Compra_Trabajador1` FOREIGN KEY (`Trabajador_Rut`) REFERENCES `trabajador` (`Rut`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `correo`
--
ALTER TABLE `correo`
  ADD CONSTRAINT `fk_Correo_Cliente1` FOREIGN KEY (`Cliente_rut`) REFERENCES `cliente` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Correo_Distribuidor1` FOREIGN KEY (`Distribuidor_rut`) REFERENCES `distribuidor` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Correo_Trabajador1` FOREIGN KEY (`Trabajador_Rut`) REFERENCES `trabajador` (`Rut`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `direccioncliente`
--
ALTER TABLE `direccioncliente`
  ADD CONSTRAINT `fk_Direccion_has_Cliente_Cliente1` FOREIGN KEY (`Cliente_rut`) REFERENCES `cliente` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Direccion_has_Cliente_Direccion1` FOREIGN KEY (`Direccion_id`) REFERENCES `direccion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `direcciontrabajador`
--
ALTER TABLE `direcciontrabajador`
  ADD CONSTRAINT `fk_Direccion_has_Trabajador_Direccion1` FOREIGN KEY (`Direccion_id`) REFERENCES `direccion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Direccion_has_Trabajador_Trabajador1` FOREIGN KEY (`Trabajador_Rut`) REFERENCES `trabajador` (`Rut`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD CONSTRAINT `fk_Distribuidor_Direccion1` FOREIGN KEY (`Direccion_id`) REFERENCES `direccion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `fk_Factura_TipoPago1` FOREIGN KEY (`TipoPago_id`) REFERENCES `tipopago` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `idiomalibro`
--
ALTER TABLE `idiomalibro`
  ADD CONSTRAINT `fk_IdiomaLibro_Idioma1` FOREIGN KEY (`Idioma_id`) REFERENCES `idioma` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_IdiomaLibro_Libro1` FOREIGN KEY (`Libro_Serie`) REFERENCES `libro` (`Serie`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `fk_Libro_Editorial1` FOREIGN KEY (`Editorial_id`) REFERENCES `editorial` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `librocategoria`
--
ALTER TABLE `librocategoria`
  ADD CONSTRAINT `fk_Libro_has_Categoria_Categoria1` FOREIGN KEY (`Categoria_id`) REFERENCES `categoria` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Libro_has_Categoria_Libro1` FOREIGN KEY (`Libro_Serie`) REFERENCES `libro` (`Serie`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD CONSTRAINT `fk_Telefono_Cliente1` FOREIGN KEY (`Cliente_rut`) REFERENCES `cliente` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Telefono_Distribuidor1` FOREIGN KEY (`Distribuidor_rut`) REFERENCES `distribuidor` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Telefono_Trabajador1` FOREIGN KEY (`Trabajador_Rut`) REFERENCES `trabajador` (`Rut`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `fk_Trabajador_TipoTrabaj1` FOREIGN KEY (`TipoTrabaj_id`) REFERENCES `tipotrabaj` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_Venta_Boleta1` FOREIGN KEY (`Boleta_folio`) REFERENCES `boleta` (`folio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Venta_Cliente1` FOREIGN KEY (`Cliente_rut`) REFERENCES `cliente` (`rut`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Venta_Trabajador1` FOREIGN KEY (`Trabajador_Rut`) REFERENCES `trabajador` (`Rut`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
