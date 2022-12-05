package entity;

import entity.Permissions;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Date> createdAt;
    public static volatile SingularAttribute<Roles, Permissions> permissionId;
    public static volatile SingularAttribute<Roles, String> nameRole;
    public static volatile SingularAttribute<Roles, String> description;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile CollectionAttribute<Roles, Users> usersCollection;
    public static volatile SingularAttribute<Roles, Date> updatedAt;

}