package pl.waw.mizinski.mbi.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.jcontainer.dna.Configuration;
import org.jcontainer.dna.Logger;
import org.objectledge.authentication.LoginVerifier;
import org.objectledge.authentication.PasswordDigester;
import org.objectledge.authentication.PasswordGenerator;
import org.objectledge.security.AclInterceptor;
import org.objectledge.security.DataBackend;
import org.objectledge.security.GroupNamingPolicy;
import org.objectledge.security.PasswordVerifier;
import org.objectledge.security.SecurityContext;
import org.objectledge.security.SecurityManager;
import org.objectledge.security.SecurityManagerImpl;
import org.objectledge.security.exception.DataBackendException;
import org.objectledge.security.exception.DuplicateRecognizerConfigurationException;
import org.objectledge.security.exception.EntityExistsException;
import org.objectledge.security.exception.InvalidLoginName;
import org.objectledge.security.exception.InvalidPassword;
import org.objectledge.security.exception.OperationNotSupportedException;
import org.objectledge.security.exception.UnknownEntityException;
import org.objectledge.security.object.Group;
import org.objectledge.security.object.Permission;
import org.objectledge.security.object.Role;
import org.objectledge.security.object.SecurityEntity;
import org.objectledge.security.object.SecurityUser;
import org.objectledge.security.util.AccessControlList;
import org.objectledge.security.util.GroupSet;
import org.objectledge.security.util.PermissionSet;
import org.objectledge.security.util.RoleSet;
import org.objectledge.security.util.UserSet;
import org.picocontainer.MutablePicoContainer;

public class MockSecurityManager extends SecurityManagerImpl {

	public MockSecurityManager(MutablePicoContainer container,
			Configuration config, GroupNamingPolicy groupNamingPolicy,
			DataBackend dataBackend, LoginVerifier loginVerifier,
			PasswordVerifier passwordVerifier,
			PasswordGenerator passwordGenerator,
			PasswordDigester passwordDigester, Logger logger,
			AclInterceptor[] aclInterceptors)
			throws DuplicateRecognizerConfigurationException {
		super(container, config, groupNamingPolicy, dataBackend, loginVerifier,
				passwordVerifier, passwordGenerator, passwordDigester, logger,
				aclInterceptors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SecurityUser getAnonymousAccount() throws UnknownEntityException,
			DataBackendException {
		return new SecurityUser() {

			private static final long serialVersionUID = 1L;

			public int compareTo(SecurityEntity arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			public void setDescription(String arg0) {
				// TODO Auto-generated method stub

			}

			public boolean isDefined() {
				// TODO Auto-generated method stub
				return false;
			}

			public Integer getId() {
				// TODO Auto-generated method stub
				return 0;
			}

			public String getDescription() {
				// TODO Auto-generated method stub
				return "Anonymous";
			}

			public void updateLastLogin() {
				// TODO Auto-generated method stub

			}

			public void updateLastAccessDate() {
				// TODO Auto-generated method stub

			}

			public void setUserGroup(Group arg0) {
				// TODO Auto-generated method stub

			}

			public void setTemp(String arg0, Object arg1) {
				// TODO Auto-generated method stub

			}

			public void setPerm(String arg0, Serializable arg1) {
				// TODO Auto-generated method stub

			}

			public void setName(String arg0) {
				// TODO Auto-generated method stub

			}

			public void setMaxInactiveInterval(int arg0) {
				// TODO Auto-generated method stub

			}

			public void setLocked(boolean arg0) {
				// TODO Auto-generated method stub

			}

			public void setLastName(String arg0) {
				// TODO Auto-generated method stub

			}

			public void setFirstName(String arg0) {
				// TODO Auto-generated method stub

			}

			public void setEmail(String arg0) {
				// TODO Auto-generated method stub

			}

			public void setConfirmed(boolean arg0) {
				// TODO Auto-generated method stub

			}

			public void setConfirmValue(String arg0) {
				// TODO Auto-generated method stub

			}

			public void setAccessCounterForSession(int arg0) {
				// TODO Auto-generated method stub

			}

			public void setAccessCounter(long arg0) {
				// TODO Auto-generated method stub

			}

			public Object removeTemp(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean isLocked() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isConfirmed() {
				// TODO Auto-generated method stub
				return false;
			}

			public void incrementAccessCounterForSession() {
				// TODO Auto-generated method stub

			}

			public void incrementAccessCounter() {
				// TODO Auto-generated method stub

			}

			public Group getUserGroup() {
				// TODO Auto-generated method stub
				return null;
			}

			public Collection<String> getTempKeys() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object getTemp(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			public Object getTemp(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public Collection<String> getPermKeys() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object getPerm(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			public Object getPerm(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public String getPassword() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}

			public Date getModified() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getMaxInactiveInterval() {
				// TODO Auto-generated method stub
				return 0;
			}

			public String getLastName() {
				// TODO Auto-generated method stub
				return null;
			}

			public Date getLastLogin() {
				// TODO Auto-generated method stub
				return null;
			}

			public Date getLastAccessDate() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getFirstName() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getEmail() {
				// TODO Auto-generated method stub
				return null;
			}

			public Date getCreated() {
				// TODO Auto-generated method stub
				return null;
			}

			public Date getCreateDate() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getConfirmValue() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getAccessCounterForSession() {
				// TODO Auto-generated method stub
				return 0;
			}

			public long getAccessCounter() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public SecurityUser clone() {

				return this;
			}
		};
	}

	@Override
	public AccessControlList getACL(SecurityUser user)
			throws DataBackendException, UnknownEntityException {
		return new AccessControlList() {

			public boolean isSuperUser() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasRole(String rolename, GroupSet groupset) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasRole(String role, String group) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasRole(Role role, GroupSet groupset) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasRole(Role role, Group group) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasRole(String roleName) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasRole(Role role) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(String permissionName,
					GroupSet groupset) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(String permission, Group group) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(String permission, String group) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(Permission permission,
					GroupSet groupset) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(Permission permission, Group group) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(PermissionSet permissions) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(String permissionName) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean hasPermission(Permission permission) {
				// TODO Auto-generated method stub
				return false;
			}

			public RoleSet getRoles(Group group) {
				return RoleSet.emptySet();
			}

			public RoleSet getRoles() {
				return RoleSet.emptySet();
			}

			public PermissionSet getPermissions(Group group) {
				return PermissionSet.emptySet();
			}

			public PermissionSet getPermissions() {
				return PermissionSet.emptySet();
			}

			public GroupSet getGroups(Permission requiredPermission) {
				return GroupSet.emptySet();
			}

			public GroupSet getGroups(PermissionSet requiredPermissions) {
				return GroupSet.emptySet();
			}

			public Collection<Group> getAllUserGroups() {
				return GroupSet.emptySet().getCollection();
			}

			public GroupSet getAllGroups() {
				return GroupSet.emptySet();
			}
		};
	}

}
