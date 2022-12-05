package entity;

import entity.Products;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Carts.class)
public class Carts_ { 

    public static volatile SingularAttribute<Carts, Date> createdAt;
    public static volatile SingularAttribute<Carts, Integer> total;
    public static volatile SingularAttribute<Carts, Integer> quantity;
    public static volatile SingularAttribute<Carts, Products> productId;
    public static volatile SingularAttribute<Carts, Integer> price;
    public static volatile SingularAttribute<Carts, Integer> id;
    public static volatile SingularAttribute<Carts, Users> users;
    public static volatile SingularAttribute<Carts, Date> updatedAt;

}