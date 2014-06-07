package pl.waw.mizinski.mbi.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.objectledge.security.SecurityContext;
import org.objectledge.security.SecurityManager;
import org.objectledge.security.exception.DataBackendException;
import org.objectledge.security.exception.DuplicateRecognizerConfigurationException;
import org.objectledge.security.exception.EntityExistsException;
import org.objectledge.security.exception.InvalidLoginName;
import org.objectledge.security.exception.InvalidPassword;
import org.objectledge.security.exception.OperationNotSupportedException;
import org.objectledge.security.exception.UnknownEntityException;
import org.objectledge.security.menu.SecureMenuSystem;
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

public class DummySecurityMenager extends SecurityManager{

	public DummySecurityMenager() throws DuplicateRecognizerConfigurationException {
		super(null,null,null,null,null,null, null, null);
	}

	@Override
	public AccessControlList getACL(SecurityUser user)
			throws DataBackendException, UnknownEntityException {
		return new AccessControlList() {
			
			public boolean isSuperUser() {
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
			
			public boolean hasPermission(String permissionName, GroupSet groupset) {
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
			
			public boolean hasPermission(Permission permission, GroupSet groupset) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean hasPermission(Permission permission, Group group) {
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

	@Override
	public AccessControlList getRealUserACL(SecurityUser user)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<SecurityUser, AccessControlList> getACLByPermission(
			Permission permission) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<SecurityUser, AccessControlList> getACLByRole(Role role)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<SecurityUser, AccessControlList> getACLByGroup(Group group)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void grant(SecurityUser user, Group group, Role role)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grant(SecurityUser user, Group group, RoleSet roleSet,
			boolean equals) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revoke(SecurityUser user, Group group, Role role)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revoke(SecurityUser user, Group group, RoleSet roleSet)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revokeAll(SecurityUser user) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grant(Role role, Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grant(Role role, PermissionSet permissionSet, boolean equals)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revoke(Role role, Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revoke(Role role, PermissionSet permissionSet)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revokeAll(Role role) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Group getGlobalGroup() throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group createGroup(String name) throws EntityExistsException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission createPermission(String name)
			throws EntityExistsException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role createRole(String name) throws EntityExistsException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group getGroupByName(String groupName) throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group getGroupById(int groupId) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleByName(String roleName) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleSet getRolesByPermission(Permission permission)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionSet getPermissionsByRole(Role role)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(int roleId) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission getPermissionByName(String permissionName)
			throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission getPermissionById(int permissionId)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupSet getAllGroups() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleSet getAllRoles() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionSet getAllPermissions() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserSet getAllUsers() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGroup(Group group) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveRole(Role role) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUser(SecurityUser user) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException,
			InvalidLoginName {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void savePermission(Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeGroup(Group group) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRole(Role role) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePermission(Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userExists(String login) throws DataBackendException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SecurityUser createAccount(String login, String firstName,
			String lastName, String password) throws InvalidLoginName,
			EntityExistsException, InvalidPassword,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAccount(SecurityUser account)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SecurityUser getUserByName(String login)
			throws UnknownEntityException, DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SecurityUser getAnonymousAccount() throws UnknownEntityException, DataBackendException {
		return new SecurityUser() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public SecurityUser clone()  {
				return null;
			}
			
			public int compareTo(SecurityEntity arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public void setDescription(String desc) {
				// TODO Auto-generated method stub
				
			}
			
			public boolean isDefined() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Integer getId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void updateLastLogin() {
				// TODO Auto-generated method stub
				
			}
			
			public void updateLastAccessDate() {
				// TODO Auto-generated method stub
				
			}
			
			public void setUserGroup(Group group) {
				// TODO Auto-generated method stub
				
			}
			
			public void setTemp(String name, Object value) {
				// TODO Auto-generated method stub
				
			}
			
			public void setPerm(String name, Serializable value) {
				// TODO Auto-generated method stub
				
			}
			
			public void setName(String login) {
				// TODO Auto-generated method stub
				
			}
			
			public void setMaxInactiveInterval(int interval) {
				// TODO Auto-generated method stub
				
			}
			
			public void setLocked(boolean value) {
				// TODO Auto-generated method stub
				
			}
			
			public void setLastName(String lastName) {
				// TODO Auto-generated method stub
				
			}
			
			public void setFirstName(String firstName) {
				// TODO Auto-generated method stub
				
			}
			
			public void setEmail(String address) {
				// TODO Auto-generated method stub
				
			}
			
			public void setConfirmed(boolean value) {
				// TODO Auto-generated method stub
				
			}
			
			public void setConfirmValue(String value) {
				// TODO Auto-generated method stub
				
			}
			
			public void setAccessCounterForSession(int cnt) {
				// TODO Auto-generated method stub
				
			}
			
			public void setAccessCounter(long cnt) {
				// TODO Auto-generated method stub
				
			}
			
			public Object removeTemp(String name) {
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
			
			public Object getTemp(String name, Object def) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getTemp(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Collection<String> getPermKeys() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getPerm(String name, Object def) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getPerm(String name) {
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
		};
	}

	@Override
	public SecurityUser getSuperuserAccount() throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeUserPassword(SecurityUser account, String password)
			throws OperationNotSupportedException, DataBackendException,
			UnknownEntityException, InvalidPassword {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkUserPassword(SecurityUser account, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SecurityUser getUserById(int id) throws UnknownEntityException,
			DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserLastLogin(SecurityUser user)
			throws UnknownEntityException, DataBackendException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SecurityContext createSecurityContext(SecurityUser user,
			boolean authenticated) throws DataBackendException,
			UnknownEntityException {
		return null;
	}

	@Override
	public void userLoggedIn(SecurityContext context, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLoggedOut(SecurityContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<SecurityContext, HttpSession> getSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reload() {
		// TODO Auto-generated method stub
		
	}
//
//	private class DummySecurityContext extends SecurityContext {
//
//		DummySecurityContext(SecurityManager securityManager,
//				SecureMenuSystem securityMenuSystem, SecurityUser user,
//				boolean authenticated, AccessControlList acl) {
//			super(securityManager, securityMenuSystem, user, authenticated, acl);
//			// TODO Auto-generated constructor stub
//		}
//
//	
//		
//	}
//	
	
}
