package entity;

import entity.Roles;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Permissions.class)
public class Permissions_ { 

    public static volatile SingularAttribute<Permissions, Date> createdAt;
    public static volatile SingularAttribute<Permissions, String> description;
    public static volatile SingularAttribute<Permissions, Integer> id;
    public static volatile CollectionAttribute<Permissions, Roles> rolesCollection;
    public static volatile SingularAttribute<Permissions, String> namePermission;
    public static volatile SingularAttribute<Permissions, Date> updatedAt;

}