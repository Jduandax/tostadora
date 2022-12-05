/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import entity.Users;
import facade.UsersFacadeLocal;
import org.primefaces.PF;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Aprendiz
 */
@Named(value = "emailMasive")
@ViewScoped
public class EmailMasive implements Serializable {

    @EJB
    UsersFacadeLocal user;


    private String correo;

    public EmailMasive() {
    }

    public void inicio() {
        try {
            FacesContext fx = FacesContext.getCurrentInstance();
            fx.getExternalContext().redirect("catalogo/index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(EmailMasive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para enviar correo a todos los usuarios de la base de datos
    public void enviarCorreo() {
        try {
            List<Users> lista = user.leerTodos();
            for (Users lista1 : lista) {
                correo = lista1.getEmail();
                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.port", 587);
                props.put("mail.smtp.auth", "true");
                Session session = Session.getDefaultInstance(props);
                String correoRemitente = "tostadorasanjorgegaes3@gmail.com";
                String passwordRemitente = "wyatxzyimfxojsbv";
                String correoReceptor = correo;
                String asunto = "GRANDES DESCUENTOS";
                String mensaje = "<!DOCTYPE html>"
                        + "<html lang='en'>"
                        + "<head>"
                        + "<meta charset='UTF-8'>"
                        + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                        + "<title>recovery</title>"
                        + "<style>"

                        + ".cuerpo{"
                        + "background-color: #f2f2f2;"
                        + "text-align: center;"
                        + "}"

                        + ".titulo{"
                        + "color: #000;"
                        + "text-align: center;"
                        + "}"

                        + "p{"
                        + "color: #000;"
                        + "text-align: center;"
                        + "}"

                        + "a{"
                        + "color: #bf9000;"
                        + "text-align: center;"
                        + "font-weight: bold;"
                        + "}"

                        + ".imge{"
                        + "width: 150px;"
                        + "height: 100px;"
                        + "alt style: display;"
                        + "block;"
                        + "font-size: 0px;"
                        + "}"

                        + "h5{"
                        + "color: #bf9000;"
                        + "text-align: center;"
                        + "}"

                        + "h2{"
                        + "color: #bf9000;"
                        + "text-align: center;"
                        + "}"

                        + "button{"
                        + "width: 90px;"
                        + "height: 50px;"
                        + "border-radius: 10px;"
                        + "background-color: #E6EBEF;"
                        + "color: #FFFFFF;"
                        + "}"

                        + "td{"
                        + "text-align: center;"
                        + "width: 100%;"
                        + "height: 100%;"
                        + "alt style: display;"
                        + "block;"
                        + "font-size: 0px;"
                        + "}"

                        + "</style>"
                        + "</head>"
                        + "<body>"
                        + "<div class='es-wrapper-color'>"
                        + "<table class='es-wrapper' width='100%' cellspacing='0' cellpadding='0'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class='esd-email-paddings' valign='top'>"
                        + "<table class='es-content esd-header-popover' cellspacing='0' cellpadding='0' align='center'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class='esd-stripe' align='center'>"
                        + "<table class='es-header-body' width='600' cellspacing='0' cellpadding='0' bgcolor='#ffffff' align='center'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class='esd-structure es-p20t es-p20r es-p20l' align='left'>"
                        + "<table width='100%' cellspacing='0' cellpadding='0'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class='esd-container-frame'  valign='top' align='center'>"
                        + "<table width='100%' cellspacing='0' cellpadding='0'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td  align='center' class='esd-block-text' bgcolor='##2936bb'>"
                        + "<p style='color: #ffffff; font-size: 20px;'><strong>¡GRANDES DESCUENTOS!</strong></p>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<td class='esd-structure es-p20t es-p20r es-p20l' align='left'>"
                        + "<table width='100%' cellspacing='0' cellpadding='0'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td width = '560' class='esd-container-frame'  valign='top' align='center'>"
                        + "<table width='100%' cellspacing='0' cellpadding='0'>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td align='left' class='esd-block-text'>"
                        + "<center><p style='color: #000000; font-size: 130px;'><strong>¡30 %!</strong></p></center>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<td class='esd - structure es - p20t es - p20r es - p20l  align= 'left'>"
                        + "<table cellpadding='0 ' cellspacing= '0' width=' 100 % '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td width='560 ' class=' esd - container - frame ' align=' center ' valign=' top '>"
                        + "<table cellpadding=' 0 ' cellspacing=' 0 ' width=' 100 % '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td align=' center '' class='' esd - block - text '>"
                        + "<p style=' font - size:16 px; color: #2936 bb;'><strong>a partir de hoy hasta el viernes, cualquier producto que escoja</strong></p>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "<table class=' es - content '' cellspacing='' 0 '' cellpadding='' 0 '' align='' center '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class=' esd - stripe '' align='' center '>"
                        + "<table class=' es - content - body '' width='' 600 '' cellspacing='' 0 '' cellpadding='' 0 '' bgcolor='#ffffff ' align='' center '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class=' es - p20t es - p20r es - p20l esd - structure '' align='' left '>"
                        + "<table width=' 100 % '' cellspacing='' 0 '' cellpadding='' 0 '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class=' esd - container - frame '' width='' 560 '' valign='' top '' align='' center '>"
                        + "<table width=' 100 % '' cellspacing='' 0 '' cellpadding='' 0 '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td align=' center '' class='' esd - block - image '' style='' font - size:0 px;'><a target=' _blank '' href='https://www.google.com/url?sa=i&url=https%3A%2F%2Fsp.depositphotos.com%2Fstock-photos%2Fbulto-de-cafe.html&psig=AOvVaw2e_yEMFb0Q7wZWpZr04azR&ust=1664084819254000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCOibw5ndrPoCFQAAAAAdAAAAABAD'><img class='adapt-img' src='https://st.depositphotos.com/3582809/5114/i/600/depositphotos_51145579-stock-photo-coffee.jpg' alt width='100%' style='display: block;'></a></td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "<table class=' esd - footer - popover es - footer '' cellspacing='' 0 '' cellpadding='' 0 '' align='' center '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class=' esd - stripe '' align='' center '>"
                        + "<table class=' es - footer - body '' width='' 600 '' cellspacing='' 0 '' cellpadding='' 0 '' bgcolor='#ffffff ' align='' center '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td class=' esd - structure es - p20t es - p20r es - p20l '' align='' left '>"
                        + "<table cellpadding=' 0 '' cellspacing='' 0 '' width='' 100 % '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td width=' 560 '' class='' esd - container - frame '' align='' center '' valign='' top '>"
                        + "<table cellpadding=' 0 '' cellspacing='' 0 '' width='' 100 % '>"
                        + "<tbody>"
                        + "<tr>"
                        + "<td align=' left '' class='' esd - block - text '' bgcolor='#2936 bb '>'"
                        + "<p style=' color: #ffffff; font - size:72 px; text - align:center; '><strong>LIQUIDACION</strong></p>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</td>"
                        + "</tr>"
                        + "</tbody>"
                        + "</table>"
                        + "</div>"
                        + "</body>"
                        + "</html>";
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(correoRemitente));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                message.setSubject(asunto);
                message.setContent(mensaje, "text/html");
                Transport transport = session.getTransport("smtp");
                transport.connect(correoRemitente, passwordRemitente);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
            }
            PF.current().executeScript("alert('Correo enviado')");
        } catch (MessagingException ex) {
            Logger.getLogger(EmailMasive.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}





