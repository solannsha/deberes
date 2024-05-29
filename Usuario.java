/***********************************************************************
 * Module:  Usuario.java
 * Author:  iaman
 * Purpose: Defines the Class Usuario
 ***********************************************************************/

import java.util.*;

/** @pdOid cc6d4c3c-846d-4255-b975-44c9cfdc2761 */
public class Usuario {
   /** @pdOid d126027d-1126-487c-8b84-51d90d4e3105 */
   private String usuario;
   /** @pdOid bd2f6819-19e8-4053-8435-8fcf59eab114 */
   private String clave;
   
   /** @pdOid e125083f-baf5-4ad9-8d92-c5763d786a1c */
   public Usuario() {
      // TODO: implement
   }
   
   /** @pdOid 2f1dfc34-d059-44b1-baee-bdcd3d76dca8 */
   public String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid af25cd84-80dd-4da3-86b7-90cf90664ccf */
   public void setUsuario(String newUsuario) {
      usuario = newUsuario;
   }
   
   /** @pdOid d95db684-c4c0-47d6-aa92-1fdcf44a993a */
   public String getClave() {
      return clave;
   }
   
   /** @param newClave
    * @pdOid 83966092-6a75-4bb4-bb0d-434ced1c2ca2 */
   public void setClave(String newClave) {
      clave = newClave;
   }

}