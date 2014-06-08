package pl.waw.mizinski.mbi.security;

import org.objectledge.security.DataBackend;
import org.objectledge.security.exception.EntityExistsException;
import org.objectledge.security.object.Group;
import org.objectledge.security.object.Permission;
import org.objectledge.security.object.Role;
import org.objectledge.security.object.SecurityUser;
import org.objectledge.security.util.GroupSet;
import org.objectledge.security.util.PermissionSet;
import org.objectledge.security.util.RoleSet;
import org.objectledge.security.util.UserSet;

public class MockDataBackend implements DataBackend {

	public SecurityUser createAccount(String login, String firstName,
			String lastName, String password) {
		return null;
	}

	public void saveUser(SecurityUser user) {
	}

	public GroupSet getAllGroups() {
		return null;
	}

	public GroupSet getUserGroups(SecurityUser user) {
		return null;
	}

	public RoleSet getUserRoles(SecurityUser user, Group group) {
		return null;
	}

	public Permission getPermissionByName(String permissionName) {
		return null;
	}

	public Group getGroupByName(String groupName) {
		return null;
	}

	public SecurityUser getUserByName(String login) {
		return null;
	}

	public UserSet getAllUsers() {
		return null;
	}

	public SecurityUser getUserById(int id) {

		return null;
	}

	public RoleSet getAllRoles() {
		return null;
	}

	public PermissionSet getAllPermissions() {
		return null;
	}

	public Group getGroupById(int groupId) {
		return null;
	}

	public Permission getPermissionById(int permissionId) {
		return null;
	}

	public Role getRoleById(int roleId) {

		return null;
	}

	public Role getRoleByName(String roleName) {
		return null;
	}

	public void grant(Role role, Permission permission) {
	}

	public void grant(Role role, PermissionSet permissionSet, boolean equals) {
	}

	public void grant(SecurityUser user, Group group, Role role) {
	}

	public void grant(SecurityUser user, Group group, RoleSet roleSet,
			boolean equals) {
	}

	public void saveRole(Role role) {
	}

	public void savePermission(Permission permission) {
	}

	public void saveGroup(Group group) {
	}

	public void changeUserPassword(SecurityUser account, String password) {
	}

	public void removeAccount(SecurityUser account) {
	}

	public void removeGroup(Group group) {
	}

	public void removePermission(Permission permission) {
	}

	public void removeRole(Role role) {
	}

	public void revoke(SecurityUser user, Group group, Role role) {
	}

	public void revoke(Role role, Permission permission) {
	}

	public void revoke(Role role, PermissionSet permissionSet) {
	}

	public void revoke(SecurityUser user, Group group, RoleSet roleSet) {
	}

	public void revokeAll(SecurityUser user) {
	}

	public void revokeAll(Role role) {
	}

	public Group createGroup(String name) throws EntityExistsException {
		return null;
	}

	public Permission createPermission(String name) {
		return null;
	}

	public Role createRole(String name) {
		return null;
	}

	public PermissionSet getPermissionsByRole(Role role) {
		return null;
	}

	public void reload() {
	}

}
