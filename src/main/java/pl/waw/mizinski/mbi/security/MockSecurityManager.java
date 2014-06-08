package pl.waw.mizinski.mbi.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import org.jcontainer.dna.Configuration;
import org.jcontainer.dna.Logger;
import org.objectledge.authentication.LoginVerifier;
import org.objectledge.authentication.PasswordDigester;
import org.objectledge.authentication.PasswordGenerator;
import org.objectledge.security.AclInterceptor;
import org.objectledge.security.DataBackend;
import org.objectledge.security.GroupNamingPolicy;
import org.objectledge.security.PasswordVerifier;
import org.objectledge.security.SecurityManagerImpl;
import org.objectledge.security.exception.DuplicateRecognizerConfigurationException;
import org.objectledge.security.object.Group;
import org.objectledge.security.object.Permission;
import org.objectledge.security.object.Role;
import org.objectledge.security.object.SecurityEntity;
import org.objectledge.security.object.SecurityUser;
import org.objectledge.security.util.AccessControlList;
import org.objectledge.security.util.GroupSet;
import org.objectledge.security.util.PermissionSet;
import org.objectledge.security.util.RoleSet;
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
	}

	@Override
	public SecurityUser getAnonymousAccount() {
		return new AnonymousAccount();
	}

	@Override
	public AccessControlList getACL(SecurityUser user) {
		return new ACL();
	}

	private static class AnonymousAccount implements SecurityUser {
		
		private static final long serialVersionUID = 1L;

		public int compareTo(SecurityEntity arg0) {
			return 0;
		}

		public void setDescription(String arg0) {
		}

		public boolean isDefined() {
			return false;
		}

		public Integer getId() {
			return 0;
		}

		public String getDescription() {
			return "Anonymous";
		}

		public void updateLastLogin() {
		}

		public void updateLastAccessDate() {
		}

		public void setUserGroup(Group arg0) {
		}

		public void setTemp(String arg0, Object arg1) {
		}

		public void setPerm(String arg0, Serializable arg1) {
		}

		public void setName(String arg0) {
		}

		public void setMaxInactiveInterval(int arg0) {
		}

		public void setLocked(boolean arg0) {
		}

		public void setLastName(String arg0) {
		}

		public void setFirstName(String arg0) {
		}

		public void setEmail(String arg0) {
		}

		public void setConfirmed(boolean arg0) {
		}

		public void setConfirmValue(String arg0) {
		}

		public void setAccessCounterForSession(int arg0) {
		}

		public void setAccessCounter(long arg0) {
		}

		public Object removeTemp(String arg0) {
			return null;
		}

		public boolean isLocked() {
			return false;
		}

		public boolean isConfirmed() {
			return false;
		}

		public void incrementAccessCounterForSession() {
		}

		public void incrementAccessCounter() {
		}

		public Group getUserGroup() {
			return null;
		}

		public Collection<String> getTempKeys() {
			return null;
		}

		public Object getTemp(String arg0, Object arg1) {
			return null;
		}

		public Object getTemp(String arg0) {
			return null;
		}

		public Collection<String> getPermKeys() {
			return null;
		}

		public Object getPerm(String arg0, Object arg1) {
			return null;
		}

		public Object getPerm(String arg0) {
			return null;
		}

		public String getPassword() {
			return null;
		}

		public String getName() {
			return null;
		}

		public Date getModified() {
			return null;
		}

		public int getMaxInactiveInterval() {
			return 0;
		}

		public String getLastName() {
			return null;
		}

		public Date getLastLogin() {
			return null;
		}

		public Date getLastAccessDate() {
			return null;
		}

		public String getFirstName() {
			return null;
		}

		public String getEmail() {
			return null;
		}

		public Date getCreated() {
			return null;
		}

		public Date getCreateDate() {
			return null;
		}

		public String getConfirmValue() {
			return null;
		}

		public int getAccessCounterForSession() {
			return 0;
		}

		public long getAccessCounter() {
			return 0;
		}

		@Override
		public SecurityUser clone() {

			return this;
		}
	}
	
	private static class ACL implements AccessControlList {
		
		private static final long serialVersionUID = 1L;

		public boolean isSuperUser() {
			return false;
		}

		public boolean hasRole(String rolename, GroupSet groupset) {
			return false;
		}

		public boolean hasRole(String role, String group) {
			return false;
		}

		public boolean hasRole(Role role, GroupSet groupset) {
			return false;
		}

		public boolean hasRole(Role role, Group group) {
			return false;
		}

		public boolean hasRole(String roleName) {
			return false;
		}

		public boolean hasRole(Role role) {
			return false;
		}

		public boolean hasPermission(String permissionName,
				GroupSet groupset) {
			return false;
		}

		public boolean hasPermission(String permission, Group group) {
			return false;
		}

		public boolean hasPermission(String permission, String group) {
			return false;
		}

		public boolean hasPermission(Permission permission,
				GroupSet groupset) {
			return false;
		}

		public boolean hasPermission(Permission permission, Group group) {
			return false;
		}

		public boolean hasPermission(PermissionSet permissions) {
			return false;
		}

		public boolean hasPermission(String permissionName) {
			return false;
		}

		public boolean hasPermission(Permission permission) {
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
	}
}
