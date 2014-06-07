package pl.waw.mizinski.mbi.security;

import org.objectledge.security.DataBackend;
import org.objectledge.security.exception.DataBackendException;
import org.objectledge.security.exception.EntityExistsException;
import org.objectledge.security.exception.OperationNotSupportedException;
import org.objectledge.security.exception.UnknownEntityException;
import org.objectledge.security.object.Group;
import org.objectledge.security.object.Permission;
import org.objectledge.security.object.Role;
import org.objectledge.security.object.SecurityUser;
import org.objectledge.security.util.GroupSet;
import org.objectledge.security.util.PermissionSet;
import org.objectledge.security.util.RoleSet;
import org.objectledge.security.util.UserSet;

public class MockDataBackend implements DataBackend{

	public SecurityUser createAccount(String login, String firstName,
			String lastName, String password) throws EntityExistsException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(SecurityUser user) throws DataBackendException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public GroupSet getAllGroups() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public GroupSet getUserGroups(SecurityUser user)
			throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleSet getUserRoles(SecurityUser user, Group group)
			throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public Permission getPermissionByName(String permissionName)
			throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public Group getGroupByName(String groupName) throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public SecurityUser getUserByName(String login) throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserSet getAllUsers() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public SecurityUser getUserById(int id) throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleSet getAllRoles() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public PermissionSet getAllPermissions() throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public Group getGroupById(int groupId) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	public Permission getPermissionById(int permissionId)
			throws DataBackendException, UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	public Role getRoleById(int roleId) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	public Role getRoleByName(String roleName) throws DataBackendException,
			UnknownEntityException {
		// TODO Auto-generated method stub
		return null;
	}

	public void grant(Role role, Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void grant(Role role, PermissionSet permissionSet, boolean equals)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void grant(SecurityUser user, Group group, Role role)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void grant(SecurityUser user, Group group, RoleSet roleSet,
			boolean equals) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void saveRole(Role role) throws DataBackendException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void savePermission(Permission permission)
			throws DataBackendException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void saveGroup(Group group) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void changeUserPassword(SecurityUser account, String password)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void removeAccount(SecurityUser account)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void removeGroup(Group group) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void removePermission(Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void removeRole(Role role) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void revoke(SecurityUser user, Group group, Role role)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void revoke(Role role, Permission permission)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void revoke(Role role, PermissionSet permissionSet)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void revoke(SecurityUser user, Group group, RoleSet roleSet)
			throws DataBackendException, UnknownEntityException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void revokeAll(SecurityUser user) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public void revokeAll(Role role) throws DataBackendException,
			UnknownEntityException, OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	public Group createGroup(String name) throws EntityExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	public Permission createPermission(String name)
			throws EntityExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	public Role createRole(String name) throws EntityExistsException,
			OperationNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	public PermissionSet getPermissionsByRole(Role role)
			throws DataBackendException {
		// TODO Auto-generated method stub
		return null;
	}

	public void reload() {
		// TODO Auto-generated method stub
		
	}

}
