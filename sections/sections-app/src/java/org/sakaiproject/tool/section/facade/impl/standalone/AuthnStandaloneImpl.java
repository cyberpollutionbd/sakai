/**********************************************************************************
*
* $Id: AuthnStandaloneImpl.java 637 2005-07-15 16:35:46Z jholtzman@berkeley.edu $
*
***********************************************************************************
*
* Copyright (c) 2003, 2004, 2005 The Regents of the University of Michigan, Trustees of Indiana University,
*                  Board of Trustees of the Leland Stanford, Jr., University, and The MIT Corporation
*
* Licensed under the Educational Community License Version 1.0 (the "License");
* By obtaining, using and/or copying this Original Work, you agree that you have read,
* understand, and will comply with the terms and conditions of the Educational Community License.
* You may obtain a copy of the License at:
*
*      http://cvs.sakaiproject.org/licenses/license_1_0.html
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
* INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
* AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
* DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*
**********************************************************************************/

package org.sakaiproject.tool.section.facade.impl.standalone;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.sakaiproject.api.section.facade.manager.Authn;

/**
 * @author <a href="jholtzman@berkeley.edu">Josh Holtzman</a>
 */
public class AuthnStandaloneImpl implements Authn {
    public static final String USER_NAME = "username";

    /**
     * @see org.sakaiproject.api.section.facade.managers.Authn#getUserUid()
     */
    public String getUserUuid() {
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        return (String)session.getAttribute(USER_NAME);
    }

}


/**************************************************************************************************************************************************************************************************************************************************************
 * $Id: AuthnStandaloneImpl.java 637 2005-07-15 16:35:46Z jholtzman@berkeley.edu $
 *************************************************************************************************************************************************************************************************************************************************************/
