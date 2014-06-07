package pl.waw.mizinski.mbi.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.objectledge.autocache.AutoCache;
import org.objectledge.security.ResourceGroupRecognizer;
import org.objectledge.security.SecurityManager;
import org.objectledge.security.exception.UnrecognizableResourceGroupException;
import org.objectledge.security.util.GroupSet;

/**
 * Resource group recognizer.
 * <p>
 *   This implementation is just for demo purpose and is inefficient.
 *   Production implementation should be based on {@link AutoCache}
 *   group providers, which speed-up resource group recognition.
 * </p>
 * <p>
 *   You should be aware, that recognizer can be called several times during
 *   single user request.
 * </p>
 *
 * <p>Created on 2011-08-10</p>
 * 
 * @author <a href="mailto:mgolebsk@elka.pw.edu.pl">Marcin Golebski</a>
 * @version $Id: PersonGroupRecognizer.java,v 1.1 2011-08-10 14:05:49 mgolebsk Exp $
 */
public class PersonGroupRecognizer implements ResourceGroupRecognizer
{

    
    public PersonGroupRecognizer( final SecurityManager securityManager)
    {
    }
    
    /* (non-Javadoc)
     * @see org.objectledge.security.ResourceGroupRecognizer#registerRecognizedObjects()
     */
    public List<Class<?>> registerRecognizedObjects()
    {
         return new LinkedList<Class<?>>();
    }

    /* (non-Javadoc)
     * @see org.objectledge.security.ResourceGroupRecognizer#resourceGroupByObject(java.lang.Object)
     */
    public GroupSet resourceGroupByObject(final Object object)
    throws UnrecognizableResourceGroupException
    {
       return new GroupSet();
    }

   
}
