package pl.waw.mizinski.mbi.security;

import org.objectledge.security.GroupNamingPolicy;
import org.objectledge.security.object.Group;
import org.objectledge.security.util.GroupSet;


public class DummyGroupNamingPolicy implements GroupNamingPolicy
{

    public GroupSet getAllGroups()
    {
        return new GroupSet();
    }

    public GroupSet getSubGroups(final Group root)
    {
        return GroupSet.emptySet();
    }
}
