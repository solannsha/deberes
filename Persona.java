/***********************************************************************
 * Module:  Persona.java
 * Author:  iaman
 * Purpose: Defines the Class Persona
 ***********************************************************************/

import java.util.*;

/** @pdOid 1bb80602-84d4-4c06-a1ce-60b5f0938eaa */
public class Persona {
   /** @pdOid 2819effc-e1d8-4a83-aa5e-3655678f8453 */
   private String nombre;
   /** @pdOid 2bfd05a0-e6ef-4451-a089-368e31582197 */
   private String apellido;
   /** @pdOid 3781fd52-6c15-4afd-8904-6cd222c9a4c7 */
   private String idpersona;
   
   /** @pdRoleInfo migr=no name=Usuario assc=asociacion coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Usuario> usuario;
   
   /** @pdOid 6b8a3321-bd72-436b-afcf-9433153cca34 */
   public Persona() {
      // TODO: implement
   }
   
   /** @pdOid 64aaf585-abac-4051-a201-ea5585117316 */
   public String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 40ba2f43-9aa7-407c-9fa3-c51d768a87eb */
   public void setNombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid ae32a371-c5a5-4852-85f1-e82c8a30a6ee */
   public String getApellido() {
      return apellido;
   }
   
   /** @param newApellido
    * @pdOid c8117ed7-d6c9-42f5-8025-f8309ef6af57 */
   public void setApellido(String newApellido) {
      apellido = newApellido;
   }
   
   /** @pdOid aaf409d5-39e4-4e3c-8c4a-95e5327f1ff5 */
   public String getIdpersona() {
      return idpersona;
   }
   
   /** @param newIdpersona
    * @pdOid 3affe224-2184-4935-b83e-0048f5dd0723 */
   public void setIdpersona(String newIdpersona) {
      idpersona = newIdpersona;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Usuario> getUsuario() {
      if (usuario == null)
         usuario = new java.util.HashSet<Usuario>();
      return usuario;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUsuario() {
      if (usuario == null)
         usuario = new java.util.HashSet<Usuario>();
      return usuario.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUsuario */
   public void setUsuario(java.util.Collection<Usuario> newUsuario) {
      removeAllUsuario();
      for (java.util.Iterator iter = newUsuario.iterator(); iter.hasNext();)
         addUsuario((Usuario)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUsuario */
   public void addUsuario(Usuario newUsuario) {
      if (newUsuario == null)
         return;
      if (this.usuario == null)
         this.usuario = new java.util.HashSet<Usuario>();
      if (!this.usuario.contains(newUsuario))
         this.usuario.add(newUsuario);
   }
   
   /** @pdGenerated default remove
     * @param oldUsuario */
   public void removeUsuario(Usuario oldUsuario) {
      if (oldUsuario == null)
         return;
      if (this.usuario != null)
         if (this.usuario.contains(oldUsuario))
            this.usuario.remove(oldUsuario);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUsuario() {
      if (usuario != null)
         usuario.clear();
   }

}