package entity;

import entity.Carts;
import entity.Comments;
import entity.Likes;
import entity.Orders;
import entity.Payments;
import entity.Roles;
import entity.Wishlist;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> country;
    public static volatile SingularAttribute<Users, String> nameUser;
    public static volatile SingularAttribute<Users, String> address;
    public static volatile SingularAttribute<Users, Roles> roleId;
    public static volatile CollectionAttribute<Users, Wishlist> wishlistCollection;
    public static volatile CollectionAttribute<Users, Orders> ordersCollection;
    public static volatile CollectionAttribute<Users, Carts> cartsCollection;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, Date> createdAt;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> phoneNumber;
    public static volatile CollectionAttribute<Users, Payments> paymentsCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile CollectionAttribute<Users, Comments> commentsCollection;
    public static volatile CollectionAttribute<Users, Likes> likesCollection;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, Date> updatedAt;

}