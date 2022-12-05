package entity;

import entity.Products;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Likes.class)
public class Likes_ { 

    public static volatile SingularAttribute<Likes, Date> createdAt;
    public static volatile SingularAttribute<Likes, Products> productId;
    public static volatile SingularAttribute<Likes, Integer> id;
    public static volatile SingularAttribute<Likes, Users> users;
    public static volatile SingularAttribute<Likes, Date> updatedAt;

}