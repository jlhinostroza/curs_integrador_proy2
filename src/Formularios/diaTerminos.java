package Formularios;

import Clases.DatosPrograma;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class diaTerminos extends javax.swing.JDialog {

    public static boolean aceptTerminos = false;

    public diaTerminos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("FácilEnvío Desktop App - Version: " + DatosPrograma.version);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        setIconImage(icono.getImage());

        labTexto.setText("<html><h4><center><b>Introducción</b></center></h4>   \n"
                + "                            <p align=\"justify\">\n"
                + "                            Las presentes condiciones generales de uso, regulan los términos de uso y políticas de privacidad del sitio web:\n"
                + "                             <a href=\"https://atc.olvaexpress.pe/user/logout\">https://atc.olvaexpress.pe/user/logout</a> (en adelante, “Zona Clientes”). \n"
                + "                             El Usuario del Portal (en adelante “Usuario”) deberá de leer y aceptar para usar el servicio que se facilitan desde el portal Zona Clientes. El acceso y registro de información y/o utilización del sitio web, de todos o parte de sus contenidos y/o servicios significa haber leído, comprendido y aceptado los Términos de uso y políticas de privacidad que a continuación se enlistan.\n"
                + "                            </p>\n"
                + "                            <br>\n"
                + "                            <br>\n"
                + "                            <h4><center><b>Registro del usuario (Afiliación al servicio)</b></center></h4>   \n"
                + "                            <p align=\"justify\">\n"
                + "                            Requisito indispensable para acceder y posteriormente efectivizar programar el recojo de tus envíos en este sitio web es que estés previamente registrado como usuario del servicio.</p>\n"
                + "                            <p align=\"justify\">\n"
                + "                            Los datos necesarios para este registro son: Razón social o nombre completo, RUC, tipo y número de documento de identidad, una dirección de correo electrónico (que Olva Courier S.A.C. empleará en adelante para enviar comunicaciones al usuario relacionadas al proceso de afiliación, así como a la programación de recojos de tus envíos que efectúes en este sitio web) y una clave de acceso a este sitio web que deberás definir y luego confirmar.</p>\n"
                + "                            <p align=\"justify\">\n"
                + "                            Para que el registro como usuario de esta plataforma de programación de recojo de envíos online se efectivice debes finalmente aceptar los términos de uso y políticas de privacidad.</p>\n"
                + "                            <br>\n"
                + "                            <h4><center><b>Registro y uso del sitio</b></center></h4>      \n"
                + "                            <p align=\"justify\">\n"
                + "                            Es obligatorio completar el formulario zona clientes en todos sus campos con datos válidos para poder utilizar el servicio que brinda Olva Courier S.A.C. El Usuario deberá definir en el mencionado Zona clientes programar mi recojos información personal y de su cliente que le sea solicitada de manera exacta, precisa y verdadera (en adelante, los  \n"
                + "                            \"Datos Personales\") y asume el compromiso de actualizar los Datos Personales conforme resulte necesario. El Usuario presta expresa conformidad con que Olva Courier S.A.C. utilice diversos medios para identificar sus datos personales. Asumiendo la obligación de revisarlos y mantenerlos actualizados. Olva Courier S.A.C. no se responsabiliza por la certeza de los datos personales de los usuarios. Los usuarios garantizan y responden, en cualquier caso, de la veracidad, exactitud, vigencia y autenticidad de sus datos personales y de sus clientes. El usuario puede modificar los datos del registro de envíos si existiera algún error en el ingreso de datos, también podrá realizar la edición de sus envíos registrados cuando el operador de olva lo visite. El usuario será responsable por todas las operaciones efectuadas en sitio web Zona Clientes. El usuario se compromete a notificar a Olva Courier S.A.C. en forma inmediata, por algún medio de comunicación idóneo, cualquier utilización no autorizada de sus datos personales por parte de terceros. Se deja constancia que se encuentra prohibida la transferencia de identidad o N° de DNI. El usuario deberá contar como requisito, el acceso a una PC o dispositivo móvil con acceso a internet para programar el recojo de sus envíos.\n"
                + "</p>    \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Baja de usuario</b></center></h4>   \n"
                + "                            <p align=\"justify\">\n"
                + "                            En el supuesto que desee dar de baja a su cuenta o usuario, deberá solicitarlo a la dirección: <b>usuarios@olva.com.pe</b>, la cuenta se desactivará inmediatamente, pasados 30 días se eliminará de manera permanente, Olva no almacena datos de los clientes después de eliminada la cuenta por lo que deberá registrarse como usuario nuevo a fin de poder utilizar nuevamente el servicio.</p>\n"
                + "                            <br>\n"
                + "                            <h4><center><b>Fallas del sistema o del sitio web</b></center></h4>     \n"
                + "                            <p align=\"justify\">\n"
                + "                            Olva Courier S.A.C. no se responsabiliza por cualquier daño o menoscabo generado al usuario por fallas de la red de internet, del servidor o del sistema. Olva Courier S.A.C. tampoco será responsable por cualquier virus, malware, spyware o similares, que pudieran afectar el dispositivo Móvil o Pc como consecuencia del acceso, uso o examen del sitio web a razón de la transferencia de datos, textos, o contenido en general. Olva Courier S.A.C. no garantiza el acceso y uso continuado o ininterrumpido de su sitio web. El sistema puede eventualmente no estar disponible debido a dificultades técnicas o fallas de Internet, o por cualquier otra circunstancia ajena a Olva Courier S.A.C.; en tales casos, se procurará reestablecerlo con la mayor celeridad posible sin que por ello genere responsabilidad por daños y perjuicios directos, consecuentes, incidentales, punitivos o ejemplares, ni por lucro cesante o pérdida de ingresos. Información Recibida en el trayecto del uso que el Usuario realice del sitio web y/o de los servicios puestos a su disposición a través del mismo, se le puede pedir que proporcione cierta información personalizada tales como nombre del destinatario y/o receptor, contacto, DNI, RUC, dirección domiciliaria, dirección electrónica, teléfonos, entre otros, que se denomina como “Información Recibida”, la cual es relevante para el éxito de la entrega, con el fin de poder brindar al Usuario un servicio de mayor eficacia, calidad y rapidez. Olva Courier S.A.C. no solicitará mayor información que la descrita línea arriba, por ningún medio, sitio web, correo electrónico u otra forma de comunicación.</p>        \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Privacidad de la información del consumidor</b></center></h4>\n"
                + "                            <p align=\"justify\">\n"
                + "                            Olva Courier S.A.C. tiene la calidad de “Encargado del Tratamiento”, conforme a lo establecido en la Ley de Protección de Datos Personales – Ley No. 29733. En ese sentido, Olva Courier S.A.C. tendrá acceso a datos de los usuarios por lo que se obliga a protegerlos aplicando las exigencias y requerimientos previstos en la Ley de Protección de Datos Personales (Ley No. 29733), su reglamento aprobado por Decreto Supremo No. 003-2013-JUS y demás normas relacionadas que regulan la materia. Por medio de la aceptación de estos Términos de uso y políticas de privacidad, el usuario tiene conocimiento que sus datos personales y en general, la información que brinde al sitio web: <a href=\"https://atc.olvaexpress.pe/user/logout\">https://atc.olvaexpress.pe/user/logout</a>, serán utilizados para los fines comerciales de Olva Courier S.A.C., asimismo se compromete a no compartir los datos personales del Usuario con terceros para una finalidad distinta a la que el Usuario ha consentido. Por último, Olva Courier S.A.C. se compromete a cooperar con la Autoridad Nacional de Protección de Datos Personales o cualquier otra autoridad administrativa para satisfacer los requerimientos o exigencias de las mismas.</p>    \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Propiedad Intelectual</b></center></h4>\n"
                + "                            <p align=\"justify\">\n"
                + "                            El derecho de autor de todo el Contenido pertenece y continuará perteneciendo a Olva Courier S.A.C., a sus empresas filiales, o a sus licenciatarios según proceda. A menos que se indique lo contrario en documentos específicos en el Sitio, usted está autorizado para ver, reproducir, imprimir y descargar contenido que se encuentra en el Sitio solamente con fines personales, informativos y no comerciales. Usted no puede modificar materiales y no puede copiar, distribuir, transmitir, mostrar, ejecutar, reproducir, publicar, conceder licencias, crear obras derivadas de, transferir o vender ningún Contenido. Usted no puede reutilizar ningún contenido sin obtener primero el consentimiento escrito de Olva Courier S.A.C. A efectos de estos términos de uso y políticas de privacidad, se prohíbe el uso de dicho Contenido en cualquier otro sitio web o entorno informático en red. Usted no podrá eliminar ningún aviso de derecho de autor, marca comercial o cualquier otro aviso de propiedad del Contenido que se encuentre en el Sitio. Todos los contenidos, marcas, logos, dibujos, documentación, programas informáticos o cualquier otro elemento susceptible de protección por la legislación de propiedad intelectual o industrial, que sean accesibles en el portal corresponden exclusivamente a Olva Courier S.A.C. y quedan expresamente reservados todos los derechos sobre los mismos. Queda expresamente prohibida la creación de enlaces hipertextos (links) a cualquier elemento integrante del sitio web sin la autorización de Olva Courier S.A.C., siempre que no sean a un sitio web. En cualquier caso, el portal se reserva todos los derechos sobre los contenidos información datos y servicios que ostente sobre los mismos. El sitio web no concede ninguna licencia o autorización de uso al usuario sobre sus contenidos, datos o servicios, distinta de la que expresamente se detalla en estos Términos de uso y políticas de privacidad.</p>        \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Restricciones del servicio</b></center></h4>   \n"
                + "                            \n"
                + "                            <p align=\"justify\">   \n"
                + "                            Envíos restringidos para todo destino\n"
                + "                                </p><ul style=\"text-align: justify;\">\n"
                + "                                    <li>\n"
                + "                                    No se admiten joyas, armas de fuego, artículos de cómputo, vales de consumo activos y seres vivos.</li>\n"
                + "                                    <li>\n"
                + "                                    No se permite pistolas de salva o juguetes que simulen ser armas.</li>\n"
                + "                                    <li>\n"
                + "                                    Los siguientes productos no se aceptarán para transporte vía aérea por ningún motivo: materiales ni objetos explosivos, gases inflamables, tóxicos no tóxicos, sustancias corrosivas, etc. Productos considerados mercancías peligrosas. <a href=\"https://www.olvacourier.com/productos-considerados-mercancia-peligrosa/\">(Ver más)</a>\n"
                + "                                    </li> \n"
                + "                                    <li>\n"
                + "                                    No se permite el envío de productos perecibles.</li> \n"
                + "                                    <li>\n"
                + "                                    Los traslados de los productos son en condiciones y temperaturas\n"
                + "                                    normales.</li> \n"
                + "                                    <li>\n"
                + "                                    Envíos con plazos de vencimiento: este tipo de envíos deberán ser recepcionados por OLVA COURIER con al menos 48 horas laborales de anticipación (no se consideran sábados, domingos y feriados).</li>  \n"
                + "                                    <li>\n"
                + "                                    No se admiten sobres o paquetes con documentos o bien de valor, como: títulos, valores, cheques, pagarés, joyas, cristales artefactos, entre otros. El servicio cubre de Lima a Lima y Lima a Provincias.</li> \n"
                + "                                </ul>\n"
                + "                            <p></p>\n"
                + "                            <br>\n"
                + "\n"
                + "                            <h4><center><b>Políticas de entrega y recojo</b></center></h4>   \n"
                + "                            \n"
                + "                            <p align=\"justify\">   \n"
                + "                                <b>1. Plazos de Entrega: </b>\n"
                + "                                El tiempo de entrega promedio en Lima METROPOLITANA es de 24 horas, a nivel nacional, para capital de departamento es de 24 – 48 horas y para ciudades en tránsito el tiempo de entrega depende de la distancia del destino en <b>condiciones regulares*.  podrán ingresar al siguiente link para conocer los nuevos tiempos de entrega: <a href=\"https://www.olvacourier.com/noticias/tiempos-de-entrega/45\">https://www.olvacourier.com/noticias/tiempos-de-entrega/45</a></b>\n"
                + "                            </p><br>\n"
                + "                            <p align=\"justify\" style=\"font-size: 9px;\">   \n"
                + "                                <i><b>* Condiciones no regulares </b>\n"
                + "                                son cancelaciones de vuelo, mal tiempo, tomas de carretera, fenómenos naturales, factores externos, socio ecológico, caso fortuito o fuerza mayor, etc. En caso las condiciones irregulares continúen, se informará a los clientes mediante nuestros diferentes canales de atención.</i>\n"
                + "                            </p><br>\n"
                + "                            <p align=\"justify\">\n"
                + "                                <b>2. Horarios de Entrega: </b>\n"
                + "                                Los Horarios de entrega son los siguientes:<br>\n"
                + "                                lunes a viernes: 8 AM – 5 PM<br>\n"
                + "                                Sábados: 8:00 AM – 12:00 PM<br>\n"
                + "                                Sujeto a cambios por días feriados o no laborables, los mismos que\n"
                + "                                serán comunicados en nuestros distintos canales de atención.</p><br>\n"
                + "                            <p align=\"justify\">\n"
                + "                                La entrega de sus envíos se realizará en la puerta principal de su\n"
                + "                                domicilio, edificio o empresa.</p>\n"
                + "                                <br><br>\n"
                + "                            <p align=\"justify\">   \n"
                + "                                <b>3. Cobertura de la Entrega: </b>\n"
                + "                                El envío de sobres y paquetes es a nivel local y nacional, válido para entregas a domicilio, oficina o tienda de Olva.\n"
                + "                                <b>Podrán ingresar al siguiente link para conocer la cobertura de entrega: \n"
                + "                                <a href=\"https://www.olvacourier.com/noticias/tiempos-de-entrega/45\">https://www.olvacourier.com/noticias/tiempos-de-entrega/45</a></b>\n"
                + "                            </p><br>\n"
                + "                            <p align=\"justify\">   \n"
                + "                                <b>4. Medios de Entrega: </b>\n"
                + "                                La entrega de los sobres y paquetes serán a través de nuestras movilidades, motorizados y caminantes que cuentan con las medidas de prevención sanitarias para el cuidado de nuestros clientes en la entrega de domicilios, oficinas y en nuestras tiendas. Nuestros operadores de reparto seguirán el siguiente proceso de entrega:</p><ul style=\"text-align: justify;\">\n"
                + "                                    <li>a.  El operador se apersonará al predio de la dirección consignada, llamará al cliente (puerta, timbre y/o celular) considerando un tiempo máximo para realizar la entrega de 5 minutos luego lograr contacto con el consignado y un tiempo máximo de 10 minutos para realizar el recojo luego del lograr el contacto con el consignado.</li>\n"
                + "                                    <li>b.  El operador solicitará los datos del receptor (nombre y apellido, DNI, cargo o vínculo) y procederá a registrar estos datos en el sticker, tracking y/o orden de servicio (la firma del receptor es opcional).</li>\n"
                + "                                    <li>c.  El operador dejará y/o recogerá el envío en un punto al alcance del receptor (en la puerta del consignado de ser una persona natural y en el caso de una empresa depositará en el lugar que hayan habilitado para ello según protocolo de la empresa).</li>\n"
                + "                                    <li>d.  En el proceso de entrega el operador tomará 02 fotos con el equipo Smartphone a través del aplicativo (app).</li>\n"
                + "                                </ul>\n"
                + "                            <p></p><br>\n"
                + "                            <p align=\"justify\">\n"
                + "                                <b>5. Confirmación de entrega; </b>\n"
                + "                                El usuario puede ingresar a <a href=\"https://www.olvacourier.com\">www.olvacourier.com</a>, así como también usar el aplicativo móvil de Olva\n"
                + "                                Courier para realizar el seguimiento de su envío con el número de tracking\n"
                + "                                (antes remito) y confirmar la entrega de su envío. Asimismo, las\n"
                + "                                conformidades (fotos) solo se apreciarán al ingresar a la zona de clientes.\n"
                + "                            </p><br>\n"
                + "                            <p align=\"justify\">\n"
                + "                                <b>6. Costos de entrega: </b>\n"
                + "                                Para conocer el costo de tu envío, ingresa a nuestra calculadora y cotiza tu envío <a href=\"https://www.olvacourier.com/calculadora-de-envios/\">https://www.olvacourier.com/calculadora-de-envios/</a>\n"
                + "                            </p>\n"
                + "                            \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Devoluciones de envíos</b></center></h4>       \n"
                + "                            <p align=\"justify\">\n"
                + "                            El envío de sobres y paquetes a nivel local y nacional tendrá solo 2 intentos de entrega. Después del segundo intento será devuelto a origen. Todo envío devuelto a origen tiene un plazo de 30 días hasta ser retornados a almacén, de acuerdo a Resolución Ministerial N° 572 – 2008 MTC/03, caso contrario se inicia el proceso de destrucción.</p>\n"
                + "            \n"
                + "                            <p align=\"justify\">\n"
                + "                            Los procesos de devolución de tiendas deben ser coordinadas con nuestra área de Contact Center, toda vez que los envíos no se devuelven directamente a la tienda de origen.</p>\n"
                + "                            \n"
                + "                            <p align=\"justify\">\n"
                + "                            Si Operaciones no recibe la coordinación indicada arriba dentro de los 30 días, se inicia el proceso de destrucción.</p>\n"
                + "                            <br>\n"
                + "                            <h4><center><b>Embalaje de envíos</b></center></h4>      \n"
                + "                            <p align=\"justify\">\n"
                + "                            El embalaje de los envíos es totalmente responsabilidad del cliente, Olva Courier no se hará responsable por el daño del producto en caso que no se haya utilizado los materiales de embalaje adecuados. Olva Courier puede negarse a aceptar el paquete si este no cuenta con los lineamientos establecidos. Por ejemplo, envío embalado con cajas no compactas, cajas sobrecargadas, cajas de cartulina, bolsas recicladas, bolsas negras y papel corrugado no será despachado por no tener los materiales de embalaje adecuados. El peso máximo para un documento es de 500. Gramos. El peso máximo para una caja/paquete es de 25 kilos, si el envió excedió el peso deberá ser enviado por separado. El tamaño mínimo de caja para enviar es de <b>Largo</b> 14cm x <b>Ancho</b> 10cm \n"
                + "                            x <b>Alto</b> 10cm. Se aplica peso volumen en caso los paquetes tengan mayor tamaño que \n"
                + "                            peso. *El sobre o paquete que tenga exceso adicional a 300 gramos será redondeado \n"
                + "                            a 1 kilo. Ejemplo: si pesa 1.300 kg será = 2.00 kg\n"
                + "                            <br>\n"
                + "                            </p><h4><center><b>Envíos regulares declarados</b></center></h4>            \n"
                + "\n"
                + "                            <p align=\"justify\">   \n"
                + "                            Si el valor del producto a enviar es menor a S/. 100.00 soles deberá ser declarado en nuestros distintos canales de atención (plataforma y tiendas físicas), sin cargos adicionales por seguro.</p>\n"
                + "                        \n"
                + "                            <br>\n"
                + "\n"
                + "                            <h4><center><b>Envíos Valorados</b></center></h4>                      \n"
                + "\n"
                + "                            <p align=\"justify\">\n"
                + "                            Si el valor del producto a enviar se encuentra entre S/ 101.00 y S/ 500.00 el cliente deberá declararlo y pagar un seguro obligatorio del 0.6% del valor del producto, para envíos de productos con un valor entre S/ 501.00 a S/ 3,000.00 deberá pagar un seguro obligatorio del 0.6% y acompañado del formato de declaración jurada física o virtual. Si el valor del producto a enviar se encuentra entre  S/ 3,001.00 hasta S/ 10,000.00, deberá pagar un seguro del 2% del valor del producto, acompañado del formato de declaración jurada física o virtual. El cobro del porcentaje por seguro se aplicará como cargo adicional al servicio con una tarifa especial de envíos valorados.</p>\n"
                + "\n"
                + "                            <br>\n"
                + "                            <h4><center><b>Indemnizaciones</b></center></h4>                      \n"
                + "\n"
                + "                            <p align=\"justify\">\n"
                + "                            Para sobres o paquetes menores de S/100, se indemnizará según la resolución de la incidencia y se aplicará una de las siguientes opciones: </p>\n"
                + "                            <ul style=\"text-align: justify;\">\n"
                + "                                    <li>1.  Envíos de cortesías equivalentes al valor del flete pagado.</li>\n"
                + "                                    <li>2.  Emisión de nota de crédito, o</li>\n"
                + "                                    <li>3.  Devolución del flete pagado.</li>\n"
                + "                                </ul>\n"
                + "                                Para paquetes declarados, y con pago de seguro, se indemnizará según la resolución \n"
                + "                                de la incidencia y se aplicará una de las siguientes opciones:\n"
                + "\n"
                + "                            <ul style=\"text-align: justify;\">\n"
                + "                                <li>1.  Envíos de cortesías equivalentes al valor del flete pagado, o</li>\n"
                + "                                <li>2.  Emisión de nota de crédito, o</li>\n"
                + "                                <li>3.  Devolución del flete pagado, o</li>\n"
                + "                                <li>4.  80% del valor declarado sin Igv + flete.</li>\n"
                + "                            </ul>\n"
                + "                            * El cliente deberá enviar el comprobante (boleta o factura) como sustento, si no envía \n"
                + "                            el sustento entonces se realiza solo la devolución del flete. \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Recepción de reclamos</b></center></h4>            \n"
                + "\n"
                + "                            <p align=\"justify\">   \n"
                + "                            Olva Courier pone a disposición sus diferentes canales para la recepción de\n"
                + "                            reclamos o incidencias generadas con servicio brindado. A continuación, se\n"
                + "                            enumeran los canales:\n"
                + "                            </p><ul style=\"text-align: justify;\">\n"
                + "                                    <li>Ingresando a <a href=\"https://www.olvacourier.com/libro-reclamaciones/\">https://www.olvacourier.com/libro-reclamaciones/</a>.</li>\n"
                + "                                    <li>Comunicándose a nuestra central telefónica 01 714-0909.</li>\n"
                + "                                    <li>Escribiéndonos a nuestra red social Facebook </li>\n"
                + "                                    \n"
                + "                            </ul>\n"
                + "                            Los reclamos e incidencias se atenderán en un plazo máximo de 24 horas.\n"
                + "                            <p></p>\n"
                + "                        \n"
                + "                            <br>\n"
                + "                            <h4><center><b>Devoluciones de dinero</b></center></h4>                      \n"
                + "\n"
                + "                            <p align=\"justify\">\n"
                + "                            Para las devoluciones de dinero por pagos hechos en la Zona Clientes, se podrán canjear por una Nota de Crédito en cualquiera de las tiendas de Olva Courier para pagos iguales o mayores. La entrega de la nota crédito se hará mediante un correo electrónico a nombre del Titular del pago entregado en un plazo de 4 días hábiles, plazo que se contará a partir del día hábil siguiente de recibida la solicitud del usuario. Se debe señalar que la nota de crédito solo es válida durante el mismo año de emisión y solo puede hacerse efectiva en la ciudad donde se emitió.</p>\n"
                + "                            \n"
                + "                            <p align=\"justify\">\n"
                + "                            En caso el cliente no desee la Nota de Crédito deberá indicarlo al personal de tienda, para que se realice el proceso de devolución de dinero.</p>\n"
                + "                            <br>\n"
                + "                            <h4><center><b>Condiciones de los pagos online</b></center></h4>                      \n"
                + "\n"
                + "                            <p align=\"justify\">\n"
                + "                            <b>Solicitud de pago de diferencia</b> <br>\n"
                + "                            Cuando el importe pagado por el usuario es menor al costo del envío realizado, se notificará vía correo electrónico al usuario para que pueda regularizar su envío mediante depósitos a las cuentas de Olva Courier S.A.C.\n"
                + "</p>\n"
                + "                            <p align=\"justify\">\n"
                + "                            Si el cliente decide retirar el envío, debe acercarse al almacén principal de Olva Courier en el mismo día o dentro de las 48 horas presentando su DNI y mostrando al personal de la tienda el correo de la notificación recibida.\n"
                + "</p>\n"
                + "                            <br>\n"
                + "\n"
                + "                            <p align=\"justify\">\n"
                + "                            <b>Envíos mal embalados</b> <br>\n"
                + "                            Si el usuario no utiliza los materiales de embalaje adecuados sus envíos no podrán ser trabajados. Por ejemplo, envío embalado con cajas no compactas, cajas unidas con strech film transparente (deben tener film negro), cajas sobrecargadas, cajas de cartulina, bolsas recicladas, bolsas negras y papel corrugado no será despachado por no tener los materiales de embalaje adecuados. Se notificará mediante un correo al usuario para informar que su envío será retenido. El usuario deberá acercarse a la tienda correspondiente para que pueda corregir el embalaje dentro de las 24 horas. Si el cliente no se acerca transcurridas las 48 horas se procede a devolver el envío, en caso el cliente se desista del envío ya sea por no querer pagar la diferencia o porque el envío estuvo mal embalado, se procederá con la devolución de dinero, pero dicha devolución se realizará por el mismo medio en que el cliente pagó por el servicio, siendo que dicho proceso demora de 25 a 30 días según la entidad financiera contratada por el cliente.</p>\n"
                + "                            <p align=\"justify\">\n"
                + "                            <b>Finalización de uso</b> <br>\n"
                + "                            Olva Courier S.A.C. puede terminar, cambiar, suspender o descontinuar cualquier aspecto del sitio web Zona Clientes. De servicios del mismo en cualquier momento. Olva Courier S.A.C. puede restringir, suspender o terminar el acceso al sitio web Zona Clientes y/o a sus servicios si ante cualquier indicio o sospecha que el Usuario está en incumplimiento los presentes Términos de uso y políticas de privacidad, de la ley aplicable, o por cualquier otra razón, sin necesidad de notificación o responsabilidad. Olva Courier S.A.C. mantiene una política que estipula la terminación, en circunstancias apropiadas, de los privilegios de uso del sitio para usuarios que son violadores repetitivos de los derechos de propiedad intelectual.</p>\n"
                + "                            <p align=\"justify\">\n"
                + "                            <b>Acceso y aceptación del cliente</b> <br>\n"
                + "                            Estos Términos de uso y políticas de privacidad regulan el acceso y utilización por parte del Cliente de los servicios y facilidades que ofrece Olva Courier. La condición de “Cliente” implica la aceptación sin reservas de todas las disposiciones incluidas en los presentes Términos de uso y políticas de privacidad. Si el cliente no desea sujetarse a lo dispuesto en los presentes, no deberá marcar el apartado “He leído y acepto los Términos de uso y políticas de privacidad”, y abandonará nuestra plataforma virtual, sólo así no habrá vinculación entre ambas partes. El cliente acepta ser responsable por el contenido transportado, respondiendo en materia civil, penal y/o administrativamente ante cualquier infracción de la ley vigente, excluyendo de toda responsabilidad a Olva Courier, sus empleados y/o sus representantes, siendo el cliente el único responsable ante cualquier eventualidad ya sea directa o indirectamente por el uso o uso inapropiado de nuestro servicio, asumiendo entera responsabilidad por los actos que este lleve a cabo. El uso de Zona Clientes y su contenido es bajo su propio riesgo, en ningún caso Olva Courier S.A.C. será responsable ante usted, ante cualquier persona o entidad que usted represente, de ningún daño directo, indirecto, resultante, fortuito o de otro tipo, con cualquier fundamento legal, por errores en Zona Clientes y su contenido, su uso, o la incapacidad de usar el sitio incluyendo, pero sin limitarse a daños por pérdida de utilidades, negocios, datos, o daño de cualquier sistema de cómputo, aunque usted haya notificado a Olva Courier S.A.C. de la posibilidad de tales daños.</p><br></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        labTexto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        butAceptar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 4341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 590, 510));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        butAceptar.setBackground(new java.awt.Color(255, 255, 255));
        butAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butAceptar.setForeground(new java.awt.Color(255, 255, 255));
        butAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butAceptar.setText("Aceptar");
        butAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butAceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 190, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Términos y Condiciones");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 310, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAceptarMouseClicked
        int valor = jScrollPane1.getVerticalScrollBar().getValue();
        if (valor >= 90) {
            aceptTerminos = true;
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Debe leer los téeminos y condiciones");
        }

    }//GEN-LAST:event_butAceptarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(diaTerminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diaTerminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diaTerminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diaTerminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                diaTerminos dialog = new diaTerminos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labTexto;
    // End of variables declaration//GEN-END:variables
}
