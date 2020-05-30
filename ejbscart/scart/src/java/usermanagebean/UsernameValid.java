/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagebean;

import ejb.userbeanLocal;
import entity.UserTable;
import java.util.Collection;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;



/**
 *
 * @author shailesh
 */
@FacesValidator("usernamevalid")
public class UsernameValid implements Validator {
@EJB(mappedName = "scart/userbean")
userbeanLocal ubl;
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
      if (value==null) {
            FacesMessage message = new FacesMessage("The username cannot be empty");
            message.setSeverity(FacesMessage.SEVERITY_FATAL);
            throw new ValidatorException(message);
        }
          Collection<UserTable> ucols=ubl.showUserDetails((String)value);
          for(UserTable u:ucols)
          {
          if(u.getUsername()!=null)
                  {
                   FacesMessage message = new FacesMessage("Username already exist");
            throw new ValidatorException(message);
                  }
          }
          
//        if (ubl.showUserDetails((String)value)==null) {
//           
//       }
   }
    
}
